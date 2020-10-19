package HackerRank;
import java.util.*;

public class CompareLexico {
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        SortedSet<String> s1 = new TreeSet<String>();
	        for(int i=0 ; i <= s.length() - k ; i++)
	        {
	            s1.add((s.substring(i,i+k)));
	        }
	        smallest = s1.first();
	        largest = s1.last();
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}