/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;
/**
 *
 * @author Class
 */
public class EmployeeAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException { 
        
        File text = new File("employee.txt");
        Scanner in = new Scanner(text);
        
        String[] name = new String[3];
        int[] id = new int[3];
        String[] dept = new String[3];
        double[] rate = new double[3];
        
        for(int i = 0; i < 3; i++){
            name[i] = in.next();
            id[i] = in.nextInt();
            dept[i] = in.next();
            rate[i] = in.nextDouble();
        }
        
        Employee e1 = new Employee(name[0],dept[0],id[0],rate[0]);
        Employee e2 = new Employee(name[1],id[1]);
        e2.setRate(rate[1]); e2.setDepartment(dept[1]);
        Employee e3 = new Employee();
        e3.setRate(rate[2]); e3.setDepartment(dept[2]); e3.setName(name[2]); e3.setIdnumber(id[2]);
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        e3.calculatePay();
        
    }
    
}
