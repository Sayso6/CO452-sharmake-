import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishPlayer extends mover
{
    /**
     * Act - do whatever the FishPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    //Create our Constructor method
    public FishPlayer()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
   public void act()
    {
        slideAround();
        collectitem();
        mainPlayerHit();
    }
    public void mainPlayerHit()
    {
        if(hitEnemy())
        {
            setLocation(41,466);
        }
    }
}
