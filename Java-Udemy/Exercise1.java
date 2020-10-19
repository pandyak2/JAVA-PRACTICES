package Section4;

public class Exercise1 {
	public static long toMilesPerHour(double kmPerHours)
	{
		if(kmPerHours < 0 )
			return -1;
		long cal = (long)Math.round( (kmPerHours / 1.609));
		
		return cal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toMilesPerHour(21342);
	}

}
