
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Competition {
    private List<Jumper> takmicari = new ArrayList<Jumper>();
    
    public List<Jumper> getTakmicari(){
        return takmicari;
    }
    public void dodajTakmicara(Jumper j){
        takmicari.add(j);
    }
    public void sort(){
        Collections.sort(takmicari, new SortAgainstPoints());
    }
    public void reverseSort(){
        Collections.sort(takmicari, new SortAgainstPointsReverse());
    }
    public void order(){
        int i=1;
        for(Jumper j: takmicari){
            System.out.println("  " + i + ". " + j);
            i++;
        }
        System.out.println();
    }
    public void voting(){
        Random r = new Random();
        int maxJump = 120;
        int minJump = 60;
        int maxVote = 20;
        int minVote = 10;
        for(Jumper j: takmicari){
            List<Integer> glasovi = new ArrayList<Integer>();
            j.dodajDuzinu(r.nextInt(maxJump - minJump) + minJump);
            for(int i=0; i<5; i++){
                glasovi.add(r.nextInt(maxVote - minVote)+ minVote);
            }
            j.setVotes(glasovi);
        }

        for(Jumper j: takmicari){
                    int points = 0;
                    List<Integer> kopijaGlasova = new ArrayList<Integer>(j.getVotes());
                    kopijaGlasova.remove(Collections.min(kopijaGlasova));
                    kopijaGlasova.remove(Collections.max(kopijaGlasova));
                    for(int p: kopijaGlasova){
                        points += p;
                    }
            /* for(int i=0; i<j.getVotes().size(); i++){
                int vote = j.getVotes().get(i);
                int min = Collections.min(j.getVotes());
                int max = Collections.max(j.getVotes());
                if(vote != min && vote != max){
                    points += vote;
                }
           } */
            int duzina = j.getDuzine().get(j.getDuzine().size()-1);
            points += duzina;
            j.dodajPoene(points);
        }
    }
    public void printResults(){
        for(Jumper j: takmicari){
            j.printVotes();
        }
    }
    public void tournamentEnd(){
        Collections.sort(takmicari, new SortAgainstPoints());
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(int i=0; i<takmicari.size(); i++){
            System.out.println(i+1 + "           " + takmicari.get(i));
            StringBuilder sb = new StringBuilder();
            sb.append("            jump lengths: ");
            for(int j=0; j<takmicari.get(i).getDuzine().size(); j++){
                if(j == takmicari.get(i).getDuzine().size()-1){
                    sb.append(takmicari.get(i).getDuzine().get(j) + " m");
                } else sb.append(takmicari.get(i).getDuzine().get(j) + " m, ");
            }
            System.out.println(sb.toString());
        }
    }
}
