package advanced.lesson8;

public class BankAccount {
	private int money;
	
	public BankAccount(int money) {
		this.money = money;
	}
	
	public void sendTransfer(int amount) {
		if (money < amount) {
			throw new NotEnoughFundsException("Lack of money in your account.");
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
