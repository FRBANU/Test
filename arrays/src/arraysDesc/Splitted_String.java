package arraysDesc;

public class Splitted_String {

	public static void main(String[] args) {
		
		String s = "ARIF  RAMISA  JUI";
		System.out.println(s);
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		// Print all the characters
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Print all the characters in the reverse order
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
