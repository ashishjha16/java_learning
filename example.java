import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter your marks in Maths : ");
        int a = s.nextInt();
        System.out.println("enter your marks in English : ");
        int b = s.nextInt();
        System.out.println("enter your marks in Hindi : ");
        int c = s.nextInt();
        System.out.println("enter your marks in Marathi : ");
        int d = s.nextInt();
        int ashish = a+b+c+d ;
        System.out.println("your total marks of all subject is :" + ashish +"out of 400" );
        double percentage = (ashish/400.0)*100;
        System.out.println("your total percentage are :" + percentage );
     }
    }