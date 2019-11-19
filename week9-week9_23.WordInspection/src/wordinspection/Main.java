package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

       WordInspection s = new WordInspection( new File("src/wordList.txt") );
s.wordsWhichContainAllVowels();
        // all words are in file src/wordList.txt

    }
}
