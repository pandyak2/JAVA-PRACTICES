package learn;
class twoSum {
    public static int twoSum(int[] nums, int target) {
        int tar = target;
        for(int i=0; i< nums.length ; i++)
        {
            for(int j=i+1 ; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == tar)
                {
                    System.out.println(" " +nums[i] + " " +nums[j]);
                }
            }
        }
		return 0;
        
    }
        public static void main(String args[])
        {
            int[] nums = {1,2,3,4,5};
            twoSum(nums, 6); //Adding the numbers in array to reach to a specific target
        }
    
}

