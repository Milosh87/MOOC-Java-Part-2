
import java.util.ArrayList;
import java.util.HashMap;
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
    private HashMap<String, Integer> planes = new HashMap<String, Integer>();
    private ArrayList<AirPlane> flights = new ArrayList<AirPlane>();
    public TextUserInterface(Scanner reader) {
        this.reader = reader;
    }
    public void start() {
         System.out.println("Airport panel\n" +
"--------------------\n");
        while(true){
System.out.println("Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n"
        + "> ");
        String word = reader.nextLine().toLowerCase();
        if(word.equals("x")){
            break;
        }
        else if (word.equals("1")) {
           addAirplane();
        }
        else if (word.equals("2")) {
            addFlight();
        }
        }
              System.out.println("Flight service\n" +
"------------\n");
        while(true) {
      
System.out.println("Choose operation:\n" +
"[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +
"[x] Quit\n"
       + "> ");
        String pitanje = reader.nextLine().toLowerCase();
            if(pitanje.equals("x")) {
                break;
            }
            if(pitanje.equals("1")){ 
               for (String i : planes.keySet()) {
  System.out.println( i + " (" + planes.get(i) + " ppl)");
}
            }
             else if(pitanje.equals("2")) {
                  for(int i=0; i<flights.size(); i++) {
                      System.out.print(flights.get(i).flights());
                  }
                   System.out.println();
              }
              else if(pitanje.equals("3")){
                  System.out.println("Give plane ID: ");
                  String idAviona = reader.nextLine();
               for (String i : planes.keySet()) {
                   if(planes.get(idAviona) != null && i.equals(idAviona)){
  System.out.println( i + " (" + planes.get(i) + " ppl)");
}
                  System.out.println();
            }
        }
    }
    }
    public void addAirplane(){
         System.out.println("Give plane ID: ");
            String id = reader.nextLine();
            System.out.println("Give plane capacity:");
            int capacity = reader.nextInt();
             reader.nextLine();
            planes.put(id, capacity);
           
    }
    public void addFlight(){
        System.out.println("Give plane ID:");
            String searchId = reader.nextLine();
            if (planes.get(searchId) != null) {
              System.out.println("Give departure airport code:");
              String departure = reader.nextLine();
              System.out.println("Give destination airport code:");
              String destination = reader.nextLine();
              flights.add(new AirPlane(searchId, planes.get(searchId), departure, destination));
            } 
    }
}
