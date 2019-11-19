/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Calculator {
           private Reader sc;
            private int calculations;
            public Calculator(){
                sc = new Reader();
            }
               public void start() {
        while (true) {
            System.out.print("command: ");
            String command = sc.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
      private void sum()  { 
         int [] numbers = twoNumbers();        
       System.out.println("Sum of the values " + (numbers[0] + numbers[1]));
       calculations++;
      }
      private void difference()  { 
          int [] numbers = twoNumbers();
       System.out.println("Difference of the values " + (numbers[0] - numbers[1]));
       calculations++;
      }
      private void product()  { 
        int [] numbers = twoNumbers();  
       System.out.println("Product of the values " + (numbers[0] * numbers[1]));
       calculations++;
      }
      private void statistics() {
          System.out.println("Calculations done " + calculations);
      }
      private int [] twoNumbers() {
          int [] values= new int[2];
          System.out.print("value1: ");
        values[0] = sc.readInteger();
       System.out.print("value2: ");
        values[1] = sc.readInteger();
        return values;
      }
}
