import greenfoot.*;

public class Timer extends Actor {
    private int timer;

    public Timer() {
        timer = 30;
        setImage(new GreenfootImage("Time: " + timer, 24, Color.WHITE, Color.BLACK));
    }

    public void act() {
        if (timer > 0) {
            timer--;
            setImage(new GreenfootImage("Time: " + timer, 24, Color.WHITE, Color.BLACK));
        } else {
            setImage(new GreenfootImage("Time's up!", 24, Color.WHITE, Color.BLACK));
        }
    }
    
    
}
