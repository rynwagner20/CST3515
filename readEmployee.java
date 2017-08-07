/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan 
 */

import java.util.Scanner;
import java.io.*;

public class readEmployee {
    public static void main(String[] args){
        
        String[] name = new String[2];
        int[] id = new int[2];
        String[] code = new String[2];
        int[] num = new int[2];
        
        
        Employee emp1 = new Employee();
        
        File employee = new File("employee.txt");
        Scanner input = new Scanner(employee);
        
        while (input.hasNext())
        {
            String name = input.next();
            input.next();
            input.next();
            emp1.calculatePay();
                       
        }
                
    }
    
}
