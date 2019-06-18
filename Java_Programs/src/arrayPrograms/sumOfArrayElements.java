package arrayPrograms;
import java.util.*;

public class sumOfArrayElements 
{
  public static void main(String[] args) {
  // Write your code here
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the number of elemnts you want in an array");
  int n = scan.nextInt();
  int sum = 0;
  int[] arr = new int[n];
  System.out.println("Enter array elements:");
  for(int i=0; i<n; i++)
  {
    arr[i] = scan.nextInt();
  }
  scan.close();
  
  for(int i : arr)
  {
    sum = sum + i;
  }
  
  System.out.println("Sum is: " +sum);
  }
}
