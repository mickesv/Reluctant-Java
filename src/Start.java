
import msv.example.FizzBuzzer;
import msv.example.Callout;


public class Start {
  public void testCallNum(FizzBuzzer testObject) {
    for (int i = 0; i < 20; i++) {
      System.out.println("Calling with " + i + " : " + testObject.callNum(i));
    }    
  }

  public void testList(FizzBuzzer testObject) {   
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

  public void testCount(FizzBuzzer testObject) {    
    System.out.print("Testing count: ");
    testObject.count(0, 20, System.out);
  }

  public void testDebugOut(FizzBuzzer testObject) {
    testObject.debugOut();
  }
  
  public void testFizzBuzz(FizzBuzzer testObject) {
    testCallNum(testObject);
    testList(testObject);
    testCount(testObject);
    testDebugOut(testObject);
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
