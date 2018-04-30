import java.util.Scanner;

public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPrimeNumber(int number){
        if(number==1||number==0)
        {
        	return false;
        }
        else {
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
        
       //Returning True
    }}
     
    public static void main(String a[]){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number to check Whether it is prime or not");
    	int a1=sc.nextInt();
    	PrimeNumber pn = new PrimeNumber();
        System.out.println("Is "+a1+" prime number? "+pn.isPrimeNumber(a1));
        
    }
}
