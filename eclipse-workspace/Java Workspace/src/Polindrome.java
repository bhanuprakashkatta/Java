public class Polindrome {

	public Polindrome() {
		// TODO Auto-generated constructor stub
	}

	static	String name="borrow or Rob";
	static String original="";
	static String reverse="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println    ("Given String is----------> "+name);
		originalWordSpacesChangingMethod(name);
		reverseChangingMethod(name);
		
		
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println("--Entered string is polindrome--");
		}
		else
			System.out.println("---Entered string is not polindrome---");

	}

	
		

	private static void originalWordSpacesChangingMethod(String name) {
		// TODO Auto-generated method stub
		
		for(int j=0; j<name.length();j++) {
			char temp=name.charAt(j);
			if (temp==' ') {
				continue;
			}
			original=original.concat(String.valueOf(temp));			
		}
		
	}

	private static void reverseChangingMethod(String name) {
		// TODO Auto-generated method stub
		
		for(int i=name.length(); i>0;i--)
		{
			char temp=name.charAt(i-1);
			if(temp==' ')
			{
				continue;
			}
			reverse=reverse.concat(String.valueOf(temp));
		}
		System.out.println     ("Reversed string is--------> "+reverse);
		
	}

	

}
