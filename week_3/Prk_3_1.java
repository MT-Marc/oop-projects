package PRK_3;
public class Prk_3_1 {

	public static void main(String[] args) {
		int dice;
		int num = 1;
		while(true) {
			dice = (int) ((Math.random() * 6 + 1));
			
			System.out.println("number of try: " + num + " result: " + dice);
			if(dice == 6) {
				break;
			}
			num++;
		}
	}
}
