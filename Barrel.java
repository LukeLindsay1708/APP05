import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;
import java.io.File;

/**
     * Luke n Euan
     * DK World Game for Derek!
     */
public class Barrel extends Characters
{
    private int speed = 3;
    private Random generator = new Random();
    
   
    public void act()
    {
        // Add your action code here.
        move(speed);
        if(atWorldEdge())
    { 
        turn(120);
         
    }
    
    if(eat(Kong.class) == true)
    {
        Greenfoot.playSound("au.wav");
    }
}
}