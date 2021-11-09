package EncapsulationYoutubeVideo;

public class Main {
  public static void main(String[] args) {
    Student s = new Student(); //Her laver vi så s som refferer til en Student
    s.setName("Suzie"); //Her bruger jeg metoden fra Studen, ved at skrive s.(metodenavnet)
    //System.out.println(s.name); Sådan her vil den ikke virke fordi brugeren kan se name
    System.out.println(s.getName()); //Denne virker tilgængæld da vi har en get metode

    s.setAge(24);

    System.out.println(s.getAge());
  }
}
//På denne måde med get og set er det lettere for brugeren ikke at skulle tænke på variabler men blot bare skriv et
// navn eller en alder
