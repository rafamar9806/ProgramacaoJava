public class Account{
	private String name;
	private double balance;

	public Account(String name, double balance){
		this.name = name;

		if(balance > 0.0){
			this.balance = balance;
		}
	}
	public void deposit(double depositAmount){
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	public void withdraw(double retirar){
		if (retirar > this.balance) {
			System.out.println("Valor de débito exedeu o saldo da conta");
		}
		else if(retirar < this.balance){
			double novoSaldo = balance - retirar;
			this.balance = novoSaldo;
	}
		}
		
	
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public static void displayAccount(Account accountToDisplay){
		String info = String.format("Nome: %s\tBalanço: %.2f", accountToDisplay.getName(), accountToDisplay.getBalance());
		System.out.println(info);
	}

}