package HackerRank;
import java.util.*;
public class HashMap1 {
	public static void main(String args[])
	{
	Map<Character, Integer> mp = new HashMap<>();
	Scanner sn = new Scanner(System.in);
	String S = sn.nextLine();
	char[] ch = S.toCharArray();
	for(int i = 0; i < S.length() ; i++)
	{
		char c = S.charAt(i);
		if(mp.containsKey(c))
		{
			mp.put(c, mp.get(c) + 1);
		}
		else
		{
			mp.put(c,  1);
		}
	}
	Set<Map.Entry<Character, Integer>> numSet = mp.entrySet();
    for(Map.Entry<Character, Integer> m : numSet){
      System.out.println(m.getKey() + " - " + m.getValue());
			
	}
}
}
