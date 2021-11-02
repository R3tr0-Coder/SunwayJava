package assignment1;

// Ryan Cheah Wei Ren
// 20018222
// 31/10/2020
// assignment 1, question 1 answers

import java.util.Scanner; // import scanner class

public class Question1 {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in); // create scanner object
        final double CARTON_CAPACITY = 3.78; // define constants
        
        // define variables
        double milkQuantity;
        double costOfOneLiter;
        double profitOnACarton;
        int noOfMilkCartons;
        double totalCostOfMilk;
        double profit;
        
        // prompt for data, get data from the user inputs
        System.out.print("Enter, in liters, the total quantity of the milk produced: ");
        milkQuantity = console.nextInt();
        System.out.println();
        
        System.out.print("Enter the cost of producing one liter of milk: ");
        costOfOneLiter = console.nextDouble();
        System.out.println();
        
        System.out.print("Enter the profit on each carton of milk: ");
        profitOnACarton = console.nextDouble();
        System.out.println();
        
        noOfMilkCartons = (int) (milkQuantity / CARTON_CAPACITY + 0.5);
                    totalCostOfMilk = milkQuantity * costOfOneLiter;
        profit = noOfMilkCartons * profitOnACarton;
        
        System.out.println("The number of milk cartons needed to hold milk: " + noOfMilkCartons);
        
        System.out.println("The cost of producing milk: $" + totalCostOfMilk);
        
        System.out.println("Profit: $" + profit);
        System.out.println();
    }
}
