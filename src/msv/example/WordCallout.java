package msv.example;

public class WordCallout {
  private String myNumber;
  private String myCallout;

  public WordCallout(String theNumber, String theCallout) {
    myNumber = theNumber;
    myCallout = theCallout;
  }

  public boolean match(String theNumber) {
    return theNumber.toLowerCase().contains(myNumber.toLowerCase());
  }

  public String getCallout() {
    return myCallout;
  }

  public void setCallout(String theCallout) {
    myCallout = theCallout;
  }

  public String toString() {
    return "[WordCallout value: " + myNumber + " Callout: " + myCallout + "]";
  }

}
