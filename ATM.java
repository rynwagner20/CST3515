// Ryan Wagner ATM Machine 
// 2/13/2017

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        double balance, depositAmt, withdrawAmt;
        int choice;      
        balance = 1000.00;      
        
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);
        
        do
        {
        System.out.println(" Your current balance is " + balance + 
        " \n Enter \n 1. Deposit \n 2. Withdraw \n 3. Print Balance \n 4. Exit");
        choice = input.nextInt();
         
        if(choice <1 || choice > 4){
            System.out.println("Error!");
            System.out.println("Welcome! Your current balance is " + balance + 
        " \n Enter \n 1. Deposit \n 2. Withdraw \n 3. Print Balance \n 4. Exit");
        choice = input.nextInt();
            
        }
        
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the amount you would like to deposit");
                    depositAmt = input.nextDouble();
                    while(depositAmt < 0){
                        System.out.println("Error, enter a valid cash amount");
                        depositAmt = input.nextDouble();
                    }
                    balance = deposit(depositAmt, balance);
                    System.out.println("You deposit of $" + depositAmt + " has been accepted"+
                            "Your new balance is $" +balance);
                    break;
                case 2:
                    System.out.println("Your balance is $" + balance);
                    System.out.println("Enter the amount you would like to withdraw");
                    withdrawAmt = input.nextDouble();
                    while(withdrawAmt > balance){
                        System.out.println("Error, You entered more than your available balance."+
                                "Enter another amount.");
                        withdrawAmt = input.nextDouble();
                    }
                    balance = withdraw(withdrawAmt, balance);
                    System.out.println("Your withdraw has been processed");
                    break;
                case 3:
                    printBalance(balance);
                    break;
                case 4:
                    exit();
                    break;
                  
            }
        }while (choice != 4);
        
        
            
        
        
    }
    
    public static double deposit(double x, double y){
        double depositAmt = x, currentBal = y;
        double balance = depositAmt + currentBal;
        return balance;
    }
    
    public static double withdraw(double x, double y){
        double withdrawAmt = x, currentBalance = y;
        double balance = currentBalance - withdrawAmt;
        return balance;
    }
    
    public static void printBalance(double x){
        System.out.println("Your Balance is $" + x);
    }
    
    public static void exit(){
        System.out.println("Thank you, Good-Bye");
        System.exit(0);
    }
}
