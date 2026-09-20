package interface_classs;

interface car{
    void applybreaks(int decrement) ;
    void speedup(int increment);
    default void stop (){
        System.out.println("stoping BMW");
    }
    //here default is use kue kii aapn nai already class mai aagar implement kar diya ha toh 
    //aapn saare class ko chnage kar ne nahi jaye gai naa is liye interface mai he wao line 
    // default bolke declare kar de ne kii and us kai  argument bhi declare kar de nai kai 
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
        sport.stop();
    } 
}