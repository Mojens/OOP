package HappyKids;

public class Test {
  public static void main(String[] args) {
    //Kid k = new Kid("sten"); // Refferer til anden class man har lavet med navnet k
    //Kid k1 = new Kid("Mudi");
    //Kid k2 = new Kid("kasper");
    //Kid k3 = new Kid("martin");
    //Kid k4 = new Kid("maria");
    Kid k = new Kid();
    Kid k1 = new Kid();
    Kid k2 = new Kid();
    Kid k3 = new Kid();
    Kid k4 = new Kid();
    k.setKid("Jakob");
    k1.setKid("Mads");
    k2.setKid("Ole");
    k3.setKid("Tina");
    k4.setKid("Martin");
    System.out.println("Det første kid hedder: " + k.getKid() +
        "\nDet andet kid hedder: " + k1.getKid() + " \nDet trejde kid hedder: " + k3.getKid() +
        " \nDet fjerde kid hedder: " + k2.getKid() + " \nDet femte kid hedder: " + k4.getKid() + "\n");

  }

}

