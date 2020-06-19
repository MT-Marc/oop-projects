package PRK_4;

import java.util.Scanner;

public class Prk_4_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("calculate facorial of: ");
		int input = s.nextInt();
		if(input == 0) {
			System.out.println("Error!");
		}else {	
		System.out.println(input+"! = " + calculateFactorial(input));
		System.out.println(input+"! = " + factorialRecursive(input));
		}
	}
	
	public static int calculateFactorial(int zahl) {
		int fakultaet = 1; 
		for (int i = 1; i <= zahl; ++i) {
			fakultaet *= i;
		}
		return fakultaet;
	}
	
	public static int factorialRecursive(int num) {
		return num > 1 ? num * factorialRecursive(num-1) : 1;		
	}
}