
/**
 * 
 *
 * @author (julie)
 * @version (2022)
 */
public class Guest
{
    // instance variables 
    private String name;
    private int age;

    /**
     * Constructor
     */
    public Guest(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /**
     *
     */
    public String getName()
    {
        return name;
    }
    
    /**
     *
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     *
     */
    public void skrivGuest()
    {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        
    }
}
