package msv.example;

import java.util.*;
import java.io.PrintStream;

public class WordBuzzer implements FizzBuzz {
  public static String[] countWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

  private List<WordCallout> myCalls = new ArrayList<WordCallout>();

  public WordBuzzer() {
    myCalls.add(new WordCallout("three", "Fizz"));
    myCalls.add(new WordCallout("five", "Buzz"));
  }

  public WordBuzzer(WordCallout[] theCalls) {
    Collections.addAll(myCalls, theCalls);
  }

  // has to be implemented
  public String callNum(int theNumber) {
    return this.callNum(countWords[theNumber % countWords.length]);
  }

  // new method
  public String callNum(String theNumber) {
    Optional<String> foundCalls = myCalls.stream()
      .filter( callout -> { return callout.match(theNumber); })
      .map( callout -> { return callout.getCallout(); })
      .reduce( (callout, output) -> { return callout + output; });

    return foundCalls.orElse(theNumber);
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
    WordCallout[] calls = myCalls.toArray(new WordCallout[1]);

    for(WordCallout c : calls) {
      System.out.println(c);
    }
  }

  
}
