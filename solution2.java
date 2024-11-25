import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        solution2 s= new solution2();
    s.number();
    }
    //method to find a given number is negative or positive
        public void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Number is Negative");
        }
        else if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else System.out.println("number is zero");
    }
}
