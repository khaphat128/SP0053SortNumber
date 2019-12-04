
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Phat_Chim
 */
public class Menu {
    
    ArrayList<String> menu;
    
    public Menu() {
        menu = new ArrayList<>();
    }
    
    public void add(String option) {
        menu.add(option);
    }
    
    public int getUserChoice() {
        int result;
        return result = Validation.isInteger("Enter choice: ", "must integer and from 1 to 4");
    }
    
    public void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + "." + menu.get(i));
        }
    }
    
}
