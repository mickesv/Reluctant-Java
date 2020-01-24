package msv.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class FizzBuzzer {
  private List<Callout> myCalls = new ArrayList<Callout>();

  public FizzBuzzer() {
    myCalls.add(new Callout(3, "Fizz"));
    myCalls.add(new Callout(5, "Buzz"));
  }

  public FizzBuzzer(Callout[] theCalls) {
    Collections.addAll(myCalls, theCalls);
  }

  public String callNum(int theNumber) {
    Optional<String> foundCalls = myCalls.stream()
      .filter( callout -> {
          return callout.match(theNumber);
        })
      .map( callout -> {
          return callout.getCallout();
        })
      .reduce( (callout, output) -> {
          return callout + output;
        });

    return foundCalls.orElse("" + theNumber);
  }
}
