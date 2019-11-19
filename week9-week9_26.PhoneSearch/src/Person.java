
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Person implements Comparable<Person>{
    private String name;
    private String address;
    private Set<String> phoneNumbers= new HashSet<String>();
    public Person(String name, String phoneNumber){
        this.name = name;
        phoneNumbers.add(phoneNumber);
    }
    public Person(){
        
    }
    public void addAddress(String address){
        this.address = address;
    }
    public void addPhone(String phone){
        if(phone == null){
            return;
        }
        phoneNumbers.add(phone);
    }
    
    public String personalInformation(){
        StringBuilder sb = new StringBuilder();
        if(address!=null){
        sb.append("\tadress: ");
        sb.append(address);
        }
        else sb.append("\taddress unknown");
        sb.append("\n");
        
        if(phoneNumbers.isEmpty()){
            sb.append("phone number not found");
        }
        else{
        sb.append("\tphone numbers: \n");
        for(String s: phoneNumbers){
            sb.append("\t " + s + "\n");
        }
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
    public String getAddress(){
        return address;
    }
  
}
