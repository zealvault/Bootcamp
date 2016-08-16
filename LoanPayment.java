/**
 * Created by vishal on 16/8/16.
 */


import java.util.Scanner;

public class LoanPayment
{

    public void SimpleLoan()
    {
        double rate;

        double monthlyPayment=50D;
        double loan =1000D;
        Scanner CONSOLE = new Scanner(System.in);
        System.out.println("One Year Loan Table");
        System.out.println();
        System.out.println("Enter the annual interest rate :");
        rate = (CONSOLE.nextDouble())/100;

        System.out.println("The initial loan is "+"$"+loan);
        System.out.println("The monthly payment is "+"$"+monthlyPayment);
        System.out.println("The annual interest rate is"+(rate*100));
        System.out.println("Simple Loan Payment Table For One Year");
        System.out.println("MONTH     BALANCE");

        for(int i=1;i<=12;i++)
        {
            loan = (loan + loan*(rate/12))-monthlyPayment;
            System.out.println(i+"         "+loan);
        }
    }
    public void DetailedLoan()
    {
        double balance;
        double interestRate;
        double monthlypayment;
        int months;
        double remaining;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Detailed Loan Table");
        System.out.println("Enter initial balance:");
        balance=scanner.nextDouble();
        System.out.println("Enter the annual initial rate percentage");
        interestRate=scanner.nextDouble();
        System.out.println("Enter the monthly Payment");
        monthlypayment=scanner.nextDouble();
        System.out.println("Enter no of months");
        months=scanner.nextInt();
        System.out.println("The initial loan is "+"$"+balance);
        System.out.println("The monthly payment is "+"$"+monthlypayment);
        System.out.println("The annual interest rate is"+interestRate);

        System.out.println("Month\t\t\tBalance\t\t\t\t\tPayment\t\t\t\tRemaining");
        for(int i=1;i<=months;i++)

        {

            balance = (balance + balance*(interestRate/1200));
            remaining = balance - monthlypayment;
            System.out.println(i+"         "+balance+"            " + monthlypayment + "        " + remaining);
            balance=balance-monthlypayment;
        }
    }
    public static void main(String args[])
    {
        LoanPayment lpDetail = new LoanPayment();
        lpDetail.SimpleLoan();
        lpDetail.DetailedLoan();
    }


}
