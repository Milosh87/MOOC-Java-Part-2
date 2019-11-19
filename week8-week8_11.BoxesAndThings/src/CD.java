/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishYr;
    private double weight;
    public CD(String artist, String title, int publishYr){
        this.artist = artist;
        this.title = title;
        this.publishYr = publishYr;
        this.weight = 0.1;
    }
    public String toString(){
        return artist + ": " + title +  " (" + publishYr + ")";
    } 
    @Override
    public double weight() {
        return weight;
    }
}
