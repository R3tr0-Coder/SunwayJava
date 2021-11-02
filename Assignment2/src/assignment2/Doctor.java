package assignment2;

// doctor is a person
// doctor is a derived class, it derived all the attributes
// and methods from person class with extends keywords

public class Doctor extends Person {
    
    private String speciality;
    
    // we dont need to define first name and last name here
    // because doctor class will inherit those protected
    // variables from person class, same for the public
    // methods defined in the person class
    
    public Doctor()
    {
        super(); // refer to person()
        speciality = "";
    }
    
    public Doctor(String first, String last, String spl)
    {
        super(first,last); // refer to person(first,last)
        speciality = spl;
    }
    
    public void setSpeciality(String spl)
    {
        speciality = spl;
    }
    
    public String getSpeciality()
    {
        return speciality;
    }
    
    public String toString()
    {
        return super.toString() + " " + speciality;
    }
    
    // super.toString refer to person class
    // toString method to display first name and last name
}
