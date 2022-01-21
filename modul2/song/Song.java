
/**
 * 
 *
 * @author (Julie Larsen)
 * @version (January 2022)
 */
public class Song
{
    private String name;
    private String genre;
    private String mood;
    

    
    public Song (String songName,String songGenre)
    {
        name = songName;
        genre = songGenre;
        
    }

    /**
     * @Return the songs name
     */
    public String getName()
    {
        return name;
    }
    
 
    /**
     * Returns the song genre
     */
    public String getGenre()
    {
    return genre;
    }   
     
    public String getMood() {
    if (this.mood != null) {
        return this.mood;
    } else { 
        return "no mood set";
    }
    

    }
    public void setMood (String mood) {
        this.mood = mood;
    
    }
    /**
     * Prints name
     */
    public void printName()
    {
    System.out.println(name);
    
    }
    //* Prints mood
    public void printMood()
    {
    System.out.println(mood);
    }
    //* Prints details (name,mood,genre)
    public void printDetails()
    {
    System.out.println(name);
    System.out.println(mood);
    System.out.println(genre);
    }
    
    
}
    
        
    
    
    
    
        
            
