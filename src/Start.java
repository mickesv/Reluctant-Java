
import msv.example.Callout;
import msv.example.FizzBuzzer;

public class Start {

  public void testFizzBuzzer(FizzBuzzer theTestObject) {
    for (int i = 0; i < 20; i++) {
      System.out.println("Calling with " + i + ": " + theTestObject.callNum(i));
    }    
  }

  public static void main(String[] args) {
    System.out.println("Starting system...");

    // Default constructor
    FizzBuzzer fb1 = new FizzBuzzer();

    // Alternative constructor
    Callout[] calls = new Callout[3];
    calls[0] = new Callout(5, "Fives");
    calls[1] = new Callout(10, "Tens");
    calls[2] = new Callout(12, "Twelves");    
    FizzBuzzer fb2 = new FizzBuzzer(calls);

    // Test the fizzbuzzers
    new Start().testFizzBuzzer(fb1);
    new Start().testFizzBuzzer(fb2);
    
    System.out.println("System ends...");    
  }
}
