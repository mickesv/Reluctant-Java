package msv.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FizzBuzzer {
  private List<Callout> myCalls = new ArrayList<Callout>();
  
  public FizzBuzzer() {
    myCalls.add(new Callout(3, "Fizz"));
    myCalls.add(new Callout(5, "Buzz"));
  }

  public FizzBuzzer(Callout[] theCalls) {
    Collections.addAll(myCalls, theCalls);
  }

  public String callNum(final int theNumber) {
    return "" + theNumber;
  }
  
}
