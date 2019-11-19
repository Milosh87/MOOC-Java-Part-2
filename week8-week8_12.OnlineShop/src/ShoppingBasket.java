
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class ShoppingBasket {
   private List<Purchase> purchases;
   public ShoppingBasket(){
       purchases = new ArrayList<Purchase>();
   }
    public void add(String product, int price){
       boolean exists = false;
        for(Purchase p: purchases){
           if(p.getProduct().equals(product)){
               p.increaseAmount();
               exists = true;
           }
       }
        if(!exists){
             purchases.add(new Purchase(product, 1, price));
        }
      
    }
    public int price(){
        int sum = 0;
        for(Purchase p: purchases){
            sum += p.price();
        }
        return sum;
    }
  public void print(){
       for(Purchase p: purchases){
           System.out.println(p);
       }
   }
  
}
