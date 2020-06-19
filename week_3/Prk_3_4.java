package PRK_3;

public class Prk_3_4 {

	public static void main(String[] args) {
		int dice;
		int[] num = new int[6];
		int i = 0;
		
		while(i<10000) {
			dice = (int) ((Math.random() * 6 + 1));
			
			switch (dice) {
			case 1: {
				num[0]++;
				i++;
				break;
			}case 2: {
				num[1]++;
				i++;
				break;
			}case 3: {
				num[2]++;
				i++;
				break;
			}case 4: {
				num[3]++;
				i++;
				break;
			}case 5: {
				num[4]++;
				i++;
				break;
			}case 6: {
				num[5]++;
				i++;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + dice);
			}
		}
		
		for (int j = 1; j < 7; j++) {
			System.out.println("amount " + j + " : " + num[j-1]);
		}
	}
}
