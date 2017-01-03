import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    System.out.println("Enter Number: ");
    Scanner scr = new Scanner(System.in);
    int number = scr.nextInt();
    int fact = 1;
    for(int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " is " + fact);
    scr.close();
  }
}
