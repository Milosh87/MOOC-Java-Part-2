
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File tekst = new File(file);
        List<String> rezultat = new ArrayList<String>();
        FileReader fr = new FileReader(tekst);
        BufferedReader inStream = new BufferedReader(fr);
        String line;
        try {
            line = inStream.readLine();
                    while(line != null){
            rezultat.add(line);
            line = inStream.readLine();
                    }
                    inStream.close();
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }

            return rezultat;
        }
    

    public void save(String file, String text) throws IOException {
         FileWriter fw = new FileWriter(file);
         fw.write(text);
         fw.close();
    }
    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for(String s: texts){
            writer.write(s + "\n");
        }
        writer.close();
    }
}
