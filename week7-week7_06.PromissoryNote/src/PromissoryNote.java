
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
public class PromissoryNote {
   private HashMap<String, Double> loan;
    public PromissoryNote() {
        loan = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value) {
        loan.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose) {
      if (loan.get(whose) == null) {
          return 0;
      }
        return loan.get(whose);

  
    }
    
}
