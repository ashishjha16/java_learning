class a1 implements Runnable{
    public void run(){
            int i=0;
            while(i<1000){
            System.out.println("hello i am ashish1");
            i++;
        }
    }
}
class a2 implements Runnable{
    public void run(){
            int i=0;
            while(i<1000){
            System.out.println("hello i am ashish2");
            i++;
        }
    }
}
public class runablee{
    public static void main(String[] args) {
        a1 bulletA1 = new a1();
        Thread gun1 = new Thread(bulletA1);
        a2 bulletA2 = new a2();
        Thread gun2 = new Thread(bulletA2);
        gun1.start();
        gun2.start();
    }
}