
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!Thing book = new Thing("Happiness in Three Steps", 2);
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
 

        
    }
    public static void addSuitcasesFullOfBricks(Container container){
        
       
        for(int i=1; i<=100; i++) {
        	Suitcase se = new Suitcase(1000);
        	se.addThing(new Thing("brick", i));
        container.addSuitcase(se);
        }
        
    }
    
}
