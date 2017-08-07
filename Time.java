/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
public class Time {
    int hour, min, sec;
    
    Time(){
        hour = 0;
        min = 0;
        sec = 0;
    }
    
    Time(int x, int y, int z){
        hour = x;
        min = y;
        sec = z;
    }
    
    public void setHour(int x){
        hour = x;
    }
    
    public void setMin(int x){
        min = x;
    }
    
    public void setSec(int x){
        sec = x;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getSec(){
        return sec;
    }
    
    public void increment(){
        sec++;
        if(sec == 60){
            sec = 0;
            min ++;
            if(min ==60){
                min = 0;
                hour++;
                if(hour ==24){
                    hour =0;
                }
            }
            
        }
        
    }
    
    public String toString(){
        String str = "";
        str = str + hour + ":";
        if(hour < 10)
            str = "0" + str;
            
        if(min < 10)
            str += "0" + min +":";
        else 
            str += min + ":";
        if(sec < 10)
            str += "0" + sec;
        else 
            str += sec;
        return str;
        
    }
    
    public boolean Equal(Time t){
        if( hour == t.hour && min == t.min && sec == t.sec)
            return true;
        else return false;
    }
    
   
    public boolean greater(Time t){
        if ( hour > t.hour)
            return true;
        else if( hour == t.hour)
            if(min > t.min)
                return true;
            else if( min == t.min && sec > t.sec)
                return true;
        return false;
    }
                        
            
        /* public String toAmPmString(){
        if (hour < 12)
            return toString() + "am";
        else if (hour == 12)
            return
    }
    */    
    
}
