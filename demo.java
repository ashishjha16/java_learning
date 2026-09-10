import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
  int[] ashish = new int[5];
  Scanner s = new Scanner (System.in);
  System.out.println("enter your name: ");
  String name = s.nextLine(); 
  System.out.println("enter your age: ");
  int age = s.nextInt();
  System.out.println("Hello, " + name);
  System.out.println("you are " + age + " years old");
  }
}
// here i had taken input from the user and printed a greeting message