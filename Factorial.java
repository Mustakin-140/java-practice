import java.util.Scanner;

public class Factorial
{
    public int factorial(int x)
    {
        int f = 1,i;
        for(i = 1; i<=x; i++)
            f *= i;
        return f;
    }
    public static void main(String[] args)
    {
        int n , fact;
        Scanner abc = new Scanner(System.in);
        Factorial xyz = new Factorial();
        System.out.println("Enter a number: ");
        n = abc.nextInt();

        fact = xyz.factorial(n);
        System.out.println("\nThe answer is: " + fact);
    }
}
