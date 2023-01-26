import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paranas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paranas extends enemy
{
    /**
     * Act - do whatever the Paranas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        wrapAtEdge();
    }
}
   
