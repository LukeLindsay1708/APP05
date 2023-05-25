import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 */
public class KongWorld extends World
{
    public static final int MAXN_BANANA1 = 10;
    public static final int MAXN_BANANA2 = 20;
    public static final int MAXN_BANANA3 = 30;
    
    private Kong kong;
    private Barrel barrel;
    private Banana1[] Banana1;
    private Banana2[] Banana2;
    private Banana3[] Banana3; 
    private int barrelSize = 30;
    private int remainingBanana1= MAXN_BANANA1;
    private int remainingBanana2= MAXN_BANANA2;
    private int remainingBanana3= MAXN_BANANA3;
    private Random generator = new Random();
    private Counter score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public KongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        kong = new Kong();
        addObject(kong, 200, 200);
        
        barrel = new Barrel();
        addBarrel();
        addBarrel();
        addBarrel();
        addBarrel();
        addBarrel();
        addBarrel();
        addBarrel();
        addBarrel();
      
        
        Banana1 = new Banana1[10];
        addBanana1();
        addBanana1();
        addBanana1();
        
        Banana2 = new Banana2[20];
        addBanana2();
        addBanana2();
        addBanana2();
        
        Banana3 = new Banana3[30];
        addBanana3();
        addBanana3();
       
      
        
        setupScore();
    }
    
    public void addBanana1()
    {
        createBanana1();
    }
    
    public void addBanana2()
    {
        createBanana2();
    }
    
    public void addBanana3()
    {
        createBanana3();
    }
    
    public void addBarrel()
    {
        createBarrel();
    }
    
    private void createBarrel()
    {
    Barrel barrel = new Barrel();
    int x = generator.nextInt(getWidth());
    int y = generator.nextInt(getHeight());
        
         addObject(barrel, x, y);
    }
    
    private void createBanana1()
    {
        Banana1 banana1 = new Banana1();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(banana1, x, y);
        
    }
    
    private void createBanana2()
    {
        Banana2 banana2 = new Banana2();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(banana2, x, y);
        
    }
    
    private void createBanana3()
    {
        Banana3 banana3 = new Banana3();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
         addObject(banana3, x, y);
        
    }
    
    public void score()
    {
    }
    
    public void Counter()
    {
    }
    
    private void setupScore()
    {
        score = new Counter("Score: ");
        addObject (score, 60, 30);
    }
    
    
    public void loseGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
    
   public void winGame()
    {
        showText("Game Over: You have Won!", 400, 300);
    }    
}
