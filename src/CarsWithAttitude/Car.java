package CarsWithAttitude;

public class Car {

  private String brand;
  private String model;
  private String honk;

  //Brand
  public void setBrand(String b){
    brand=b;

  }

  public String getBrand() {
    return brand;
  }

  public String brand(String brand){
    System.out.println(" bilens brand er: ");
    return brand;
  }

  //Model
  public void setModel(String m){
    model=m;
  }

  public String getModel() {
    return model;
  }

  public String model(String model){
    System.out.println(" bilens model er: ");
    return model;
  }
  //Honk
  public void setHonk(String h){
    honk = h;
  }
  public String getHonk(){
    return honk;
  }

  public String honk(){
    System.out.println(" bilens lyd er: ");
    return honk;
  }
}

