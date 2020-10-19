package Section4;

public class DigitSum {
	public static void sumDigits(int number)
	{
		int sum = 0;
		int total = 0;
		int counter = Integer.toString(number).length();
		System.out.println(counter);
		if(number >= 10)
		{
			while( counter > 0)
			{
			 sum = number % 10;
			 total += sum;
			 counter --;
			 number = number / 10 ;
			 
			 
			}
		}
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigits(125);
	}

}
