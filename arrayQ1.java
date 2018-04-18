public class arrayQ1 {
   public static int nums[] = { 1, 2, 3, 6, 7, 8, 9}; 
   public static void main(String[] args) { 
     arrayRev.reverse(nums); 
} 

public static int[] reverse(int[] nums) 
{ 
    int rev[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
    int lenght = nums.length; 
    for (int i = lenght - 1; i >= 0; i--) 
    {
      rev[i] = nums[i]; 
      System.out.println(rev[i]); 
    }
    return nums; 
  } 
} 
