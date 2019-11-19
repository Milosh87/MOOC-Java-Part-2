/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Milos
 */
public class Employees {
    private List<Person> spisak;
    public Employees(){
        spisak = new ArrayList<Person>();
    }
    
    public void add(Person person){
        spisak.add(person);
    }
    public void add(List<Person> persons){
        spisak.addAll(persons);
    }
    public void print(){
        Iterator<Person> iterator = spisak.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
       Iterator<Person> iterator = spisak.iterator();
        while(iterator.hasNext()){
            Person currentPerson = iterator.next();
            if(currentPerson.getEducation().equals(education)){
                System.out.println(currentPerson);
            }
        }
    }
    public void fire(Education education){
         Iterator<Person> iterator = spisak.iterator();
        while(iterator.hasNext()){
            Person currentPerson = iterator.next();
            if(currentPerson.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
