package msv.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.io.PrintStream;

public class FizzBuzzer implements FizzBuzz {
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

  public String[] list(int start, int end) {
    ArrayList<String> output = new ArrayList<String>();
    for(int i = start; i <= end; i++) {
      output.add(callNum(i));
    }

    return output.toArray(new String[1]);
  }

  public void count(int start, int end) {
    this.count(start, end, System.out);
  }

  public void count(int start, int end, PrintStream out) {
    String[] list = list(start, end);

    out.print("[");
    for(String s : list) {
      out.print(s + ", ");
    }
    out.println("]");
  }

  public void debugOut() {
    Callout[] calls = myCalls.toArray(new Callout[1]);

    for(Callout c : calls) {
      System.out.println(c);
    }
  }
}
