package FightGameMaster;

public class Player {
  private String name;
  private Weapon weapon;
  private int health;

  public Player(String name) {
    this.name = name;
    this.health = 100;
  }

  public int getHealth() {
    return health;
  }

  public void equipWeapon(Weapon weapon) {
    this.weapon = weapon;
    System.out.println(name + " is now equipped with " + weapon);
  }

  public int attack(Enemy enemy) {
    return enemy.hit(weapon);
  }

  public int hit(Weapon weapon) {
    health -= weapon.getDamage();
    return health;
  }
}

