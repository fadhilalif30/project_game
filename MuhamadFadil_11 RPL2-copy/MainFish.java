import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainFish extends Actor
{
    /**
     * Act - do whatever the MainFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-6);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+6);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,getY());
    
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());
    
        }
    }
    private void checkCollision(){
        if(isTouching(Fish1.class)){
            removeTouching(Fish1.class);
            MyWorld.score.add(2);
            Level2.score.add(9);
            Level3.score.add(13);
            
        }
        if(isTouching(Fish2.class)){
            removeTouching(Fish2.class);
            MyWorld.score.add(4);
            Level2.score.add(11);
            Level3.score.add(16);
            
        }
        if(isTouching(Fish3.class)){
            removeTouching(Fish3.class);
            Level2.score.add(19);
            Level3.score.add(25);
            
        }
    }
}
