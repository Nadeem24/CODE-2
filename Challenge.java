import java.util.*;
/**
 * Write a description of class Challenge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge
{
    // instance variables - replace the example below with your own
    private int challNum;
    private String enemyName;
    private int skillLevel;
    private int reward;
    private ArrayList<ChallengeType> challType = new ArrayList<ChallengeType>();

    /**
     * Constructor for objects of class Challenge
     */
    public Challenge(String eName, int sLevel, int reward)
    {
        this.challNum = challNum;
        enemyName = eName;
        skillLevel = sLevel;
        this.reward = reward;
    }
    
    public String getEnemyName()
    {
        return enemyName;
    }
    
    public int getskillLevel()
    {
        return skillLevel;
    }
    
    public int getReward()
    {
        return reward;
    }
}
