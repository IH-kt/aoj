import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diceNum = 2;
		int[][] diceFaceNum = new int[diceNum][6];

		for (int i = 0; i < diceNum; i++) {
			for (int j = 0; j < diceFaceNum[i].length; j++) {
				diceFaceNum[i][j] = sc.nextInt();
			}
		}

		Dice[] dice = new Dice[diceNum];
		
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Dice(diceFaceNum[i]);
		}
         
        if (dice[0].equals(dice[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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
                case 'L':
                    this.rotate('N');
                    this.rotate('W');
                    this.rotate('S');
                    break;
                case 'R':
                    this.rotate('N');
                    this.rotate('E');
                    this.rotate('S');
                    break;
			}
		}

		// デフォルト位置からその値を返す
		Integer getFaceNumber(int iden) {
			return diceMap.get(diceFaceDirection.get(diceIden[iden]));
		}
		
		// デフォルト位置からラベルを返す
		Integer getLabel(int iden) {
			return diceFaceDirection.get(diceIden[iden]);
		}
		
		// 上面をtopのラベルにする．前後面はそこに対象ラベルがあるときだけ
		void setTop(int top) {
			Integer temp = this.getLabel(2);
			// 前後面なら
			if (top == temp.intValue() || top == 7 - temp.intValue()) {
				while (!(top == (this.getLabel(1)).intValue())) {
					this.rotate('N');
				}
			} else {
				while (!(top == (this.getLabel(1)).intValue())) {
					this.rotate('E');
				}
			}
		}
		
		boolean equals(Dice compDice) {
            int label = 1;
            // 上下面を揃える
            while (this.getFaceNumber(1) != compDice.getFaceNumber(label)
                || this.getFaceNumber(6) != compDice.getFaceNumber(7-label)) {
                label++;
                // 揃わない
                if (label > 6) {
                    return false;
                }
            }
            compDice.setTop(label);
            
            // 左に回して一致するか
            for (int i = 0; i < 4; i++) {
                int j;
                for (j = 2; j < 6; j++) {
                    if (this.getFaceNumber(j) != compDice.getFaceNumber(j)) break;
                }
                
                if (j == 6) return true;
                compDice.rotate('L');
            }
            
            return false;
        }
	}
}
