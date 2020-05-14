
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Bookstore
 */
public class Bookstore {
    Scanner scanner = new Scanner(System.in);

    String name;
    String address;

    private ArrayList<String> titles;

    public Bookstore(String name, String address) {
        this.name = name;
        this.address = address;

        // all other members set here

        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles();
    }

    public void titles2() {
        for (String i : titles) {
            System.out.println(i);
        }
    }

    public String name(String name) {
        System.out.println(" What is the name of the Book store? ");
        return name;
    }

    public String address(String address) {
        System.out.println("What is the address of the Bookstore?");
        return address;
    }

    String x;
    int feet;

    public Bookstore(String y) {
        System.out.println("Does the store have new or used books?");
        x = y;
    }

    public Bookstore(int ft) {
        System.out.println("How big is the store?");
        feet = ft;

    }

    // public String opendays(String openD) {
    // System.out.println("Is the store open today?");
    // return openD;
    // }

    public String openTime(String week) {

        if (week.equals("sunday")) {
            return "Sorry, we are closed Sundays";
        } else if ((week.equals("monday")) || (week.equals("tuesday")) || (week.equals("wednesday"))
                || (week.equals("thursday")) || (week.equals("friday"))) {
            return " We are open 8am - 7pm Monday through Friday";
        } else if (week.equals("saturday")) {
            return "we are open 8am-1pm";
        } else {
            return "Enter a valid day";
        }

    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

}
