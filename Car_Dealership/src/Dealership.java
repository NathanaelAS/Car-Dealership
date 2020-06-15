
public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1=new Customer();
		cust1.setName("Luke");
		cust1.setAddress("123 Frosty Hwy");
		cust1.setCreditHistory(true);
		cust1.setCashOnHand(15000);
		cust1.setWillingToFinance(true);
		
		
		Employee emp= new Employee();
		emp.setName("Nate");
		emp.setRatingOutOf5(4);
		
		
		Vehicle car1=new Vehicle();
		car1.setYear(2006);
		car1.setMake("Kia");
		car1.setModel("Sorento");
		car1.setPrice(20000);
		
		
		
		Vehicle car2=new Vehicle();
		car2.setYear(2006);
		car2.setMake("Kia");
		car2.setModel("Sorento");
		car2.setPrice(20000);
		
		boolean areTheyEqual=car1.equals(car2);
		
		System.out.println(areTheyEqual);
		
		boolean finance=cust1.isWillingToFinance();
		
		cust1.purchaseCar(car1, emp, finance);
		
		
		
		
		/**
		 * 
		 * 
		 * handleCustomer(Customer customer, boolean finance, Vehicle vehicle)
		 *	if(finance)
		 *		runCreditHistory(Customer customer, double loanAmount)
		 *	else if(vehicle.getPrice()<=customer.getCashOnHand)
		 *		processTransaction(Customer customer, Vehicle vehicle)
		 * 	else
		 * 		Tell customer to bring more money
		 * 
		 * 
		 */
		
	}

}
