package EncapsulationYoutubeVideo;

public class Student { //Objeketet student
  private String name; //Attributes som navn og alder
  private int age; //Jeg laver private så de ikke er visualle for brugeren og skal bruge get metoden for at skaffe dem

  public void setName(String newName){ //Her skal den ikke rigtig returne noget
    name = newName;
  }
  public String getName(){ //Her skal den så returne navnet
    return name;
//Det samme gør vi så med age
  }
  public void setAge(int newAge){
    age = newAge;
  }
  public int getAge(){
    return age;
  }
}

