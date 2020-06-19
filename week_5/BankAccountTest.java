package PRK_5;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(123456789, 0);
		
		a1.deposit(123.53);
		System.out.println(a1);
		a1.withdraw(24.99);
		System.out.println(a1);

	}

}
