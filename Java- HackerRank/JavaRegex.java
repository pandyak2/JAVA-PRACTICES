package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
	private static boolean isIpAddress(String ip)
	{
		 String zt5 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		String validIP = zt5 + "\\." + zt5 + "\\." + zt5 + "\\." + zt5;
		Pattern p = Pattern.compile(validIP);
		Matcher m;
		if(ip == null)
			return false;
		else
			m = p.matcher(ip);
			return m.matches();
		
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		JavaRegex jx ;
		String ip = sn.nextLine();
		System.out.printf("%20s is a %b%n", ip, JavaRegex.isIpAddress(ip));

	}

}
