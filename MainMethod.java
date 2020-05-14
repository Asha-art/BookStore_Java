import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bookstore object = new Bookstore(" Yes, The store has used books!");
        System.out.println(object.name(" The book cafe"));
        System.out.println(object.address(" 840 providence road"));
        System.out.println(object.x);
        Bookstore object2 = new Bookstore(9000);
        System.out.println("The book store is: " + object2.feet + "sq.ft big.");

        System.out.println("Is the store open today?");
        System.out.println("What day are you looking for? ");
        String userInput = scan.nextLine().toLowerCase();
        System.out.println(object.openTime(userInput));

        Bookstore list = new Bookstore("The book cafe", "840 providence road");
        System.out.printf(list.toString());
        System.out.println("\nWould you like to check our book selection?");
        String check = scan.next();
        if (check.equalsIgnoreCase("yes")) {
            list.titles2();
        }

        scan.close();

    }

}
