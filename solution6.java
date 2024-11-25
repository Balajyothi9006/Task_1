import java.util.Scanner;

public class solution6 {
    public static void main(String[] args) {
        solution6 s = new solution6();
        s.pattern();
    }
//method to print the required pattern
    public static void pattern()
    {
        System.out.println("Enter a number to get required pattern");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= n; j++)
            {

                System.out.print(Math.max(n-i+1,n-j+1));
            }
            System.out.println();
        }
    }
}
