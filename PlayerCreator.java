
/**
 * This runner class will create and experiment with Basketball player objects
 *
 * Melisa Zhang
 * 8/25/21
 */
public class PlayerCreator
{
   public static void main(String[] args)
   {
       //we will use the "new" keyword to create instances
       BasketballPlayer player1 = new BasketballPlayer();
       BasketballPlayer player2 = new BasketballPlayer();
       BasketballPlayer player3 = new BasketballPlayer("Timmy", 32);
       System.out.println(player3.getName());
       // calls the "class" method getPlayerCount to access the static variable howManyPlayers
       System.out.println(BasketballPlayer.getPlayerCount());
       System.out.println(player1.getPlayerCount());
       System.out.println(player2.getPlayerCount());
       //Create another player...
       BasketballPlayer goat = new BasketballPlayer("Michael Jordan", 36.4, 215, 54);
       System.out.println(player3.getPlayerCount());
       //we are going to use "dot" notation to access/define information about our object
       player1.setName("Shaq");
       //player2.setName("Lebron");
       
       //System.out.println("Player1's name is: " + player1.getName());
       //System.out.println("Player2's name is: " + player2.getName());
       
       player1.setAge(49);
       player1.setWeight(324);
       player1.setHeightInMeters(2.13);
       player1.setPointsPerGame(23.7);
       /*
       player2.setAge(36);
       player2.setPointsPerGame(27);
       player2.setHeightInMeters(2.05);
       player2.setWeight(250);
       */
       System.out.println(player1.playerInfo());
       System.out.println("\n");
       System.out.println(player2.playerInfo());
   }
}
