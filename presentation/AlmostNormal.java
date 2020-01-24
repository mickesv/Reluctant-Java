import msv.example.*;

public class AlmostNormal {
  public static void main(String [] args) {
    int x = 10;
    Callout c = new Callout(5, "Five");

    testFunction1(x, c);
    System.out.println("X is " + x + " and Callout is " + c);

    testFunction2(c);
    System.out.println("X is " + x + " and Callout is " + c);
  
  }

  public static void testFunction1(int theX, Callout theC) {
    theX = 20;
    theC.setCall("NotFive");
  }

  public static void testFunction2(Callout theC) {
    theC = new Callout(30, "Thirty");
  }
}
