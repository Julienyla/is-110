import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author (julie)
 * @version (2022)
 */
public class room
{
    // instance variables 
    private String hotel;
    private int capacity;
    private Guest guests;
    

    /**
     * Constructor for objects of class room
     */
    public room(String hotel, int capacity)
    {
        this.hotel = hotel;
        this.capacity = capacity;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    
    public void setHotel(String hotel)
    {
        hotel = hotel;
    }
    
    public void addGuest(String name, int age)
    {
        guests = new Guest(name, age);
        
        if (age <= 17) {
            System.out.println ("you are not old enough");
        }
        else { 
            System.out.println ("you are now checked in");
    }
    }
   
    public void skrivLastGuest()
    {
        guests.skrivGuest();
    }
}
    
    

    