package msv.example;

public class SynonymCallout extends Callout {
  private String[] mySynonyms;
  private int currentSynonym = 0;

  public SynonymCallout(int theNumber, String[] theSynonyms) {
    super(theNumber, theSynonyms[0]);
    mySynonyms = theSynonyms;
  }

  @Override
  public String getCallout() {
    String current = super.getCallout();
    currentSynonym = ++currentSynonym % mySynonyms.length;
    setCallout(mySynonyms[currentSynonym]);

    return current;
  }

  @Override
  public String toString() {
    String s = super.toString();
    s = s.replace("Callout", "SynonymCallout");
    s = s.replace("]", mySynonyms.toString() + "]");
    return s;
  } 
}
