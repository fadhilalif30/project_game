import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(90) < 3){
            addObject(new Fish1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3){
            addObject(new Fish2(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new Predator1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(MyWorld.score.getValue()>=50)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Level2());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,47,292);
        Fish1 fish1 = new Fish1();
        addObject(fish1,569,130);
        Fish1 fish12 = new Fish1();
        addObject(fish12,459,206);
        Fish1 fish13 = new Fish1();
        addObject(fish13,694,206);
        Fish2 fish2 = new Fish2();
        addObject(fish2,593,241);
        Fish2 fish22 = new Fish2();
        addObject(fish22,774,449);
        Predator1 predator1 = new Predator1();
        addObject(predator1,861,122);
        Predator1 predator12 = new Predator1();
        addObject(predator12,450,485);
        Fish2 fish23 = new Fish2();
        addObject(fish23,891,202);
        Fish1 fish14 = new Fish1();
        addObject(fish14,645,481);
        Fish2 fish24 = new Fish2();
        addObject(fish24,358,331);
        Fish1 fish15 = new Fish1();
        addObject(fish15,720,93);
        Fish1 fish16 = new Fish1();
        addObject(fish16,873,498);
        Fish2 fish25 = new Fish2();
        addObject(fish25,948,333);
        Fish2 fish26 = new Fish2();
        addObject(fish26,517,361);
        Fish1 fish17 = new Fish1();
        addObject(fish17,760,330);
    }
}
