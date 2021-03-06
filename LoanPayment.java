//LoanPayment class..........

import java.util.Scanner;

/**
 * Created by harshita on 14/8/16.
 */
public class LoanPayment {

    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Project 3 created by Harshita");


        //Loan loan=new Loan(0,0,0,0);
        Loan loan=new Loan();
        loan.acceptData();
        loan.printBasicTable();

        //Loan loan1=new Loan(0,0,0,0);
        Loan loan1=new Loan();
        loan1.acceptData();
        loan1.printDetailedTable();


    }


}

//.................
//class loan

import java.util.Scanner;

/**
 * Created by harshita on 15/8/16.
 */
class Loan {

    public static final Scanner CONSOLE = new Scanner(System.in);

    private double numberOfMonths;
    private double loanAmount;
    private double annualRateOfInterest;
    private double monthlyPayment;

/*
    Loan(double numberOfMonths,double loanAmount, double annualRateOfInterest, double monthlyPayment)
    {
        this.annualRateOfInterest=annualRateOfInterest;
        this.loanAmount=loanAmount;
        this.numberOfMonths=numberOfMonths;
        this.monthlyPayment=monthlyPayment;
    }*/

    public void acceptData()
    {
        System.out.println("Enter the loan amount: ");
        this.loanAmount=CONSOLE.nextDouble();
        System.out.println("Enter the monthly payment: ");
        this.monthlyPayment=CONSOLE.nextDouble();
        System.out.println("Enter the annual rate of interest: ");
        this.annualRateOfInterest=CONSOLE.nextDouble();
        System.out.println("Enter the number of months:");
        this.numberOfMonths=CONSOLE.nextDouble();
    }



   /* public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }*/


   public void printBasicTable()
   {
       System.out.println("Month\tBalance");
       for(int i=1;i<=numberOfMonths;i++)
       {

           loanAmount=(((annualRateOfInterest/100)*loanAmount/12)+(loanAmount-monthlyPayment));

           System.out.println(i+"\t\t"+loanAmount);
       }
   }

   public void printDetailedTable()
   {
       System.out.println("Month\tBalance\t\tPayment\tRemaining");
       for (int i=1;i<=numberOfMonths;i++)
       {
           
           loanAmount=(((annualRateOfInterest/100)*loanAmount)/12)+(loanAmount-monthlyPayment);
           System.out.println(i+"\t\t"+(loanAmount+monthlyPayment)+"\t\t"+monthlyPayment+"\t\t"+(loanAmount));

       }

   }

}

