/* Que Given an integer n, write a function that returns count of trailing zeroes in n!.
   Input Format 
   A single integer N.

   Constraints
   1 <= N <= 10^9

   Output Format
   A single integer denoting the count of trailing zeroes in N!
   
   Sample Input
   5

   Sample Output
   1

   Explanation
   Factorial of 5 is 120 which has one trailing 0.

*/

// java 8

// Code

// Watch this video (Concept):   https://youtu.be/5j24Jepc5GI

import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(n);
      int sum=0;
		while(n>=5)
		{
		 int m=n/5;
		 sum=sum+m;
		 n=m;
		}
		System.out.println(sum);
    }
}