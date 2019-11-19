/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Milos
 */
public class ProductContainerRecorder extends ProductContainer{
        private ContainerHistory containerHistory = new ContainerHistory();
    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        containerHistory.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    public String history(){
        return containerHistory.toString();
    }
   @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        containerHistory.add(super.getVolume());
    }
    public double takeFromTheContainer(double amount){
        double result = super.takeFromTheContainer(amount);
        containerHistory.add(super.getVolume());
        return result;
    }
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + containerHistory.toString());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
}
