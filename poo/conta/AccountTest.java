public class AccountTest{
	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("john Blue", -7.53);

		account2.deposit(100);
		account1.withdraw(500);

		Account.displayAccount(account1);
		Account.displayAccount(account2);

		
	}
}