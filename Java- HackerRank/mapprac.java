package HackerRank;

import java.util.HashSet;
import java.util.*;

public class mapprac {
	public static int mapprac(int[] A)
	{
		int n = A.length;
		Set<Integer> sm = new HashSet<>();
		for(int a =0; a < n ; a++)
		{
			sm.add(A[a]);
		}
		for(int i =1 ; i <= n ; i++ )
		{
			if(!sm.contains(i))
				System.out.print(i);;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1,2,4,5};
		mapprac(A);
		
	}

}
