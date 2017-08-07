/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */

/**
 * open data file
 * throw first line
 * read 50 states
 * 
*/

import java.util.Scanner;
import java.io.*;

public class election {
    public static void main(String[] args)throws IOException{

        int[] obama = new int[51];
        int[] romney = new int[51];
        String[] state = new String[51];
        
        File electionVotes = new File("ElectionVotes.txt");
        Scanner inputVotes = new Scanner(electionVotes);
        
        File electionData = new File("ElectionData.txt");
        Scanner inputData = new Scanner(electionData);
        

        
        inputData.nextLine();
        
        while(inputData.hasNext())
        {
            for(int i = 0; i<51; i++){
            state[i] = inputData.next();
            obama[i] = inputData.nextInt();
            romney[i] = inputData.nextInt();
            }
        }
        
            
            
        
        
        
        
        

       
        
        
        
    }
    
}
