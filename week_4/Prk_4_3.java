package PRK_4;

import java.util.Scanner;

public class Prk_4_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] grades = new int[5];
		
		for (int i = 1; i < 6; i++) {
			System.out.println("enter your " + i + ". grade.");
			grades[i-1] = s.nextInt();
		}
		
		System.out.println("entered grades:\t");
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + "\t");
		}
		
		System.out.println("\naverage: " + averageResult(grades));
		System.out.println("best grade: " + bestResult(grades));
		System.out.println("number of failed: " + numberOfFailed(grades));
	}
	
	public static int averageResult(int[] grades) {
		int avg = 0;
		for (int i = 0; i < grades.length; i++) {
			avg += grades[i];
		}
		return avg/5;
	}
	
	public static int bestResult(int[] grades) {
		int best = 0;
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] > best) {
				best = grades[i];
			}
		}
		return best;
	}
	
	public static int numberOfFailed(int[] grades) {
		int failed = 0;
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 50) {
				failed++;
			}
		}
		return failed;
	}
}