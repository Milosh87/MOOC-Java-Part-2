
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Jumper implements Comparable<Jumper>{
    private String name;
    private int points;
    private List<Integer> duzine = new ArrayList<Integer>();
    private List<Integer> votes = new ArrayList<Integer>();
    public Jumper(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

    @Override
    public int compareTo(Jumper o) {
        return this.points - o.getPoints();
    }
    public String toString(){
        return name + " (" + points + " points)";
    }
    public void dodajDuzinu(int duzina){
        duzine.add(duzina);
    }
    public void dodajVote(int vote){
        votes.add(vote);
    }
    public void setVotes(List<Integer> votes){
        this.votes = votes;
    }
    public void printVotes(){
        System.out.println("  " + name);
        System.out.println("    length: " + duzine.get(duzine.size()-1));
        System.out.println("    judge votes: " + votes);
        System.out.println();
        
    }
    public List<Integer> getDuzine(){
        return duzine;
    }
    public List<Integer> getVotes(){
        return votes;
    }
    public void dodajPoene(int poeni){
        points += poeni;
    }
}
