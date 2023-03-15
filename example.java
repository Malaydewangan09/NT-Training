public class Example {
  public void divide(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception(Cannot divide by zero);
    }
    int result = a / b;
    System.out.println(result);
  }

  public static void main(String[] args) {
    Example ex = new Example();
    try {
      ex.divide(10, 0); // this will throw an exception
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

