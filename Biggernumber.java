import java.util.Scanner;

public class Biggernumber {
    public static void main(String[] args)
    {
        int a,b;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = abc.nextInt();

        System.out.println("Enter the second number:");
        b = abc.nextInt();

        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
