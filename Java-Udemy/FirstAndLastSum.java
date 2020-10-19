package Section4;

public class FirstAndLastSum {
	public static int sumFirstAndLastDigit(int number)
	{
		if(number < 0 )
			return -1;
		else if(number > 0 && number <= 9)
			System.out.println(number * 2);
		else
		{
			int lastDigit = number % 10;
			int firstDigit=0;
			System.out.println(lastDigit);
			int counter = Integer.toString(number).length();
			
			while(counter != 1)
			{
				number = number / 10;
				System.out.println(number);
				firstDigit = number;
				counter --;
			}
			
			int total = lastDigit + firstDigit;
			System.out.print(total);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumFirstAndLastDigit(9);
	}

}
