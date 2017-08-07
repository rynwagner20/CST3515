/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Wagner
 */
public class Student {
    private String lastName;
    private String firstName;
    private int ID;
    private boolean residentStatus;
    private int numOfCredits;
    
    Student(){
        lastName = " ";
        firstName = " ";
        ID = 0;
        residentStatus = true;
        numOfCredits = 0;
    }
    
    Student(int credits){
        numOfCredits = credits; 
    }
    
    public void setLastName(String x){
        lastName = x;
    }
    
    public void setFirstName(String x){
        firstName = x;
    }
    
    public void setID(int x){
        ID = x;
    }
    
    public void setResidentStatus(boolean x){
        residentStatus = x;
    }
    
    public void setNumOfCredits(int x){
        numOfCredits = x;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
     public int getID(){
         return ID;
     }
     
     public boolean getResidentStatus(){
         return residentStatus;
     }
    
    public int getNumOfCredits(){
        return numOfCredits;
    }
    
    public int calculateTuition(int credits, boolean resStatus){
        // int creditHourResident = 275;
        // int creditHourNonResidentPart = 560;
        if (credits >= 12 && resStatus == true)
            return 3165;
        else if (credits < 12 && resStatus == true)
            return credits * 275;
        else return credits * 560;
                            
    }
    
    
}
// must know whats a class, object, public private, methods
// 