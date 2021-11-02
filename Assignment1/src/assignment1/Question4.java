package assignment1;

// full name
// student id
// date
// assignment 1, question 4 answers

import java.util.Scanner; // import scanner class

public class Question4 {

    static Scanner console = new Scanner(System.in);
    
    static final double SENIOR_CITIZEN_DISCOUNT = 0.30;
    static final double TWELVE_OR_MORE_MONTHS_MEMBERSHIP_DISCOUNT = 0.15;
    static final double SIX_OR_MORE_PERSONAL_TRAINING_SESSIONS_DISCOUNT = 0.20;
    
    // we need to access the scanner object console and these constants
    // in other methods besides main() methods thus we define here
    // we use static keywords here because all the methods below are static methods
    
    // main method here
    public static void main(String[] args) {
        // we need to prompt the user to input the required data here
        
        boolean seniorCitizen;
        boolean boughtSixOrMoreSessions;
        boolean paidTwelveOrMoreMonths;
        
        int numberOfMembershipMonths;
        int numberOfPersonalTrainingSessions;
        double regularMembershipChargesPerMonth;
        double costOfOnePersonalTrainingSession;
        
        char response;
        double memberCost;
        
        displayCenterInfo(); // call this method to display info
        
        System.out.println("Enter the cost of a regular membership per month: ");
        regularMembershipChargesPerMonth = console.nextDouble();
        System.out.println();
        
        System.out.println("Enter the cost of one personal training session: ");
        costOfOnePersonalTrainingSession = console.nextDouble(); // get first char only
        System.out.println();
        
        System.out.println("Are you a senior citizen (Y,y/N,n): ");
        response = console.next().charAt(0);
        System.out.println();
        
        if (response == 'Y' || response == 'y') // if the use type Y or y
            seniorCitizen = true;
        else
            seniorCitizen = false;
        
        System.out.print("Enter the number of personal training sessions "
                                                            + "bought: ");
        numberOfPersonalTrainingSessions = console.nextInt();
        System.out.println();
        
        if (numberOfPersonalTrainingSessions > 5)
            boughtSixOrMoreSessions = true; // give 20% discount
        else
            boughtSixOrMoreSessions = false;
        
        System.out.print("Enter the number of months you are paying for: ");
        numberOfMembershipMonths = console.nextInt();
        System.out.println();
        
        if (numberOfMembershipMonths >= 12)
            paidTwelveOrMoreMonths = true;
        else
            paidTwelveOrMoreMonths = false;
        
        // call the method to calculate the cost with the relevant data
        // then display the total cost of membership
        
        memberCost = membershipCost(regularMembershipChargesPerMonth,
                                    numberOfMembershipMonths,
                                    costOfOnePersonalTrainingSession,
                                    numberOfPersonalTrainingSessions,
                                    seniorCitizen, boughtSixOrMoreSessions,
                                    paidTwelveOrMoreMonths);
        
        System.out.println("The membership cost $" + memberCost);
    }
    
    // user define method
    public static void displayCenterInfo()
    {
        System.out.println("Welcome to Stay Healthy and Fit center.");
        System.out.println("This program determines the cost of a new membership.");
        System.out.println("If you are not a senior citizen, then the discount is 30% off " 
                            + " of the regular membership price.");
        System.out.println("If you buy a membership for twelve months and pay " 
                            + "today, the discount is 15%.");
        System.out.println("If you buy and pay today, the discount on each " 
                            + "session is 20%");
    }
    
    // user define method 2
    public static double membershipCost(double regMemPricePerMth, int nOfMonths,
                                        double personalTrSesCost, int nOfPersonalTrSess,
                                        boolean senCitizen, boolean bSixOrMoreSess,
                                        boolean paidTwMnth)
    {
        double cost = 0.0;
        
        if (nOfMonths >= 12) // give 15% discount, minimum 1 years
            cost = regMemPricePerMth * nOfMonths *
                    (1 - TWELVE_OR_MORE_MONTHS_MEMBERSHIP_DISCOUNT);
        else // less than 1 year
            cost = regMemPricePerMth * nOfMonths; // no 15% discount
        // if you sign up 1 years and above you will get 15% discount
        
        if (senCitizen) // give 30% discount for senior citizen
            cost = cost * (1 - SENIOR_CITIZEN_DISCOUNT);
        
        if (bSixOrMoreSess) // if buy more than 5 sessions, give 20% discount
            cost = cost + personalTrSesCost * nOfPersonalTrSess
                    * (1 - SIX_OR_MORE_PERSONAL_TRAINING_SESSIONS_DISCOUNT);
        else // less than 5 sessions, no 20% discount
            cost = cost + personalTrSesCost * nOfPersonalTrSess;
        
        return cost;
    }
    
}
