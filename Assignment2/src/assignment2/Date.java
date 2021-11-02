package assignment2;

public class Date {
    
    private int dMonth;
    private int dDay;
    private int dYear;
    
    public Date()
    {
        dMonth = 1;
        dDay = 1;
        dYear = 1900;
    }
    
    public Date(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    } // create object with the value
    
    public void setDate(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    } // update value after object is created
    
    public int getMonth()
    {
        return dMonth;
    }
    
    public int getDay()
    {
        return dDay;
    }
    
    public int getYear()
    {
        return dYear;
    }
    
    public String toString()
    {
        return (dMonth + "-" + dDay + "-" + dYear);
    }
}
