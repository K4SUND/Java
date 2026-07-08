package OOP.encapsulation;

public class Main {

    public static void main(String[] args) {


        /*
        //default constructor
        Player player = new Player();

        // if change the name -> full name
        // it shows error here.
        // issue happen because direct access
        player.name = "Messi";
        player.health = 20;
        player.weapon = "Left Foot";

        player.loseHealth(10);
        System.out.println(player.healthRemaining());

        // additional control
        // direct access
        // don't check that >100 check
        player.health = 111;

        player.loseHealth(10);
        System.out.println(player.healthRemaining());

         */


        PlayerEncapsulated player2 = new PlayerEncapsulated("Tim");
        PlayerEncapsulated player3 = new PlayerEncapsulated("Tim2",200,"Gun");
        System.out.println(player2.healthRemaining());
        System.out.println(player3.healthRemaining());



    }
}
