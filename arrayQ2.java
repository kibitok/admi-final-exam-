// a code that takes in an  array and returns only the output of positve elements in the array.
public class arrayQ2{
    public static void main(String[] args) {
     int[] numbers = {2,-1,5,-4,3, 5, -7 , 9, -100}; // initiallization of an the array
     for(int n : getPositiveNumbers(numbers)){ // using the for loop to loop through the array
         System.out.println(n);    
        }

    }
    // checking if the elements are positive.
    public static int[] getPositiveNumbers(int[] numbers){
    int count = 0;
     for (int n : numbers){
         if(n>0){   // ch
            count++;
         }
     }
    int [] nums = new int[count];
    int i =0;
    for (int n : numbers){
        if(n>0){
           nums[i] = n;
           i++;
        }
    }

    return nums;

}
}
