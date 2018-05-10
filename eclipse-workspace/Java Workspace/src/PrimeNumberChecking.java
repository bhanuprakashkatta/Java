
public class PrimeNumberChecking {

	public PrimeNumberChecking() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String name="borroworrob";
	String reverse="";
	
	for (int i=name.length();i>0;i--)
	{
		char ch= name.charAt(i-1);
		reverse= reverse+ch;
		
	}
	if (name.equals(reverse))
	{
		System.out.println("polindrome");
	}
	else
	{
		System.out.println("Not polindrome");
	}
	}

	
}
