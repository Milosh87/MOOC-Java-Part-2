
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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:\n");
        System.out.println("\t add - adds a word pair to the dictionary");
        System.out.println("\t translate - asks a word and prints its translation");
        System.out.println("\t quit- quit the text user interface");
        while(true){
        System.out.println("Statement: ");
        String word = reader.nextLine().toLowerCase();
        if(word.equals("quit")) {
            System.out.println("Cheers");
            break;
        }
        else if (word.equals("add")){
                        System.out.println("In Finnish: ");
                        String wordF = reader.nextLine();
                        System.out.print("Translation: ");
                        String wordT = reader.nextLine();
                        dictionary.add(wordF, wordT);
                    }
        else if (word.equals("translate")){
                        System.out.println("Give a word: ");
                        String wordTrans = reader.nextLine();
                        System.out.print("Translation: ");
                        System.out.println(dictionary.translate(wordTrans));

                    }
        else  {
                System.out.println("Unknown statement");
                }
        } 
        
    }
}
