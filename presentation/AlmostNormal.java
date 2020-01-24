import msv.example.*;

public class AlmostNormal {
  public static void main(String[] args) {
    int x = 10;
    Callout c = new Callout(5, "Five");

    testMethod1(x, c);
    System.out.println("x is " + x + " and callout is " + c.getCallout());

    testMethod2(c);
    System.out.println("x is " + x + " and callout is " + c.getCallout());
  }

  public static void testMethod1(int theX, Callout theC) {
    theX = 20;
    theC.setCallout("Not Five");
  }

  public static void testMethod2(Callout theC) {
    theC = new Callout(30, "Thirty");
  }
}
