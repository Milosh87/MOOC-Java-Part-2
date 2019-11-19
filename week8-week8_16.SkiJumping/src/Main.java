
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner sc = new Scanner(System.in);
        TextUserInterface text = new TextUserInterface(sc);
        text.start();
    }
}
