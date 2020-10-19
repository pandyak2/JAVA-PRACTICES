package Section4;

public class NumberPalindrome {
	public static void isPalindrome(int number)
	{
		String ognum = Integer.toString(number);
		StringBuilder revnum = new StringBuilder();
		revnum.append(ognum);
		revnum = revnum.reverse();
		String ognumupdated = revnum.toString();
		if(ognum.contentEquals(ognumupdated))
			System.out.print("YES");
		else 
			System.out.print("NO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(1232112);
	}

}
