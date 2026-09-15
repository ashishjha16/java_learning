class A {
    //parent class
    int a ;
    int b ;

}
class B extends A {
    //child class
    int c ;
    int d ;
    public void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}   
public class inheritance {
public static void main(String[] args) {
//in this we actully create a class and create another class and we use the properties of the 
// first class in the second class that is called inheritance
 B obj = new B();
 obj.a = 10;
 obj.b = 20;
 obj.c = 30;
 obj.d = 40;
 obj.display();
}
}