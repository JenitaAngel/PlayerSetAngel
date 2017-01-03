import java.util.Scanner;
public class Prime {
  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter Number");
    int number = scr.nextInt();
    int flag = 0;
    for(int i = 2; i < number / 2; i++) {
      if(number % i == 0) {
        System.out.println("Number is not prime");
        flag = 1;
      }
    }
    if(flag == 0) {
      System.out.println("Number is Prime");
    }
    scr.close();
  }
}
    
