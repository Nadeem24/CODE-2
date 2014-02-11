import java.util.*;
/**
 * Write a description of class Champion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Champion
{
    // instance variables - replace the example below with your own
    private String name;
    private int skillLevel;
    private int hireFee;
    private ArrayList<ChampionState> champState = new ArrayList<ChampionState>();

    /**
     * Constructor for objects of class Champion
     */
    public Champion(String name)
    {
        this.name = name;
        skillLevel = 0;
        hireFee = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    {
        return name;
    }
    
    public int getSkillLevel()
    {
        return skillLevel;
    }
    
    public int getHireFee()
    {
        return hireFee;
    }
}
