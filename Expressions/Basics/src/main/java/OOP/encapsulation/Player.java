package OOP.encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    //no constructor
    //default constructor is there

    public void loseHealth(int damage)
    {
        health = health -damage;
        if(health<=0)
        {
            System.out.println("Player knocked out of game");
        }

    }

    public int healthRemaining()
    {
        return health;
    }

    public void restoreHealth(int extraHealth)
    {
        health = health + extraHealth;
        if(health>100)
        {
            System.out.println("full health");
            health = 100;
        }
    }
}
