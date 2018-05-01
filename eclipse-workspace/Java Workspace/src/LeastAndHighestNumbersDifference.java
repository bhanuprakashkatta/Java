
public class LeastAndHighestNumbersDifference {

	
	static int a[]= {10,12,2,6};
	public LeastAndHighestNumbersDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Given Numbers "+a[0]+","+a[1]+","+a[2]+","+a[3]);
		difference();
		
	}

	private static void difference() {
		// TODO Auto-generated method stub
		int highValue =a[0];
		int lowestValue= a[0];
		int total;
		for (int i=1; i<a.length;i++) 
		{
			if (a[i]>highValue)
			{
				highValue=a[i];
			}
			if (a[i]<lowestValue) {
				lowestValue=a[i];
			}
			}
		System.out.println("highest value is "+highValue+" lowest value "+lowestValue);
		total=highValue-lowestValue;
		System.out.println("Difference is "+total);
						}
			
	}

