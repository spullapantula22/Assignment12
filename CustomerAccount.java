
public class CustomerAccount {
	
	private String name;
	private int accNo;
	private double balance;
	
	public CustomerAccount(String name, int accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit (double amount) {
		
		if(amount < 0) return false;
		
		else {
			
			balance += amount;
		}
		return true;
	}
	
	public boolean withdraw(double amount) {
		
		if(amount < 0 || amount > balance) {
			
			return false;
		}
		
		if(amount > balance) {
			
			System.out.println("Insufficient balance.");
			return false;
		}
		
		else if((balance - amount) < 100) {
			
			System.out.println("Less than $100.");
			return false;
		}
		
		else {
			
			balance -= amount;
		}
		return true;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public String toString() {
		
		return this.name + ", " + this.accNo + ", " + this.balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerAccount c = new CustomerAccount("Customer1", 1001010, 600);
		
		System.out.println(c.withdraw(900));
	}

}
