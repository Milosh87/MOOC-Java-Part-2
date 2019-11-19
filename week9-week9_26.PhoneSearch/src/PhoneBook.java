
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
public class PhoneBook {
    private Map<String, Set<String>> phonebook;
    private Map<String, Person> personalInfo;
    public PhoneBook(){
        phonebook = new HashMap<String, Set<String>>();
        personalInfo = new HashMap<String, Person>();
    }
    public void addNumber(String name, String number){
        Set result = phonebook.get(name);
        if(result == null){
            result = new HashSet<String>();
        }
        result.add(number);
        phonebook.put(name, result);
        if(personalInfo.get(name) == null){
        personalInfo.put(name, new Person(name, number));
        } else personalInfo.get(name).addPhone(number);
    }
    public void searchForNumber(String name){
        Set<String> phoneNumbers = phonebook.get(name);
        if(phoneNumbers == null){
            System.out.print("\tnot found\n"
                    + "");
        }
        else{
            for(String number: phoneNumbers){
                System.out.print(" " + number + "\n");
            }
        }
    }
    public String searchForName(String number){
        for(String name: phonebook.keySet()){
            if(phonebook.get(name).contains(number)){
                return name;
            }
        }
        return "not found";
    }
    public void addAdress(String name, String street, String city){
        Person person= personalInfo.get(name);
        String address = street + " " + city;
        if(person == null){
            personalInfo.put(name, new Person());
            personalInfo.get(name).addAddress(address);
        }
        else
        person.addAddress(address);
    }
    public Person personalInfoSearch(String name){
        return  personalInfo.get(name);
    }
    public void removePersonalInfo(String name){
        phonebook.remove(name);
        personalInfo.remove(name);
}
    public Map<String,Person> filterByWord(String word){
        if(word.equals("")){
            return personalInfo;
        }
        Map<String, Person> filteredWords = new HashMap<String, Person>();
        for(String name: personalInfo.keySet()){
            if(name.contains(word)){
                filteredWords.put(name, personalInfo.get(name));
                continue;
            }
            if(personalInfo.get(name)== null){
                continue;
            }
            if(personalInfo.get(name).getAddress() == null){
                continue;
            }
            if(personalInfo.get(name).getAddress().contains(word)){
                filteredWords.put(name, personalInfo.get(name));
            }
        }
        return filteredWords;
    }
}
