package assignment1;

// Ryan Cheah Wei Ren
// 20018222
// 31/10/2020
// assignment 1, question 3 answers

import java.util.Scanner;

public class Question3 {

    static Scanner console = new Scanner(System.in);
        
    static final double FRAME_WIDTH = 1.0;
    static final double COLOR_FRAME_COST = 0.10;
    static final double REG_FRAME_COST = 0.15;
    static final double FANCY_FRAME_COST = 0.25;
    static final double CARDBOARD_PAPER_COST = 0.02;
    static final double GLASS_COST = 0.07;
    static final double CROWN_COST = 0.35;
        
        
    public static void main(String[] args) {
        
        double width;
        double colorCost;
        double cardBoardAndGlassCost;
        double costOfCrowns;   
        double length, frameLength, framePrice;
        
        String colourType, frameType, askCrown;
        
        int numberOfCrowns;
        
        System.out.print("Hello! Welcome to the place you can customize your own picture frame!");
        
        System.out.print("\nEnter length of picture frame in inches: ");
        length = console.nextDouble();
        
            System.out.print("Enter width of picture frame in inches: ");
            width = console.nextDouble();
            System.out.println();
            
                System.out.println("Enter type of frame(Regular(R/r), Fancy(F/f): ");
                frameType = console.next();
                System.out.println();
                
                if ( frameType.equalsIgnoreCase("r") )
                {
                    System.out.println("Enter the color of the frame: ");
                    colourType = console.next();
                    System.out.println();
                    
                    System.out.println("Add crowns to frame? Y/N: ");
                    askCrown = console.next();
                    System.out.println();
                    
                    if ( askCrown.equalsIgnoreCase("y") )
                    {
                        System.out.println("Add how many crowns?: ");
                        numberOfCrowns = console.nextInt();
                        System.out.println();
                        
                        frameLength = length + width + (FRAME_WIDTH * 4);
                        colorCost = frameLength * COLOR_FRAME_COST;
                        cardBoardAndGlassCost = (length * width) *
                                (CARDBOARD_PAPER_COST + GLASS_COST);
                        costOfCrowns = numberOfCrowns * CROWN_COST;
                        
                        framePrice = colorCost + frameLength + cardBoardAndGlassCost + costOfCrowns;
                        
                        System.out.println("Cost of framing the picture: " + framePrice);
                    }
                    
                    else if ( askCrown.equalsIgnoreCase("n") )
                    {
                        frameLength = length + width + (FRAME_WIDTH * 4);
                        colorCost = frameLength * COLOR_FRAME_COST;
                        cardBoardAndGlassCost = (length * width) *
                                (CARDBOARD_PAPER_COST + GLASS_COST);
                        
                        framePrice = colorCost + frameLength + cardBoardAndGlassCost;
                        
                        System.out.println("Cost of framing the picture: " + framePrice);
                    }
                    
                    else
                    {
                        System.out.println("ERROR ON ASKCROWN");
                    }
                }
                
                else if ( frameType.equalsIgnoreCase("f") )
                {
                    System.out.println("Enter the color of the frame: ");
                    colourType = console.next();
                    System.out.println();
                    
                    System.out.println("Add crowns to frame? Y/N: ");
                    askCrown = console.next();
                    System.out.println();
                    
                    if ( askCrown.equalsIgnoreCase("y") )
                    {
                        System.out.println("Add how many crowns?: ");
                        numberOfCrowns = console.nextInt();
                        System.out.println();
                        
                        frameLength = length + width + (FRAME_WIDTH * 4);
                        colorCost = frameLength * COLOR_FRAME_COST;
                        cardBoardAndGlassCost = (length * width) *
                                (CARDBOARD_PAPER_COST + GLASS_COST);
                        costOfCrowns = numberOfCrowns * CROWN_COST;
                        
                        framePrice = colorCost + frameLength + cardBoardAndGlassCost + costOfCrowns;
                        
                        System.out.println("Cost of framing the picture: " + framePrice);
                    }
                    
                    else if ( askCrown.equalsIgnoreCase("n") )
                    {    
                        frameLength = length + width + (FRAME_WIDTH * 4);
                        colorCost = frameLength * COLOR_FRAME_COST;
                        cardBoardAndGlassCost = (length * width) *
                                (CARDBOARD_PAPER_COST + GLASS_COST);
                        
                        framePrice = colorCost + frameLength + cardBoardAndGlassCost;
                        
                        System.out.println("Cost of framing the picture: " + framePrice);
                    }
                }
    }   
}