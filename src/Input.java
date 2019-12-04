
import java.util.Comparator;
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
public class Input {

    public static int inputSizeOfArray() {
        Scanner sc = new Scanner(System.in);
        int result;
        while (true) {
            System.out.print("Input size of array: ");
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result <= 0) {
                    System.out.println("Number must be bigger 0");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be integer number!");
            }
        }
    }

    public static Integer[] inputValueOfArray() {
        int numOfArr = inputSizeOfArray();
        Integer arr[] = new Integer[numOfArr];
        for (int i = 0; i < numOfArr; i++) {
            System.out.printf("Number " + i + ":");
            arr[i] = Validation.isInteger("Must be a integer number");
        }
        return arr;
    }

}
