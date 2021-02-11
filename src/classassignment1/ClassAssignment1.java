/*
 * Professor Raed Karim
 * Resham Kukreja
 * 991628882
 * In-class Exercise 1
 */
package classassignment1;

import java.util.Scanner;
/**
 *This class is used to ask the user to enter random temperatures
 * and then returns the average of those temperatures. 
 * 
 * @author resham
 */
public class ClassAssignment1 {

 /**
 * This main method contains the call to the calcAvg method
 * used to calculate the average of the temperatures. 
 * 
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int temps [] = new int[14];
        
        for (int i=0;i<temps.length;i++){
            System.out.print("Enter temperature "+ (i+1) +": " );
            temps[i] = in.nextInt();
            System.out.println();
        }
        
        System.out.println(" The average of the temperatures is : " + calcAvg(temps));
        System.out.println(" This is the highest temperatures of all the given temperatues : " + calcMax(temps));
    }
    public static float calcAvg(int[] temps){
        int sum =0;
        int range = 0;
        
        for (int i=0; i<temps.length; i++) {
            if (temps[i] > -50 && temps[i] < 50) {
                sum += temps[i];
                range++;
            }
        }
        return (float) sum/range;
    }
    public static int calcMax(int[] temps){
        int max= temps[0];
  
         for (int i = 0; i < temps.length; i++){
             if (temps[i] > max) {
                 max = temps[i]; 
             }
         }
        return max; 
    }
   
}
