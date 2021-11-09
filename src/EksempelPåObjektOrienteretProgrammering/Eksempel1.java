package EksempelPåObjektOrienteretProgrammering;

public class Eksempel1 extends Eksempel2 implements eksempel3{ //Hvis vi gerne vil forbinde eksempel 2 class ind i denne class skriver vi således
  String name;

  public Eksempel1() {
  }

  public void sayName(){
    System.out.println("My name! ");
  }
  public void sayName(String name){ //Samme metode men forskellige metoder (Overloading)
    System.out.println("My name is "+ name);
  }
  public void sayHi(){
//Den vil altdi tage den her først fordi den står i samme class.
  }
  String flavor;
  public void openBag(){
    System.out.println("Bag is opened!");
  }



  public static void main(String[] args) {
    Eksempel1 eks = new Eksempel1(); //Her laver man så en objekt der hedder eksempel, som refferer til
    //Den anden class man har lavet
    eks.sayHi(); //Her refferer vi så til det objekt vi har lavet i den anden class, og det kan lade sig gøre fordi vi har brugt extends command i toppen
  }

  public void whatFlavor() {

  }
}

