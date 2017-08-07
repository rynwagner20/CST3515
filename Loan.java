//Ryan Wagner

import java.util.Date;

public class Loan {
    double loanAmount, annualInterestRate;
    int numberOfYears;
    Date loanDate;
    
    Loan(){
        annualInterestRate = 0.025;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }
    
    Loan(double air, int noy, double la){
        annualInterestRate = air;
        numberOfYears = noy;
        loanAmount = la;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public int getNumberOfYears(){
        return numberOfYears;
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
    public Date getLoanDate(){
        return loanDate;
    }
    
    public void setAnnualInterestRate(double air){
        annualInterestRate = air;
    }
    
    public void setNumberOfYears(int noy){
        numberOfYears = noy;
    }
    
    public void setLoanAmount(double la){
        loanAmount = la;
    }
    
    public double getMonthlyPayment(){
        double payment;
        payment = (annualInterestRate*(loanAmount)) / 
            (1-Math.pow(1+(annualInterestRate), -numberOfYears*12));
        return payment;
    }
    
    public double getTotalPayment(){
        double payment;
        payment = this.getMonthlyPayment() * 12;
        return payment;
    }
         
    
}
