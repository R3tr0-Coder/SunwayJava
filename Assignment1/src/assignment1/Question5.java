package assignment1;

// Ryan Cheah Wei Ren
// 20018222
// 31/10/2020
// assignment 1, question 5 answers

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        // create swimming pool object
        Scanner console = new Scanner(System.in);
        SwimmingPool pool = new SwimmingPool(30, 15, 10, 0, 0, 0);
        
        // define variables, prompt the user to input these data
        int waterFRate;
        int time;
        
        // display swimming pool data
        System.out.println("Pool data: ");
        System.out.println(" Length: " + pool.getLength());
        System.out.println(" Width: " + pool.getWidth());
        System.out.println(" Depth: " + pool.getDepth());
        System.out.println(" Total water in the pool: "
                          + pool.getTotalWaterInPool());
        
        // prompt the user to input data
        System.out.println("To completely fill the pool: ");
        System.out.println(" Enter water fill in rate (in gallons per minutes): ");
        waterFRate = console.nextInt();
        System.out.println();
        
        pool.setWaterFlowRateIn(waterFRate);
        time = pool.timeToFillThePool(); // calculate the time to fill in pool
        
        System.out.println(" Time to fill the pool is approximately: "
                           + time / 60 + " hour(s) and " + time % 60
                           + " minutes(s).");
        
        pool.addWater(time, waterFRate); // add water into pool
        
        // display updated value after we add water into the pool
        System.out.println(" Total water in the pool: "
                          + pool.getTotalWaterInPool());
        
        // then we can drain the pool
        
        // next we need to prompt the user to input water flow out rate
        // prompt the user to input data
        System.out.println("To completely drain the pool: ");
        System.out.println(" Enter water fill out rate (in gallons per minutes): ");
        int waterFOutRate = console.nextInt();
        System.out.println();
        
        pool.setWaterFlowRateOut(waterFOutRate);
        int time2 = pool.timeToDrainThePool();
        
        System.out.println(" Time to drain the pool is approximately: "
                          + time2 / 60 + " hour(s) and " + time2 % 60
                          + " minute(s).");
        
        pool.drainWater(time2, waterFOutRate);
        // the pool is empty now
        System.out.println(" Total water in the pool: "
                          + pool.getTotalWaterInPool());
    }
    
}
