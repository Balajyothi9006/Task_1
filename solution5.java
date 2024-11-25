import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {

        solution5 s = new solution5();
        s.paymentamount();
    }
    //method to calculate payable amount after applying the discount
        public static void paymentamount()
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the purchase amount");
        double a= scanner.nextDouble();
        if (a<500) {
            System.out.println("The final payable amount is " + a);
        }
            else if (500<=a && a<=1000) {
                a = a - a*10/100;
                System.out.println("The final payable amount after discount is " + a);
            }
            else if(a>1000)
            {
            a = a - a*20/100;
                System.out.println("The final payable amount after discount is "+ a);
            }




    }
}
