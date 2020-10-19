package HackerRank;

import java.util.Scanner;

public class JavaToken {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        String[] words = s.split("[^a-zA-Z]+"); 
	        System.out.println("" + words.length);
	        for(int i=0; i <= s.length() + 1   ; i++)
	        System.out.println("" + words[i]);
	    }

}
