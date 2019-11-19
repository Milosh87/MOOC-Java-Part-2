
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate,String>();
    
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.containsKey(plate)){
            return false;
        }
         if(!owners.containsKey(plate) && owners.get(plate) == null){
             owners.put(plate, owner);
            return true;
        }
      else return false;
}
    public String get(RegistrationPlate plate){
        if(owners.get(plate) == null) {
            return null;
        } else return owners.get(plate);
        
    }
    public boolean delete(RegistrationPlate plate) {
        if(owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        else return false;
        
    }
    public void printRegistrationPlates() {
        for(RegistrationPlate rp: owners.keySet()) {
            System.out.println(rp.getRegCode());
        }
    }
    public void printOwners(){
        ArrayList<String> names = new ArrayList<String>();
        for(RegistrationPlate rp: owners.keySet()){
            if(!names.contains(owners.get(rp))){
                names.add(owners.get(rp));
            }
        }
        for(String s: names) {
            System.out.println(s);
        }
    }
}
