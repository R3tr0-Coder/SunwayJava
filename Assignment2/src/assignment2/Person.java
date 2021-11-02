package assignment2;

// this class will serve as a base class to create another
// subclass later
public class Person {
    
    protected String firstName;
    protected String lastName;
    
    public Person()
    {
        firstName = "";
        lastName = "";
    }
    
    public Person(String first, String last)
    {
        firstName = first;
        lastName = last;
    }
    
    public String toString()
    {
        return (firstName + " " + lastName);
    }
    
    public void setName(String first, String last)
    {
        firstName = first;
        lastName = last;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
}
