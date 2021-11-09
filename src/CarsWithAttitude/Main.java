package CarsWithAttitude;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.setBrand("Ford");
    car1.setHonk("dut dut");
    car1.setModel("escort");
    Car car2 = new Car();

    System.out.println("Bilens mærke er: "+car1.getBrand()+" "+car1.getModel()+
        " og den siger lyden: "+car1.getHonk()+"\n");

    car2.setModel("picanto");



  }
}

