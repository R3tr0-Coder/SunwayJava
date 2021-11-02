package assignment2;

public class Question3 {

    public static void main(String[] args) {
        
        // you need to create a patient object
        // and bill object here
        // then display patient and bill object
        // no need to prompt the user for input
        // DIY 10 minutes
        
        Patient p1 = new Patient("P01", "Ali", "Mohd", 8, 11, 1983, "Dr Abu", "Mohd", "Specialist in Heart", 7, 11, 2020, 11, 11, 2020);
        System.out.println("Display Patient Details");
        System.out.println(p1.toString());
        
        
        Bill b1 = new Bill();
        b1.setInfo("P01", 200, 300, 150);
        System.out.println("Total bill is: " +b1.billingAmount());
        b1.updateDoctorFee(300); // add 300 to current fees
        b1.updatePharmacyCharges(200);// add 200 to current fees
        b1.updateRoomRent(150);// add 150 to current fees
        System.out.println("Updated Total bill is: " +b1.billingAmount());
        
        System.out.println("details of the bill");
        System.out.println(b1.toString());
    }
    
}
