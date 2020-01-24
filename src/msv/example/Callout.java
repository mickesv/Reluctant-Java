package msv.example;

public class Callout {
  private final int myNumber;
  private String myCallout;

  public Callout(int theNumber, String theCall) {
    myNumber = theNumber;
    myCallout = theCall;
  }


  public boolean match(final int theNumber) {
    return 0 == theNumber % myNumber;
  }

  public String getCall() {
    return myCallout;
  }

  public void setCall(String newCallout) {
    myCallout = newCallout;
  }

  public String toString() {
    return "[Callout value: " + myNumber + " callout: " + myCallout + "]";
  }
}

