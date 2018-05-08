
public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Order customerOrder(String productName, int quantity, boolean orderType) {
		Order order=null;
		if (orderType) {
			order=new SpecialOrder();
			order.productName= "Special"+productName;
			
		}
		else
		{
			order=new Order();
			order.productName=productName;
			
		}
		order.quantity=quantity;
		order.orderType=orderType;
		
		return order; 
		
	}
	
}
