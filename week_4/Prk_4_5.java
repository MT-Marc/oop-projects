package PRK_4_;

import java.util.Random;

public class Prk_4_5 {

	static int[] grades = new int[100];
	static int[] doppelteZahlen = new int[50];
	
	public static void main(String[] args) {
		
		initArray();
		
		printArray(grades);
		
		System.out.println("highest: " + maxWert());
		System.out.println("lowest: " + minWert());
		System.out.println("average: " + midWert());
		
		searchDouble();
		
		System.out.println("evaluation:");
		printArray(doppelteZahlen);
		
		System.out.println("first double number: " + indexFirstDouble(grades));
	}
	
	static int indexFirstDouble(int[] arr) {
		int[] array = arr;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					return i;
				}
			}
		}
		return -1;
	}

	static void searchDouble() {
		for (int i = 1; i < doppelteZahlen.length; i++) {
			for (int j = 0; j < grades.length; j++) {
				if (grades[j] == i) {
					doppelteZahlen[i-1]++;
				}
			}
		}
	}

	static double midWert() {
		double mid = 0;
		
		for (int i = 0; i < grades.length; i++) {
			mid += grades[i];
		}
		return mid/grades.length;
	}

	static int minWert() {
		int min = 49;
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i]<min) {
				min = grades[i];
			}
		}
		return min;
	}

	static int maxWert() {
		int max = 1;
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i]>max) {
				max = grades[i];
			}
		}
		return max;
	}

	static void printArray(int[] arr) {
		int[] array = arr;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");		
	}

	static void initArray() {
		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) ((Math.random() * 49 + 1));
		}
	}
}
