
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString) {
        if(characterString.length() % 2 ==0){
            if (characterString.length()>4) {
                 for (int i=0; i<characterString.length(); i++) {
            System.out.print(":)");
        }
            }
            else {
        for (int i=0; i<characterString.length()+1; i++) {
            System.out.print(":)");
        }
            }
        System.out.println();
        System.out.println(":) " + characterString + " :)");
               if (characterString.length()>4) {
            for (int i=0; i<characterString.length(); i++) {
            System.out.print(":)");
        }
        } else{
          for (int i=0; i<characterString.length()+1; i++) {
            System.out.print(":)");
        }
               }
    }
        else {
             for (int i=0; i<characterString.length()+1; i++) {
            System.out.print(":)");
        }
        System.out.println();
        System.out.println(":) " + characterString + "  :)");
          for (int i=0; i<characterString.length()+1; i++) {
            System.out.print(":)");
        }
        }
    }

}
