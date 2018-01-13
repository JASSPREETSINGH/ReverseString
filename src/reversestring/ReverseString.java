/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String inStr;  //input the string 
     int strlen;
     String reversedString=""; //for the length of the string
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to reversed");
        inStr=in.next();     //read the string 
        strlen=inStr.length();   //calculate the length of the string 
        
      for(int i=strlen-1;i>=0;i--){
        //to reverse the string
     reversedString=reversedString+ inStr.charAt(i); //reverse string character by character

      }
      System.out.println("The reversed string is "+reversedString); //to print out the reversed string
      
    }
    
}
