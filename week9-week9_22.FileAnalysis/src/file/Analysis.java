/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milos
 */
public class Analysis {
    private File file;
    private int numberOflines = -1;
    private int numberOfChars = -1;
    public Analysis(File file){
        this.file = file;
    }
    public int lines() {
        if(numberOflines != -1){
            return numberOflines;
        }
        int totalLines = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            totalLines++;
        }
        reader.close();
        numberOflines = totalLines;
        return totalLines;
    }
    public int characters(){
        if(numberOfChars!= -1){
            return numberOfChars;
        }
        int totalChars = 0;
        
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(reader.hasNextLine()){
            String text = reader.nextLine();
            totalChars += text.length();
        }
        totalChars += lines();
        reader.close();
        numberOfChars = totalChars;
        return totalChars;
    }
}
