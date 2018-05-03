
public class FibonacciSeries {
	static int number1=0;
	static int number2=1;
	public FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(number1+","+number2);
		fibonacciMethod();

	}

	private static void  fibonacciMethod() {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=10;i++)
		{
				int number3=number1+number2;
			System.out.println(number3);
			number1=number2;
			number2=number3;
			/*int number4=number1+number2;
			System.out.println(number4);
			number2=number4;*/
			
		}
	}

}
