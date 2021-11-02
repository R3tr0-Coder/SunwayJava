package assignment1;

// Ryan Cheah Wei Ren
// 20018222
// 31/10/2020
// assignment 1, question 5 answers

public class SwimmingPool {

    // private data attributes
    private final double GALLONS_IN_A_CUBIC_FEET = 7.48;
    
    private double length;
    private double width;
    private double depth;
    private double waterFlowInRate;
    private double waterFlowOutRate;
    private double amountOfWaterInPool;
    
    // default constructor
    public SwimmingPool()
    {
        length = 0;
        width = 0;
        depth = 0;
        waterFlowInRate = 0;
        waterFlowOutRate = 0;
        amountOfWaterInPool = 0;
    }
    
    // overloaded constructor
    public SwimmingPool(double l, double w, double d,
                        double fi, double fo, double wInPool)
    {
        length = l;
        width = w;
        depth = d;
        waterFlowInRate = fi;
        waterFlowOutRate = fo;
        amountOfWaterInPool = wInPool;
    }
    
    // setter methods for all attributes
    public void set(double l, double w, double d,
                        double fi, double fo, double wInPool)
    {
        length = l;
        width = w;
        depth = d;
        waterFlowInRate = fi;
        waterFlowOutRate = fo;
        amountOfWaterInPool = wInPool;
    }
    
    public void setWaterFlowRateIn(double fi)
    {
        waterFlowInRate = fi;
    } // we need this individual setter methods later
    
    // calculate the swimming pool capacity
    public double poolTotalWaterCapacity()
    {
        return length * width * depth * GALLONS_IN_A_CUBIC_FEET;
    }
    
    // add water into swimming pool
    public void addWater(double time, double fillRate)
    {
        // local variable
        amountOfWaterInPool = amountOfWaterInPool + time * fillRate;
        
        // check capacity regularly
        if (amountOfWaterInPool > poolTotalWaterCapacity())
        {
            amountOfWaterInPool = poolTotalWaterCapacity();
            System.out.println("Pool overflow.");
        }
    } // end of add water method
    
    // drain water from the swimming pool
    public void drainWater(double time, double drainRate)
    {
        // local variables
        amountOfWaterInPool = amountOfWaterInPool - time * drainRate;
        
        if (amountOfWaterInPool < 0)
            amountOfWaterInPool = 0;
    } // end of method
    
    // calculate how much time to fill in the pool completely
    public int timeToFillThePool()
    {
        return (int) ((poolTotalWaterCapacity() - amountOfWaterInPool)
                                        / waterFlowInRate + 0.5);
    }
    
    // calculate how much time to drain out the pool completely
    public int timeToDrainThePool()
    {
        return (int) (amountOfWaterInPool / waterFlowOutRate + 0.5);
    }
    
    // calculate how much water is need to fill in the pool completely
    public double waterNeededToFillThePool()
    {
        if (amountOfWaterInPool < poolTotalWaterCapacity())
            return poolTotalWaterCapacity() - amountOfWaterInPool;
        else
            return 0; // exceed capacity of the pool, return 0, full already
    }  
    
    // getter methods here
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getDepth()
    {
        return depth;
    }
    
    public double getWaterFlowRateIn()
    {
        return waterFlowInRate;
    }
    
    public double getWaterFlowRateOut()
    {
        return waterFlowOutRate;
    }
    
    public double getTotalWaterInPool()
    {
        return amountOfWaterInPool;
    }
    
    public void setWaterFlowRateOut(double fo)
    {
        waterFlowOutRate = fo;
    } // add this method

}

