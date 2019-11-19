/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milos
 */
public class MindfulDictionary {
    private String file;
    private Map<String,String> recnik = new HashMap<String,String>();
    public MindfulDictionary(){
        
    }
    public MindfulDictionary(String file){
        this.file = file;
    }
    public void add(String word, String translation){
        if(!recnik.containsKey(word)){
        recnik.put(word, translation);
        }
       }
    public String translate(String word){
     if(recnik.get(word) != null){
         return recnik.get(word);
     }
     else{
         for(String w: recnik.keySet()){
             if(recnik.get(w).equals(word)){
                 return w;
             }
         }
     }  
     return null;
    }
    public void remove(String word){
        recnik.remove(word);
        String removedWord="";
        for(String w: recnik.keySet()){
            if(recnik.get(w).equals(word)){
                removedWord = w;
                break;
            }
        }
        recnik.remove(removedWord);
    }
    public boolean load(){
        try {
            if(file == null){
                return false;
            }
            File file2 = new File(file);
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String line;
            try {
                while((line =br.readLine()) !=null){
                    System.out.println(line);
                    String[] parts = line.split(":");   // the line is split at :
                    recnik.put(parts[0],parts[1]);
                    System.out.println( parts[0] );     // the part of the line before :
                    System.out.println( parts[1] );     // the part of the line after :
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
                    return true;
       
}
    public boolean save(){
        try {
            FileWriter writer = new FileWriter(file);
            for(String word: recnik.keySet()){
                writer.write(word + ":" + recnik.get(word) +"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
