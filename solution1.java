import java.util.Scanner;
public class solution1{
    public static void main(String[] args) {
        solution1 s = new solution1();
        s.printnumbers();
    }
//method to print numbers between two given numbers
        public void printnumbers()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1st number");
            int a = scanner.nextInt();
            System.out.println("Enter 2nd number");
            int b = scanner.nextInt();
            System.out.println("Numbers from " + a + " to " + b + " are");
            for (int i = a; i <= b; i++) {

                System.out.print(i + " ");

            }
        }
    }
