package GeneriskMenu;

public class MenuTest {

  public static void main(String[] args) {
    run();
  }

  private static void run() {
    String[] menuItem = new String[10]; //Her laver vi 10 tomme pladser for Strings da Quit skal være på 9 og indeks starter fra 0 skal den være på 10 tomme pladser

    menuItem[1] = "Choose ONE"; //Her siger vi hvad hver array indeholder på indek 1
    menuItem[2] = "Choose TWO"; //indeks 2
    menuItem[3] = "Choose THREE"; //indeks 3
    menuItem[9] = "QUIT"; //indeks 9

    Menu menu = new Menu("MENU", "PLEASE CHOOSE HERE: ", menuItem); //Bruger konstruktøren med de 3 parametre
    menu.printMenu();

    int choice = menu.readChoice(); //Her laver vi metoden om til en variablen som vi kalder for choice som altså er "input"
    boolean checkChoice; //Denne boolean skal jeg bruge til at lave en do while loop fordi den skal blive ved med at spøge hvis man skriver et andet tal end 1,2,3,9.
    // fordi i readChoice() så tjekker den kun om det en integer der bliver indtastet men ikke om det er den rigtige af dem.
    do {
      switch (choice) { //Laver en switch som kontroller brugerens input
        case 1:
          System.out.println("You choosed 1"); //Hvis bruger har skrevet 1 vil den sige dette
          checkChoice = true;
          break;
        case 2:
          System.out.println("You choosed 2"); // Hvis bruger har skrevet 2 vil den sige dette
          checkChoice = true;
          break;
        case 3:
          System.out.println("You choosed 3"); // Hvis bruger har skrevet 3 vil den sige dette
          checkChoice = true;
          break;
        case 9:
          System.out.println("You choosed QUIT"); //Hvis bruger har skrevet 9 vil den sige dette
          checkChoice = true;
          break;

        default: // alt andet er forkert input
          System.out.println("\nIt has to be between 1,2,3 or 9");
          System.out.println("Try again");
          menu.printMenu(); //så skal den printe menuen igen
          choice = menu.readChoice(); //så skal den køre denne metode igen
          checkChoice = false; // her er den så false fordi så betyder det man har tastet et andet integer end 1,2,3 eller 9.
      }
    } while (!checkChoice); //Den skal blive ved med at loop så længe den er false altså en integer som ikke er 1,2,3 eller 9
  }
}


