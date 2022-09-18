import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(160)<3){
           addObject(new Fish1(), 948, Greenfoot.getRandomNumber(240));
       }
       if(Greenfoot.getRandomNumber(150)<3){
           addObject(new Fish1(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Greenfoot.getRandomNumber(100)<1){
           addObject(new Fish1(), 948, Greenfoot.getRandomNumber(400));
       }
       if(Greenfoot.getRandomNumber(600)<2){
           addObject(new Predator3(), 948, Greenfoot.getRandomNumber(140));
       }
       if(Level3.score.getValue()>=250)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new WinPage());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,49,305);
        Fish1 fish1 = new Fish1();
        addObject(fish1,393,120);
        Fish2 fish2 = new Fish2();
        addObject(fish2,810,456);
        Fish3 fish3 = new Fish3();
        addObject(fish3,346,448);
        Fish3 fish32 = new Fish3();
        addObject(fish32,856,78);
        Fish2 fish22 = new Fish2();
        addObject(fish22,775,170);
        Fish1 fish12 = new Fish1();
        addObject(fish12,708,227);
        Fish2 fish23 = new Fish2();
        addObject(fish23,242,53);
        Fish1 fish13 = new Fish1();
        addObject(fish13,563,338);
        Predator3 predator3 = new Predator3();
        addObject(predator3,820,444);
        Fish3 fish33 = new Fish3();
        addObject(fish33,524,195);
        Fish2 fish24 = new Fish2();
        addObject(fish24,621,61);
        Predator3 predator32 = new Predator3();
        addObject(predator32,938,147);
        Fish3 fish34 = new Fish3();
        addObject(fish34,309,236);
        Fish2 fish25 = new Fish2();
        addObject(fish25,763,323);
        Fish1 fish14 = new Fish1();
        addObject(fish14,567,477);
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(0);
    }
}
