package PRK_3;


import java.util.Scanner;

public class Prk_3_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double amount;
		double interestRate;
		double interestIncome;
		System.out.println("input amount: ");
		amount = s.nextDouble();
		System.out.println("input interest rate: ");
		interestRate = s.nextDouble();
		
		for (int i = 0; i < 5; i++) {
			interestIncome = amount*interestRate/100;
			amount += interestIncome;
			//System.out.println("year " + i + " interest rate: " + round(interest rate,2) + " balance: " + round(amount,2));
			System.out.print("year " + i + "\t");
			System.out.printf("interest income: %1.2f",interestIncome);
			System.out.printf("\tbalance: %1.2f", amount);
			System.out.println();
		
		}
	}
	/*
	private static double round(double value, int decimalPoints) {
	      double d = Math.pow(10, decimalPoints);
	      return Math.round(value * d) / d;
	   }
	*/
}
