/*
    Take the following as input.

     A number (N1)
     A number (N2)
    Write a function which returns the GCD of N1 and N2. Print the value returned.



    Input Format
    Two integers seperated by a new line.

    Constraints
    0 < N1 < 1000000000
    0 < N2 < 1000000000

    Output Format
    Output a single integer which is the GCD of the given integers.

    Sample Input
    16 
    24

    Sample Output
    8

    Explanation
    The largest number that divides both N1 and N2 is called the GCD of N1 and N2.
*/

//Suggest video:  https://youtu.be/VWOUh4w_zVI


   import java.util.*;
   public class Main {
	private static int GCD(int a, int b)
	{
		if(a==0)
		 return b;
		if(b==0)
		 return a;

		int gcd=GCD(b,a%b);
		return gcd;
	}
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int gcd = GCD(a,b);
		 System.out.println(gcd);
    }
}
