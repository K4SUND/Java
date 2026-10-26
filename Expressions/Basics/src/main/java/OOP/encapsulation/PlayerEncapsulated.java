package OOP.encapsulation;

public class PlayerEncapsulated {

    private String fullName;
    private int healthPercentage;
    private String weapon;


    public PlayerEncapsulated(String name) {
        this(name,100,"Sword");
    }

    public PlayerEncapsulated(String name, int health, String weapon) {
        this.fullName = name;

        // add conditions
        if(health<=0)
        {
            this.healthPercentage = 1;

        }else if(health>100){
            this.healthPercentage = 100;
        }else{
            this.healthPercentage = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        healthPercentage = healthPercentage -damage;
        if(healthPercentage <=0)
        {
            System.out.println("Player knocked out of game");
        }

    }

    public int healthRemaining()
    {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth)
    {
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage >100)
        {
            System.out.println("full health");
            healthPercentage = 100;
        }
    }

}
