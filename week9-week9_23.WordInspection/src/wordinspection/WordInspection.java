/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milos
 */
public class WordInspection {
    private File file;
    public WordInspection(File file){
        this.file = file;
    }
    public int wordCount() {
        int totalWords = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                
                String line = sc.nextLine();
                System.out.println(line);
                totalWords++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return totalWords;
    }
    public List<String> wordsContainingZ() {
        List<String> listaSaSlovomZ = new ArrayList<String>();
         Scanner sc = null;
        try {
           sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains("z") || line.contains("Z")){
                    listaSaSlovomZ.add(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return listaSaSlovomZ;
    }
    public List<String> wordsEndingInL(){
         List<String> listaSaSlovomLnaKraju = new ArrayList<String>();
         Scanner sc = null;
        try {
            sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                int length = line.length()-1;
                if(line.charAt(length) == 'l' || line.charAt(length) =='L'){
                    listaSaSlovomLnaKraju.add(line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return listaSaSlovomLnaKraju;
    }
    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        Scanner sc = null;
         try {
            sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String split [] = line.split(" ");
                for(int i=0; i<split.length; i++){
                    boolean palindrom = true;
                    for(int j=0, k=split[i].length()-1; j<k; j++,k--){
                        if(split[i].charAt(j) != split[i].charAt(k)){
                            palindrom = false;
                            break;
                        }
                    }
                    if(palindrom){
                        palindromes.add(split[i]);
                    }
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return palindromes;
    }
    public List<String> wordsWhichContainAllVowels(){
         List<String> vowels = new ArrayList<String>();
        Scanner sc = null;
         try {
            sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                String split [] = line.split(" ");
                for(int i=0; i<split.length; i++){
                    String word = split[i];
                        if(word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                           vowels.add(split[i]);
                        }
                    }
                }
                
            }
          catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return vowels;
    }
   
}

