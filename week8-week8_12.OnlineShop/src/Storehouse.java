/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */

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
public class Storehouse {
   private Map<String, Integer> products = new HashMap<String, Integer>();
   private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        stocks.put(product, stock);
    }
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        } else return -99;
    }
    public int stock(String product){
        if(stocks.containsKey(product)){
        return stocks.get(product);
        } else return 0;
    }
    public boolean take(String product) {
        if(products.containsKey(product)){
            if(stocks.get(product) > 0){
            stocks.put(product, stocks.get(product)-1);
            return true;
            } else return false;
        }
        else return false;
    }
    public Set<String> products() {
        Set<String> proizvodi = new HashSet<String>();
        for(String p: products.keySet()){
            proizvodi.add(p);
        }
        return proizvodi;
    }
}
