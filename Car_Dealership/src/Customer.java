
public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	private boolean creditHistory;
	private boolean willingToFinance;
	
	
	public boolean isWillingToFinance() {
		return willingToFinance;
	}

	public void setWillingToFinance(boolean willingToFinance) {
		this.willingToFinance = willingToFinance;
	}

	public boolean isCreditHistory() {
		return creditHistory;
	}

	public void setCreditHistory(boolean creditHistory) {
		this.creditHistory = creditHistory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address+=" Canton, GA 30115";
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, vehicle, finance);
	}
}
