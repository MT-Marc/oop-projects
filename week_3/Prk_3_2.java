package PRK_3;

import java.util.Scanner;

public class Prk_3_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double temp;
		
		while(true) {
		System.out.println("enter Fahrenheit: ");
		temp = s.nextDouble();
		System.out.println(temp + " Fahrenheit = " + ((temp-32)*5/9) + " degree Celsius.");
		System.out.println("new calculation? [j/n]");
		if(s.next().equals("j")) {
			continue;
		}else {
			break;
		}
		}
	}
}
