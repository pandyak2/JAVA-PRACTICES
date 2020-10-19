package learn;

import java.util.Scanner;
import java.util.*;

public class DuplicateWords {
public static void main(String args[])
{
	String ip = " ";
	Scanner sn = new Scanner(System.in);
	ip = sn.nextLine();
	String [] iparr = ip.split(" ");
	Set<String> ms = new LinkedHashSet<String>();
	for(String x : iparr)
	{
		ms.add(x);
	}
	Iterator itr = ms.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
}
}
