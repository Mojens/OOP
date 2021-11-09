package Lamps;

public class LampTest {
  public static void main(String[] args) {
    Lamp skriveBordsLampe = new Lamp(true);//Her er den tændt
    Lamp sengeLampe = new Lamp(false); //Her er den lukket
    Lamp stueLampe = new Lamp();//Hvis den er tom så det som udgangspunkt "false" altså slukket

    System.out.println("true betyder tændt og false betyder slukket\n");
    System.out.println("Lampe 1: "+skriveBordsLampe.offOrOn);
    System.out.println("Lampe 2: "+sengeLampe.offOrOn);
    System.out.println("Lampe 3: "+stueLampe.offOrOn);

    System.out.println(" ");
    System.out.println("Nu trykker man bare på knappen\n");

    System.out.print("Lampe 1 er nu ");
    System.out.println(skriveBordsLampe.pushSwitch(false));//Her er den så slukket fordi man har trykket på knappen
    // Den er slukket fordi det er det omvendte af hvad lampen var før
    System.out.print("Lampe 2 er nu ");
    System.out.println(sengeLampe.pushSwitch(true));//her er den så tændt, fordi man har trykket på knappen
    System.out.print("Lampe 3 er nu ");
    System.out.println(stueLampe.pushSwitch(true));//her er den så tændt, fordi man har trykket på knappen
    // Så den der hedder Lamp er det omvendte af offoron da man endelig bare trykker på knappen
  }
}

