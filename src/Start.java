
import msv.example.FizzBuzzer;
import msv.example.Callout;
import msv.example.*;
import msv.gui.*;

public class Start {
  public void testCallNum(FizzBuzz testObject) {
    for (int i = 0; i < 20; i++) {
      System.out.println("Calling with " + i + " : " + testObject.callNum(i));
    }    
  }

  public void testList(FizzBuzz testObject) {   
    String[] retVal = testObject.list(0, 20);

    System.out.print("testing list: [");
    // for (int i = 0; i < retVal.length ; i++) {
    //   System.out.print(retVal[i] +" ,");
    // }

    for (String s : retVal) {
      System.out.print(s +" ,");      
    }
    
    System.out.println("]");
  }

  public void testCount(FizzBuzz testObject) {    
    System.out.print("Testing count: ");
    testObject.count(0, 20, System.out);
  }

  public void testDebugOut(FizzBuzz testObject) {
    testObject.debugOut();
  }
  
  public void testFizzBuzz(FizzBuzz testObject) {
    testCallNum(testObject);
    testList(testObject);
    testCount(testObject);
    testDebugOut(testObject);
  }
  

  public static void main(String[] args) {
    FizzBuzz fb1 = new FizzBuzzer();

    Callout[] calls = new Callout[3];
    calls[0] = new Callout(5, "Fives");
    calls[1] = new Callout(10, "Tens");
    calls[2] = new Callout(12, "Twelves");
    
    FizzBuzz fb2 = new FizzBuzzer(calls);

    new Start().testFizzBuzz(fb1);
    new Start().testFizzBuzz(fb2);

    System.out.println("Starting test with SynonymCallout");
    Callout[] calls2 = new Callout[3];
    calls2[0] = new SynonymCallout(5, new String[] {"Fives", "Femmor", "Cinco"});
    calls2[1] = new Callout(10, "Tens");
    calls2[2] = new Callout(12, "Twelves");
    
    FizzBuzzer fb3 = new FizzBuzzer(calls2);
    new Start().testFizzBuzz(fb3);

    System.out.println("Starting test with WordCallout");
    FizzBuzz wb = new WordBuzzer();
    new Start().testFizzBuzz(wb);

    FizzGUI gui = new FizzGUI(fb1);
  }
}
