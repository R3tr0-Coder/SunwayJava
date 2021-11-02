package assignment2;

// patient is a person
public class Patient extends Person {
    
    private String ID;
    private Date dateOfBirth;
    private Doctor attendingPhysician;
    private Date admitDate;
    private Date dischargeDate;
    
    // patient class 3 dates object here
    // dob, admit date and discharge date
    // patient class has a doctor object here
    // we applied has a relationship here beside is a rship
    // thus we can reuse all the attributes and methods
    // in the person, date and doctor class
    
    public Patient()
    {
        super("", ""); // create person object
        ID = "";
        
        dateOfBirth = new Date(1, 1, 1900);
        attendingPhysician = new Doctor();
        admitDate = new Date(1, 1, 1900);
    } // default constructor
    
    // when we create a patient object we must create
    // person object first because of is a rship
    // and also create 3 date object - dob, admit date
    // and discharge date and one doctor object here
    
    public Patient(String id, String fName, String lName,
                    int bDay, int bMth, int bYear,
                    String docFrName, String docLaName, String docSpl,
                    int admDay, int admMth, int admYear,
                    int disChDay, int disChMth, int disChYear)
    {
        super(fName, lName); // refer to person class person(first,last)
        ID = id;
        dateOfBirth = new Date(bDay, bMth, bYear);
        attendingPhysician = new Doctor(docFrName, docLaName, docSpl);
        admitDate = new Date(admDay, admMth, admYear);
        dischargeDate = new Date(disChDay, disChMth, disChYear);
    } // overloaded constructor
    
    
    public void setInfo(String id, String fName, String lName,
                int bDay, int bMth, int bYear,
                String docFrName, String docLaName, String docSpl,
                int admDay, int admMth, int admYear,
                int disChDay, int disChMth, int disChYear)
    {
       // we need to call the setter method of person class
       // date class and doctor class here for us to update the value
        ID = id;
        setName(fName, lName);  // person class
        dateOfBirth.setDate(bDay, bMth, bYear);  // date class
        attendingPhysician.setName(docFrName, docLaName); // doctor class
        attendingPhysician.setSpeciality(docSpl); // doctor class
        admitDate.setDate(admDay, admMth, admYear); // date class
        dischargeDate.setDate(disChDay, disChMth, disChYear); // date class
    } // set info method, for you to update value after create object
    
    public String toString()
    {
        return "Patient: " + super.toString() + "\n"
                + "Attending Physician: " + attendingPhysician.toString()
                + "\n" + "Date of Birth: " + dateOfBirth.toString()
                + "\n" + "Admit Date: " + admitDate.toString()
                + "\n" + "Discharge Date: " + dischargeDate.toString()
                + "\n\n";
    } // display patients details, super.toString() refer to person class
    
    // setter and getter methods for the attributes and date, doctor objects
    public void setID(String id)
    {
        ID = id;
    }

    public String getID()
    {
        return ID;
    }

    public void setBirthDate(int bDay, int bMth, int bYear)
    {
        dateOfBirth.setDate(bDay, bMth, bYear);
    }
    
    public int getBirthDay()
    {
        return dateOfBirth.getDay();
    }

    public int getBirthMonth()
    {
        return dateOfBirth.getMonth();
    }

    public int getBirthYear()
    {
        return dateOfBirth.getYear();
    }
    
    public void setDoctorName(String fName, String lName)
    {
        attendingPhysician.setName(fName, lName);
    }

    public void setDoctorSpl(String spl)
    {
        attendingPhysician.setSpeciality(spl);
    }

    public String getDoctorFName()
    {
        return attendingPhysician.getFirstName();
    }

    public String getDoctorLName()
    {
        return attendingPhysician.getLastName();
    }

    public String getDoctorSpl()
    {
        return attendingPhysician.getSpeciality();
    }
    
    public void setAdmDate(int admDay, int admMth, int admYear)
    {
        admitDate.setDate(admDay, admMth, admYear);
    }

    public int getAdmDay()
    {
        return admitDate.getDay();
    }

    public int getAdmMonth()
    {
        return admitDate.getMonth();
    }

    public int getAdmYear()
    {
        return admitDate.getYear();
    }
    
    public void setDisDate(int disDay, int disMth, int disYear)
    {
        dischargeDate.setDate(disDay, disMth, disYear);
    }

    public int getDisDay()
    {
        return dischargeDate.getDay();
    }

    public int getDisMonth()
    {
        return dischargeDate.getMonth();
    }

    public int getDisYear()
    {
        return dischargeDate.getYear();
    }
}
