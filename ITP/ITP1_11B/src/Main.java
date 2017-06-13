import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] diceNum = new int[6];

		for (int i = 0; i < diceNum.length; i++) {
			diceNum[i] = sc.nextInt();
		}

		Dice dice = new Dice(diceNum);
		int q = sc.nextInt();
		int top;
		int front;
		
		for (int i = 0; i < q; i++) {
			
			top = dice.getLabelByFaceNumber(sc.nextInt());
			front = dice.getLabelByFaceNumber(sc.nextInt());
			
			dice.setTop(front);
			dice.rotate('S');
			// 反対側のラベルは指定されないので前後面は変わらない
			dice.setTop(top);
			
			System.out.println(dice.getFaceNumber(3));
		}

		sc.close();
	}

	// サイコロのクラス
	static class Dice {
		// ラベルとその値とを関連付ける
		private Map<Integer, Integer> diceMap = new HashMap<>();
		// ラベルとデフォルト位置を関連付ける
		private Map<Integer, Integer> diceFaceDirection = new HashMap<>();
		// 面の数
		private int DICE_FACE = 6;
		// Map用キー兼ラベル．添字と一致させるため1つ多く
		private Integer[] diceIden = new Integer[DICE_FACE + 1];

		Dice(int[] diceNum) {
			for (int i = 0; i < DICE_FACE; i++) {
				diceIden[i + 1] = i + 1;
				diceMap.put(diceIden[i + 1], diceNum[i]);
				diceFaceDirection.put(diceIden[i + 1], diceIden[i + 1]);
			}
		}

		// 指定された方向へ回転
		void rotate(char direction) {
			Integer temp;
			switch (direction) {
				case 'N':
					temp = diceFaceDirection.get(diceIden[1]);
					diceFaceDirection.replace(diceIden[1], diceFaceDirection.get(diceIden[2]));
					diceFaceDirection.replace(diceIden[2], diceFaceDirection.get(diceIden[6]));
					diceFaceDirection.replace(diceIden[6], diceFaceDirection.get(diceIden[5]));
					diceFaceDirection.replace(diceIden[5], temp);
					break;
				case 'S':
					temp = diceFaceDirection.get(diceIden[1]);
					diceFaceDirection.replace(diceIden[1], diceFaceDirection.get(diceIden[5]));
					diceFaceDirection.replace(diceIden[5], diceFaceDirection.get(diceIden[6]));
					diceFaceDirection.replace(diceIden[6], diceFaceDirection.get(diceIden[2]));
					diceFaceDirection.replace(diceIden[2], temp);
					break;
				case 'W':
					temp = diceFaceDirection.get(diceIden[1]);
					diceFaceDirection.replace(diceIden[1], diceFaceDirection.get(diceIden[3]));
					diceFaceDirection.replace(diceIden[3], diceFaceDirection.get(diceIden[6]));
					diceFaceDirection.replace(diceIden[6], diceFaceDirection.get(diceIden[4]));
					diceFaceDirection.replace(diceIden[4], temp);
					break;
				case 'E':
					temp = diceFaceDirection.get(diceIden[1]);
					diceFaceDirection.replace(diceIden[1], diceFaceDirection.get(diceIden[4]));
					diceFaceDirection.replace(diceIden[4], diceFaceDirection.get(diceIden[6]));
					diceFaceDirection.replace(diceIden[6], diceFaceDirection.get(diceIden[3]));
					diceFaceDirection.replace(diceIden[3], temp);
					break;
			}
		}

		// デフォルト位置からその面の値を返す
		Integer getFaceNumber(int iden) {
			return diceMap.get(diceFaceDirection.get(diceIden[iden]));
		}
		
		// デフォルト位置からラベルを返す
		Integer getLabel(int iden) {
			return diceFaceDirection.get(diceIden[iden]);
		}
		
		// 面の値からラベルを返す
		Integer getLabelByFaceNumber(int num) {
			int label = 1;
			while (diceMap.get(diceIden[label]) != num) {
				label++;
				if (label > 6) return -1;
			}
			return label;
		}
		
		// 上面をtopのラベルにする．前後面はそこに対象ラベルがあるときだけ
		void setTop(int top) {
			Integer temp = this.getLabel(2);
			// 前後面なら
			if (top == temp.intValue() || top == 7 - temp.intValue()) {
				while (top != (this.getLabel(1)).intValue()) {
					this.rotate('N');
				}
			} else {
				while (top != (this.getLabel(1)).intValue()) {
					this.rotate('E');
				}
			}
		}
	}
}
