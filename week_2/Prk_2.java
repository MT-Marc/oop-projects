import java.util.Scanner;

public class Prk_2 {

	public static void main(String[] args) {
		
		function1();
		function2();
	}
	
	static void function1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Please input first name:\t");
		String vorname = s.next();
		System.out.print("and last name:\t");
		String nachname = s.next();
		
		System.out.println("Hello " + vorname +  " " + nachname + "!");
	}
		
	static void function2(){
		Scanner s = new Scanner(System.in);
		int x, y, input, result;
		boolean loop = true;
		
		while(loop) {
		
		System.out.println("Enter two numbers: ");
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println("Add = 1, Subtract = 2, Multiply = 3, Divide = 4 \nx^y = 5, x! = 6, y! = 7");
		input = s.nextInt();
		
		switch (input) {
		case 1: {
			//ADD
			result = x + y;
			break;
		}
		case 2: {
			//SUB
			result = x - y;
			break;
		}
		case 3: {
			//MUL
			result = x * y;
			break;
		}
		case 4: {
			//DIV
			result = x / y;
			break;
		}
		case 5: {
			//X^Y
			result = (int) Math.pow(x, y);
			break;
		}
		case 6: {
			//X!
			result = Faculty(x);
			break;
		}
		case 7: {
			//Y!
			result = Faculty(y);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
		System.out.println(result + "\nNew Calculation? Yes = 1, No = 0");
		
		if (!(s.nextInt() == 1)) {
			loop = false;
		}
		
		}	
	}
	static int Faculty(int x) {
		return x == 0 ? 1 : x * Faculty( x - 1 );
	}
	
}
