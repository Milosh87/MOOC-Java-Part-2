
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    @Override
    public boolean equals(Object other){
        if(other == null)
        return false;
        if(other.getClass() != getClass()){
            return false;
        }
        if(hashCode() == other.hashCode()){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return (int) latinName.hashCode() + ringingYear;
    }
    public String getLatinName(){
        return latinName;
    }
    public int getYear(){
        return ringingYear;
    }
    
}


