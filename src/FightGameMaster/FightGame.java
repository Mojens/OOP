package FightGameMaster;

public class FightGame {

  Player player;
  Enemy enemy;


  public FightGame() {
    System.out.println("Fight Game has been created!");
    player = new Player("The Player");
    enemy = new Enemy("The Enemy");
    Weapon weapon1 = new Weapon("Sword", 10);
    player.equipWeapon(weapon1);

    Weapon weapon2 = new Weapon("Spear", 5);
    enemy.equipWeapon(weapon2);
  }

  public void start() {
    System.out.println("The fight starts!");



    boolean gameIsRunning = true;
    while(gameIsRunning) {
      if( Math.random() <.5 ) {
        System.out.println("Player attacks enemy");
        int h = player.attack(enemy);
        System.out.printf("Enemy now has %d health\n", h);
      }
      if( Math.random() >.5) {
        System.out.println("Enemy attacks player");
        int h = enemy.attack(player);
        System.out.printf("Player now has %d health\n", h);
      }

      if( player.getHealth() <= 0) {
        System.out.println("Player is DEAD - you lost!");
        gameIsRunning = false;
      }

      if( enemy.getHealth() <= 0) {
        System.out.println("Enemy is DEAD - you won!");
        gameIsRunning = false;
      }
    }

  }

  public static void main(String[] args) {
    System.out.println("Welcome to the Fight Game!");
    FightGame game = new FightGame();
    game.start();
  }
}

