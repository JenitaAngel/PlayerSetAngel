import java.util.Scanner;
public class Multiplication {
  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter Number");
    int number = scr.nextInt();
    int result = 0;
    for(int i = 1; i <= 10; i++) {
      result = number * i;
      System.out.println(number + " * " + i + " = " + result);
      scr.close();
    }
  }
}
