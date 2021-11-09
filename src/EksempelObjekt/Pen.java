package EksempelObjekt;

public class Pen {
  //Her har vi så beskrevet en kuglepind
  String type = "gel";
  String color = "blue";
  int point = 10;
  //Så kan vi lave 3 metoder som beskriver nogle af de ting man kan gøre med en kuglepind
  //Her forneden har vi så lavet funktionen når man klikker på en kuglepind på toppen
  static boolean clicked = false;

  public static void click() {
    clicked = true;
  }

  public static void unClick() {
    clicked = false;
  }
}

