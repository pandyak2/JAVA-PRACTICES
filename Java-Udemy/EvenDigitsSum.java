package Section4;

public class EvenDigitsSum {
	public static void evenDigitSum(int number)
	{
		int total = 0;
		if(number % 2 != 0 )
			System.out.println("Sorry");
		else
		{
			char[] numArr = String.valueOf(number).toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i =0; i < numArr.length ; i++)
			{
				if(numArr[i] % 2 == 0)
				{
					
					sb.append(numArr[i]);
				}
				else
					continue;
			}
			String updatedSum = sb.toString();
			int updatedArr = Integer.parseInt(updatedSum);
			System.out.println(updatedArr);
			
			while(updatedArr > 0)
			{
				total = total + (updatedArr % 10);
				updatedArr = updatedArr / 10;
			}
		}
		System.out.print(total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenDigitSum(24368);
	}

}
