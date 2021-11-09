package Lamps;

public class Lamp {

  boolean offOrOn;

  public Lamp(boolean offOn) {
    offOrOn = offOn;

  }

  public Lamp() {
    offOrOn=false;

  }

  public boolean pushSwitch(boolean Lamp) {
    if (offOrOn & !Lamp) {
      System.out.print("slukket! altså ");
      return false;
    }if (Lamp & !offOrOn)
      System.out.print("tændt! altså ");
    return true;
  }
}

