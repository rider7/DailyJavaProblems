//class
public class DailyJavaProblems {
    //attributes
    // Declaring array literal
    private static int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };



    //methods
    public static void main(String[] args) {

        // Declaring array literal
        arraySum(intArray);
    };



//Description: Sum of positive
//You get an array of numbers, return the sum of all of the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.
//
//My Solution:

  public static void arraySum(int[] arr){
      int arraySumTotal = 0;
  for(int i=0; i <= arr.length-1; i++){
  arraySumTotal += arr[i];
}
      System.out.println( "The Sum of the Array is: " + arraySumTotal);

  }

//
//Best Practice:
//import java.util.Arrays;
//public class Positive{
//    public static int sum(int[] arr){
//        return Arrays.stream(arr).filter(v -> v > 0).sum();
//    }
//}
//
//Notes: Use length - 1 so you do not get an out of bounds exception.
//stream(arr).filter(v -> v > 0) allows you to go through each element in the array that match the predicate in .filter()
//in this case, meaning each element that is greater than 0 (positive). The .sum() then is called on each element that was filtered
//from the array into the stream.
//
//-----------------------------------------
//
//Description:
//My Solution:
//Best Practice:
//Notes:




















































}