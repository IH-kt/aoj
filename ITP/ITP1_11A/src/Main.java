import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] diceNum = new int[6];

		for (int i = 0; i < diceNum.length; i++) {
			diceNum[i] = sc.nextInt();
		}

		Dice dice = new Dice(diceNum);
		
		String inputRD = sc.next();
		
		for (int i = 0; i < inputRD.length(); i++) {
			dice.rotate(inputRD.charAt(i));
		}
		
		System.out.println(dice.getFaceNumber(1));

		sc.close();
	}

	static class Dice {
		// デフォルト面とその値とを関連付ける
		private Map<Integer, Integer> diceMap = new HashMap<>();
		// デフォルト面と変更後の面とを関連付ける
		private Map<Integer, Integer> diceFaceDirection = new HashMap<>();
		// 面の数
		private int DICE_FACE = 6;
		// 面を表す数．添字と一致させるため1つ多く
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

		// デフォルト位置での面を表す数からその値を返す
		Integer getFaceNumber(int iden) {
			return diceMap.get(diceFaceDirection.get(diceIden[iden]));
		}
	}
}
