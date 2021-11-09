package FightGameMaster;

public class Enemy {
  private String name;
  private Weapon weapon;
  private int health;

  public Enemy(String name) {
    this.name = name;
    this.health = (int)Math.floor(Math.random() * 100);
  }

  public int getHealth() {
    return health;
  }

  public void equipWeapon(Weapon weapon) {
    this.weapon = weapon;
    System.out.println(name + " is now equipped with " + weapon);
  }

  public int attack(Player player) {
    return player.hit(weapon);
  }

  public int hit(Weapon weapon) {
    health -= weapon.getDamage();
    return health;
  }


}

