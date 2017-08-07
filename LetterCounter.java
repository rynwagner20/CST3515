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

public class LetterCounter {
    
    public static void main(String[] args){
    int count = 0;
    
    System.out.println("Enter a string.");
    
    Scanner input = new Scanner(System.in);
    String inputString = input.next();
    
    
    
    for(int i = 0 ; i < inputString.length() ; i++)
    {
            if(inputString.charAt(i) == 'b'){
                count++;
            }
    
    }
    System.out.println("There are " + count + " b's in your string");
        
    
    
    }
}
