package msv.example;

import java.io.PrintStream;

public interface FizzBuzz {
  public String callNum(int theNumber);
  public String[] list(int start, int end);
  public void count(int start, int end);
  public void count(int start, int end, PrintStream out);
  public void debugOut();
}
