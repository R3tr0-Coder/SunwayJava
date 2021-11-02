package assignment2;

// one bill issued for one patient

public class Bill {
    
    private String ID;
    private double pharmacyCharges;
    private double roomRent;
    private double doctorFee;
    
    public Bill() // default constructor
    {
        ID = "";
        pharmacyCharges = 0.0;
        roomRent = 0.0;
        doctorFee = 0.0;
    }
    
    public Bill(String id, double phCharges, double rRent, double docFee)
    {
        ID = id;
        pharmacyCharges = phCharges;
        roomRent = rRent;
        doctorFee = docFee;
    } // update object details after you create them, aka sql updates command
    
    public void setInfo(String id, double phCharges, double rRent, double docFee)
    {
        ID = id;
        pharmacyCharges = phCharges;
        roomRent = rRent;
        doctorFee = docFee;
    } // update object details after you create them, aka sql updates command
    
    public double billingAmount()
    {
        return pharmacyCharges + roomRent + doctorFee;
    } // calculate total bill
    
    public String toString()
    {
        String str;
        
        str =  String.format("%s%.2f%n%s%.2f%n%s%.2f%n%s %n%s%.2f%n",
                             "Pharmacy Charges: $", pharmacyCharges,
                             "Room Charges:     $", roomRent,
                             "Doctor's Fees:    $", doctorFee,
                             "______________________________ ",
                             "Total Charges:    $",
                             (pharmacyCharges + roomRent + doctorFee));
        
        return str;
    } // display the bill details with formatted text, 2 decimal places
    
    // setter, getter methods as well as update methods
    public void setID(String id)
    {
        ID = id;
    }

    public String getID()
    {
        return ID;
    }

    public void setPharmacyCharges(double charges)
    {
        pharmacyCharges = charges;
    }

    public double getPharmacyCharges()
    {
        return pharmacyCharges;
    }
    
    public void updatePharmacyCharges(double charges)
    {
        pharmacyCharges = pharmacyCharges + charges;
    }

    public void setRoomRent(double charges)
    {
        roomRent = charges;
    }

    public double getRoomRent()
    {
        return roomRent;
    }

    public void updateRoomRent(double charges)
    {
        roomRent = roomRent + charges;
    }
    
    public void setDoctorFee(double charges)
    {
        doctorFee = charges;
    }

    public double getDoctorFee()
    {
        return doctorFee;
    }

    public void updateDoctorFee(double charges)
    {
        doctorFee = doctorFee + charges;
    }
}
