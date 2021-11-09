package EnumsWeekDay;

public class Weekdays {
  enum Weekday {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
  }

  public Weekday getWeekDay(int DayNumber) {
    if (DayNumber == 1) {
      return Weekday.Monday;
    }
    if (DayNumber == 2) {
      return Weekday.Tuesday;
    }
    if (DayNumber == 3) {
      return Weekday.Wednesday;
    }
    if (DayNumber == 4) {
      return Weekday.Thursday;
    }
    if (DayNumber == 5) {
      return Weekday.Friday;
    }
    if (DayNumber == 6) {
      return Weekday.Saturday;
    }
    if (DayNumber == 7) {
      return Weekday.Sunday;
    } else
      System.out.println("It has to be a number between 1-7");

    return null;
  }
}

