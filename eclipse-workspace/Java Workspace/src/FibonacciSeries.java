import java.util.Scanner;

public class FibonacciSeries {
	static int number1=0;
	static int number2=1;
	public FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Upto which number to print fibonacci series");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(number1+","+number2);
		fibonacciMethod(number);

	}

	private static void  fibonacciMethod(int number) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=number;i++)
		{
				int number3=number1+number2;
				if (number3<=number)
				{
			System.out.println(number3);
			number1=number2;
			number2=number3;
				}
			/*int number4=number1+number2;
			System.out.println(number4);
			number2=number4;*/
			
		}
	}

}
