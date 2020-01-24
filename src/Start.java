
import msv.example.FizzBuzzer;
import msv.example.Callout;


public class Start {
  public void testFizzBuzz(FizzBuzzer testObject) {
    for (int i = 0; i < 20; i++) {
      System.out.println("Calling with " + i + " : " + testObject.callNum(i));
    }    
  }
  

  public static void main(String[] args) {
    FizzBuzzer fb1 = new FizzBuzzer();

    Callout[] calls = new Callout[3];
    calls[0] = new Callout(5, "Fives");
    calls[1] = new Callout(10, "Tens");
    calls[2] = new Callout(12, "Twelves");
    
    FizzBuzzer fb2 = new FizzBuzzer(calls);

    new Start().testFizzBuzz(fb1);
    new Start().testFizzBuzz(fb2);        
  }
}
