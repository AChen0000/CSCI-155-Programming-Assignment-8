/*
 MyInteger class
 Purpose: Work with integers (even, odd, prime, equals, parseInt)
 */

class MyInteger {

  private int value;

  public MyInteger(int value) {
      this.value = value;
  }

  public int get() {
      return value;
  }

  public boolean isEven() {
      return value % 2 == 0;
  }

  public boolean isOdd() {
      return value % 2 != 0;
  }

  public boolean isPrime() {
      if (value <= 1) return false;
      for (int i = 2; i <= value / 2; i++) {
          if (value % i == 0) return false;
      }
      return true;
  }

  public static boolean isEven(int n) {
      return n % 2 == 0;
  }

  public static boolean isOdd(int n) {
      return n % 2 != 0;
  }

  public static boolean isPrime(int n) {
      if (n <= 1) return false;
      for (int i = 2; i <= n / 2; i++) {
          if (n % i == 0) return false;
      }
      return true;
  }

  public static boolean isEven(MyInteger n) {
      return n.value % 2 == 0;
  }

  public static boolean isOdd(MyInteger n) {
      return n.value % 2 != 0;
  }

  public static boolean isPrime(MyInteger n) {
      return isPrime(n.value);
  }

  public boolean equals(int n) {
      return value == n;
  }

  public boolean equals(MyInteger n) {
      return value == n.value;
  }

  public static int parseInt(char[] chars) {
      int result = 0;
      for (int i = 0; i < chars.length; i++) {
          result = result * 10 + (chars[i] - '0');
      }
      return result;
  }

  public static int parseInt(String s) {
      return Integer.parseInt(s);
  }
}
