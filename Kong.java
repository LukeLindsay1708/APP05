import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Kong extends Characters
{
    protected int width=10;
    protected int height=10;
    
    protected int speed = 3;
    protected int turnAngle = 4;
    
    protected GreenfootImage image;
    
    private KongWorld world;
    
    public Kong()
    {
        image = getImage();
        
        width = image.getWidth();
        height = image.getHeight();
        image.scale((int)(width * 0.06), (int)(height * 0.06));
    }
     
     
    /**
     * This method allows the user to move DK so that when
     * it eats a banana, DK gets a higher score. (the bigger the
     * bunch of bananan the more the score is to increase.
     */
    public void act()
    {
        turnAndMove(); 
        if(eat(Banana1.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Banana1(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
        if(eat(Banana2.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Banana2(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(2);
        }
        if(eat(Banana3.class)==true)
        {
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Banana3(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(3);
        }
    }
    

    
    /**
     * This method rotates the DK avatar a small amount to the
     * left or to the right, and then he moves in that
     * direction
     */
    public void turnAndMove()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-turnAngle);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(turnAngle);
        }  
        
        if(Greenfoot.isKeyDown("space"))
        {
             move(speed);    
        }         
    }
    
    /**
     * This method moves the DK around in four directions
     * left, right, up and down using coordinate positions. 
     * It must not move off the screen.
     */
    public void move4Ways()
    {
        int x = getX(); int y = getY();
        int halfWidth = width / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            setRotation(270);
            x -= speed;
        }
        
        if(Greenfoot.isKeyDown("right") && !isAtEdge())
        {
            setRotation(90);
            x += speed;
        }        
        
        if(Greenfoot.isKeyDown("down") && !isAtEdge())
        {
            setRotation(180);
            y += speed;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > speed)
        {
            setRotation(0);
            y -= speed;
        }
        
        setLocation(x, y);        
    }
}
