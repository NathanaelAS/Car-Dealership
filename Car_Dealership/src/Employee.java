
public class Employee {
	private String name;
	private int ratingOutOf5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRatingOutOf5() {
		return ratingOutOf5;
	}
	public void setRatingOutOf5(int ratingOutOf5) {
		this.ratingOutOf5 = ratingOutOf5;
	}
	
	public void handleCustomer(Customer c, Vehicle v, boolean finance) {
		System.out.println("Hello, "+c.getName()+". I see you are interested in the "+v+".");
		
		if(finance) {
			runCreditHistory(c, v.getPrice()-c.getCashOnHand());
		}
		else if(v.getPrice()<=c.getCashOnHand()) {
//			pays with cash on hand
			processTransaction(c, v);
		}
		else {
			System.out.println("I'm sorry sir, but you will need to bring back more money to purchase this car.");
		}
	}
	
	public void runCreditHistory(Customer c, double loanAmount) {
		if(c.isCreditHistory()) {
			System.out.println("Your credit seems to be in good shape.");
			System.out.println("You can finance this with us and we will give you a loan of $"+loanAmount+" over 2 years");
			System.out.println("That comes out to be $"+Math.round((loanAmount-500.0)/24.0)+" per month for 24 months. And your down payment for today will be only $500. Thank you.");
			c.setCashOnHand(c.getCashOnHand()-500);
		}
	}
	
	public void processTransaction(Customer c, Vehicle v) {
		System.out.println("Ok, perfect. That comes out to be $"+v.getPrice());
		c.setCashOnHand(c.getCashOnHand()-v.getPrice());
		System.out.println("Thank you for your purchase. You now have $"+c.getCashOnHand()+" left in your account");
	}
}
