package testproject;

/**
* A simple class for printing "Hello Tester"
*/
public class TestMain{

  /** main method */
  public static void main(String[] args){
    System.out.println(TestMain.getGreetings());
  } 
  
  /** another obvious comment for getting greeting */
  private static String getGreeting() {
    return "Hello Tester";
  }
}
