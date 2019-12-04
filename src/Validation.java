
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phat_Chim
 */
public class Validation {
    public static int isInteger(String err1){
        Scanner sc=new Scanner(System.in);
        int result;
        while(true){
            try {
                result=Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println(err1);           
            }
        }
    }
    
        public static int isInteger(String msg, String err1){
        Scanner sc=new Scanner(System.in);
        int result;
        while(true){
            try {
                System.out.println(msg);
                result=Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println(err1);           
            }
        }
    }
    
    
}
