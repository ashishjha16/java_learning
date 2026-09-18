package interface_classs;

interface car{
    void applybreaks(int decrement) ;
    void speedup(int increment);
}
class BMW implements car{
    public void applybreaks(int decrement){
    System.out.println("Speed decreased by " + decrement);
   }
    public void speedup(int increment) {
    System.out.println("Speed increased by " + increment);
    }
}
public class interfaceee{
    public static void main(String[] args){
        BMW sport = new BMW();
        sport.applybreaks(40);
        sport.speedup(800);
    } 
}