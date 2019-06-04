/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;

/**
 *
 * @author EVI
 */
public class Divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i;
        int sum=0;
       
        
        for(i=0;i<=100;i++)
        {
            if(i%5==0 && i%4==0)
            {
               
                System.out.println("Oi aritmoi einai: "+i+ ",");
                sum++;
                
            }
        }
        System.out.println("sum= "+sum);
    }
    
}
