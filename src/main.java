
/**
 *
 * @author Phat_Chim
 */
import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args) {

        int choice;
        Integer[] arr = null;
        Menu menu = new Menu();
        menu.add("Input element");
        menu.add("Sort Ascending");
        menu.add("Sort Descending");
        menu.add("Exit");

        do {
            menu.printMenu();
            
            choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    arr = Input.inputValueOfArray();
                    break;
                case 2:
                    Arrays.sort(arr);
                    System.out.println("" + Arrays.toString(arr));
                    break;
                case 3:
                    Arrays.sort(arr, Collections.reverseOrder());
                    System.out.println("" + Arrays.toString(arr));
                    break;
            }
        } while (choice != 4);
    }
}
