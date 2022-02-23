package ExceptionHandling_Assignment;
import java.util.Scanner;


class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String message) {
		super(message);
	}
}
public class Assignment4Q3 {
	double balance = 2000;

	void withdraw(double amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("Amount is greater than acc. balance");

		}
	}

	void deposit(double amount) throws IllegalBankTransactionException {
		if (amount < 0) {
			throw new IllegalBankTransactionException("Amount cannot be negative");
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Assignment4Q3 a = new Assignment4Q3();

		System.out.println("Enter amount to be withdraw");
		double amount = s.nextInt();
		a.withdraw(amount);
		a.deposit(amount);
		s.close();

	}

}