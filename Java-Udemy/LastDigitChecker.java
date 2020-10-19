package Section4;

public class LastDigitChecker {
	public static void hasSameLastDigit(int n1,int n2,int n3)
	{
		String num1 = Integer.toString(n1);
		String num2 = Integer.toString(n2);
		String num3 = Integer.toString(n3);
		System.out.println(num1.charAt(num1.length() - 1));
		if((num1.charAt(num1.length() - 1) == num2.charAt(num2.length() - 1)) || 
				(num1.charAt(num1.length() - 1) == num3.charAt(num3.length() - 1)) ||
				(num2.charAt(num2.length() - 1) == num3.charAt(num3.length() - 1)))
				System.out.println("Valid");
		else
			System.out.println("Invalid");
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasSameLastDigit(12,21,31);
	}

}

//((num1.charAt(num1.length() - 1) == num2.charAt(num2.length() - 1)) || 
//(num1.charAt(num1.length() - 1) == num2.charAt(num2.length() - 1)) ||
//(num2.charAt(num2.length() - 1) == num3.charAt(num3.length() - 1)))
