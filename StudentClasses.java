/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
import java.util.Scanner;

public class StudentClasses{
    
    public static void main(String[] args){
        
        int credits, cstCredits;
        String code;
        String cstCode;
        boolean anotherOne;
        boolean residentStatus = true;
        String residentStr;
        credits = 0;
        
        
        Student student1 = new Student();              
               
        Scanner input = new Scanner(System.in);

        do{
        System.out.println("Enter your class code: ");
        cstCode = input.next();
        
        System.out.println("Enter the credit weight for this class");
        credits += input.nextInt();
        
        System.out.println("Are you taking any more classes?");
        anotherOne = input.nextBoolean();
        }while(anotherOne == true);
        
        
        System.out.println("Are you a resident? Yes or No");
        residentStr = input.next();
        
        if (residentStr.equals("yes"))
            residentStatus = true;
        else if (residentStr.equals("no"))
            residentStatus = false;
        else 
        {System.out.println("Invalid input");
            System.out.println("Are you a resident? Yes or No");
        }
        
        
        System.out.println( student1.calculateTuition(credits, residentStatus));
        
        
    }
    
}