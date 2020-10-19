package codility;
import java.util.*;
public class codilitySmallestNum {
	public static int codilitySmallNum(int[] A) {
	
		 int smallest = 1;
		 
		 if(A.length == 0)
			 return 0;
		 
		 Arrays.sort(A);
		 
		 if(A[0] > 1 )
			 return smallest;
		 if( A[ A.length - 1]  <= 0 )
			 return smallest;
		 
		 for(int i=0; i < A.length ; i++)
		 {
			 if(A[i] == smallest)
				 smallest++;
		 }
		 System.out.print(smallest);
		 return smallest;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A = new int[]{1,2,4,5};
codilitySmallNum(A);

	}

	}
