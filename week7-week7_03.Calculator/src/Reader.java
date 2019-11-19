
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Reader {
    private Scanner sc = new Scanner(System.in);
    public String readString(){
        return sc.nextLine();
    }
    public int readInteger() {
        return Integer.parseInt(sc.nextLine());
    }
}
