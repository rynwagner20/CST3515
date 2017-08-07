/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
public class Employee {
    String name, dept;
    int id;
    double rate;

    Employee(){
      name = "";
      id = 0;
      dept = "";
      rate = 0;
    }

    Employee(String n, int i, String d, double r){
      name = n;
      id = i;
      dept = d;
      rate = r;
    }

    Employee(String n, int i){
      name = n;
      id = i;
    }

    public void printRecord(){
      System.out.println("name "+ name +"    "+"ID: "+ id + "    "+"Department: " + dept
                            + "    "+"Rate" +  rate );
    }

    public void setName(String n){
      name = n;
    }

    public void setId(int i){
      id = i;
    }

    public void setDept(String d){
      dept = d;
    }

    public void setRate( double r){
      rate = r;
    }

    public String getName(){
      return name;
    }

    public int getId(){
      return id;
    }

    public String getDept(){
      return dept;
    }

    public double getRate(){
      return rate;
    }

    public double calculatePay(int h){
      double pay = rate * h;
      return pay;
    }


}
