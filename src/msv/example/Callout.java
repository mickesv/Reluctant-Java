package msv.example;

public class Callout {
  private final int myNumber;
  private String myCallout;

  public Callout(int theNumber, String theCallout) {
    myNumber = theNumber;
    myCallout = theCallout;
  }

  public boolean match(final int theNumber) {
    return  0 == theNumber % myNumber;
  }

  public String getCallout() {
    return myCallout;
  }

  public void setCallout(String theCallout) {
    myCallout = theCallout;
  }
}
