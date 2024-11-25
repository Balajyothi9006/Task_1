import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {

        solution4 s = new solution4();
        s.greatestno();
    }
    //method to find the greatest number in three numbers

    public void greatestno()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a= scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b= scanner.nextInt();
        System.out.println("Enter 3rd number");
        int c= scanner.nextInt();
        if(a>b&&a>c)
            System.out.println("Greatest number is "+a);
        else if (b>c) {
            System.out.println("Greatest number is " + b);
        }
        else
            System.out.println("Greatest number is "+c);

        }
    }

