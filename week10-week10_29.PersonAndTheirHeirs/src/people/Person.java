/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Milos
 */
public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        StringBuilder sb = new  StringBuilder();
        sb.append(name).append("\n");
        sb.append("  ").append(address);
        return sb.toString();
    }
}
