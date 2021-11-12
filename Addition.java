import java.sql.PreparedStatement;
import java.util.Scanner;

public class Addition {
    public static  int add(int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,Result;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();

        System.out.println("Enter the second number: ");
        b = sc.nextInt();

       // Result = a + b;
        Result = add(a,b);

        System.out.println("Addition: " + Result);


    }
}
