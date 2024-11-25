import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        solution3 s= new solution3();
        s.reverseno();
    }
//method to print a number in reverse
    public void reverseno()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scanner.nextInt();
        System.out.println("The reverse no. is");
        int r=0;
        while (n!=0) {
            r=n%10;
            n=n/10;
            System.out.print(r);

        }

    }
}
