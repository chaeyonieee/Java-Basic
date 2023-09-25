package chap10;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("deposit: "+account.getBalance());
		try {
			account.withdraw(30000);
			
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println();
			System.out.println();
			e.printStackTrace();
		}

	}

}