package PRK_4;

import java.util.Scanner;

public class Prk_4_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double input = 0;
		
		while(true) {
			System.out.println("enter temperature: ");
			input = s.nextDouble();
			System.out.println("Fahrenheit or Celsius? [0/1]");
			if (s.nextInt() == 0) {
				fahrenheitToCelsius(input);
			}else {
				celsiusToFahrenheit(input);
			}
						
			System.out.println("new conversion? [j/n]");
			if(s.next().equals("j")) {
				continue;
			}else {
				break;
			}
			}
	}
	
	public static void celsiusToFahrenheit(double temp) {
		System.out.println(temp + " degree celsius = " + (temp*9/5+32) + " degree fahrenheit.");
	}
	
	public static void fahrenheitToCelsius(double temp) {
		System.out.println(temp + " degree fahrenheit = "  +(temp-32)*5/9+ " degree celsius.");
	}
}