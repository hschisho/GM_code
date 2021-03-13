import java.util.Scanner;

public class MustangBroncoGUI {

    // function that accepts an integer from the user and displays a string value
    public static void main(String args[]) {

        // variable to define the value passed in
        int val;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a value: ");
        val = in.nextInt();

        if (val % 3 == 0 && val % 5 == 0) {
            System.out.println("MustangBronco");
        } else if (val % 3 == 0) {
            System.out.println("Mustang");
        } else if (val % 5 == 0) {
            System.out.println("Bronco");
        } else {
            System.out.println(val);
        }

    }


}
