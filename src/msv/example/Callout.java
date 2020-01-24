package msv.example;

public class Callout {
  private final int myNumber;
  private String myCallout;

  public Callout(int theNumber, String theCall) {
    myNumber = theNumber;
    myCallout = theCall;
  }

  public String match(final int theNumber) {
    if (theNumber == myNumber) {
      return myCallout;
    } else {
      return null;
    }
  }
  
}

