/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
public class MyInteger {
    
    int value;
    
    MyInteger(int x){
        value = x;
    }
    
    public boolean isEven(){
        if(value %2 == 0)
            return true;
        else return false;
        
    }
    
}
