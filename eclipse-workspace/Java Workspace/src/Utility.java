
public class Utility {

	public Utility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		Order order=null;
		order=customer.customerOrder("Laptop", 2, true);
		System.out.println("Order name "+order.productName);

	}

}
