
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Menu {
   private Scanner sc;
   private PhoneBook phonebook;
    public Menu(Scanner sc){
        this.sc = sc;
        this.phonebook = new PhoneBook();
    }
    
    private void menu(){
        System.out.println("phone search\n" +
"available operations:\n" +
" 1 add a number\n" +
" 2 search for a number\n" +
" 3 search for a person by phone number\n" +
" 4 add an address\n" +
" 5 search for personal information\n" +
" 6 delete personal information\n" +
" 7 filtered listing\n" +
" x quit");
        System.out.print("Command: ");
    }
    private void select(String s){
        int n = Integer.parseInt(s);
        switch(n){
            case 1:
                addNumber();
                break;
            case 2:             
                searchNumber();
                break;
            case 3:
                searchForName();
                break;
            case 4:
                addAdress();
                break;
            case 5:
                personalInfo();
                break;
            case 6:
                removePersonalInfo();
                break;
            case 7:
                filterByWord();
                break;
        }
    }
    public void addNumber(){
        System.out.print("whose number: ");
        String name = sc.nextLine();
        System.out.print("number: ");
        String number = sc.nextLine();
        phonebook.addNumber(name, number);
    }
    public void searchNumber(){
        System.out.print("whose number: ");
        String name = sc.nextLine();
        phonebook.searchForNumber(name);
    }
    public void searchForName(){
        System.out.print("number: ");
        String number = sc.nextLine();
        String name = phonebook.searchForName(number);
        System.out.println(" " + name);
    }
    public void start(){
        while(true){
          menu();
          String n = sc.nextLine();
          if(n.equals("x")){
              break;
          }
          select(n);
        }
    }
    public void addAdress(){
        System.out.print("whose address: ");
        String name = sc.nextLine();
        System.out.print("street: ");
        String street = sc.nextLine();
        System.out.print("city: ");
        String city = sc.nextLine();
        phonebook.addAdress(name, street, city);
    }
    public void personalInfo(){
        System.out.print("whose information: ");
        String name = sc.nextLine();
        Person searchedPerson = phonebook.personalInfoSearch(name);
        if(searchedPerson == null){
            System.out.println("\t not found");
        }
        else System.out.println(searchedPerson.personalInformation());
    }
    public void removePersonalInfo(){
        System.out.println("whose information: ");
        String name = sc.nextLine();
        phonebook.removePersonalInfo(name);
    }
    public void filterByWord(){
        System.out.print("keyword (if empty, all listed): ");
        String word = sc.nextLine();
        System.out.println();
        Map<String, Person> filtrirana = phonebook.filterByWord(word);
        TreeMap<String, Person> sorted = new TreeMap<String, Person>(filtrirana);
        if(sorted.isEmpty()){
            System.out.println("not found");
        }
        for(String name: sorted.keySet()){
            System.out.println(" "+ name);
            System.out.println(filtrirana.get(name).personalInformation());
        }
    }
}
