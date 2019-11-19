
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
    public TextUserInterface(Scanner reader){
        this.reader = reader;
    }
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        Competition takmicenje = new Competition();
        while(true){
            System.out.print("  Participant name: ");
            String participant = reader.nextLine();
            if(participant.equals("")){
                break;
            }
            takmicenje.dodajTakmicara(new Jumper(participant));
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        int i =1;
        while(true){
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String question = reader.nextLine();
        if(!question.equals("jump")){
            break;
        }
        System.out.println();
        System.out.println("Round " + i);
        System.out.println();
        System.out.println("Jumping order:");
        takmicenje.reverseSort();
        takmicenje.order();
        takmicenje.voting();
        System.out.println("Results of round " + i);
        takmicenje.printResults();
        i++;
        }
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        takmicenje.tournamentEnd();
    }
}
