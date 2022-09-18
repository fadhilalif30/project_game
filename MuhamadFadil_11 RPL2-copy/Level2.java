import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class Level2.
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    public void act()
    {
       if(Greenfoot.getRandomNumber(160)<3){
           addObject(new Fish1(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Greenfoot.getRandomNumber(90)<3){
           addObject(new Fish2(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Greenfoot.getRandomNumber(90)<3){
           addObject(new Fish3(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Greenfoot.getRandomNumber(150)<3){
           addObject(new Predator1(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Greenfoot.getRandomNumber(250)<3){
           addObject(new Predator2(), 948, Greenfoot.getRandomNumber(360));
       }
       if(Level2.score.getValue()>=50)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Level3());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,34,291);
        Fish1 fish1 = new Fish1();
        addObject(fish1,829,352);
        Fish1 fish12 = new Fish1();
        addObject(fish12,872,367);
        Fish1 fish13 = new Fish1();
        addObject(fish13,804,372);
        Fish1 fish14 = new Fish1();
        addObject(fish14,693,273);
        Fish1 fish15 = new Fish1();
        addObject(fish15,689,321);
        Fish1 fish16 = new Fish1();
        addObject(fish16,737,297);
        Fish2 fish2 = new Fish2();
        addObject(fish2,927,153);
        Fish2 fish22 = new Fish2();
        addObject(fish22,881,196);
        Fish2 fish23 = new Fish2();
        addObject(fish23,926,221);

        Predator2 predator22 = new Predator2();
        addObject(predator22,562,54);
        Fish3 fish3 = new Fish3();
        addObject(fish3,497,417);
        Fish3 fish32 = new Fish3();
        addObject(fish32,800,57);
        Fish3 fish33 = new Fish3();
        addObject(fish33,431,453);

        Fish3 fish34 = new Fish3();
        addObject(fish34,455,316);

        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(0);
        
        Fish3 fish35 = new Fish3();
        addObject(fish35,608,530);
        Fish3 fish36 = new Fish3();
        addObject(fish36,723,504);
        Fish2 fish24 = new Fish2();
        addObject(fish24,626,478);
        Fish1 fish17 = new Fish1();
        addObject(fish17,533,524);
        Fish2 fish25 = new Fish2();
        addObject(fish25,317,236);
        Fish2 fish26 = new Fish2();
        addObject(fish26,323,278);
        Fish2 fish27 = new Fish2();
        addObject(fish27,240,515);
        Fish1 fish18 = new Fish1();
        addObject(fish18,256,465);
        Fish3 fish37 = new Fish3();
        addObject(fish37,403,542);
        Fish1 fish19 = new Fish1();
        addObject(fish19,411,5);
        Fish1 fish110 = new Fish1();
        addObject(fish110,486,194);
    }
}
