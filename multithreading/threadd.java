class mycar extends Thread{
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("i am racing very fast");
            System.out.println("i have a BM");
            i++;
        }
        //while (true) {//while ye eak infinite loop hai jo non stop chalta hai  
            //System.out.println("i am racing very fast");
            //System.out.println("i have a BM");  
       // }
    }
}
class mybike extends Thread{//thread eak built in class hai java mai and us mai he run 
    //declared hai 
    public void run(){//run is mai eak buit in method hai 
        int i=0;
        while (i<40000) {
            System.out.println("i have superbike NINJA");
            System.out.println("Bhoom Bhoom!!!"); 
            i++;
        }
       // while(true){//while ye eak infinite loop hai jo non stop chalta hai
         //   System.out.println("i have superbike NINJA");
         //   System.out.println("Bhoom Bhoom!!!");
       // }
    }
}
public class threadd{
    public static void main(String[] args) {
     mycar car = new mycar();
     mybike bike= new mybike();
     car.start();//.start ye bhi buit in hai jo declared object ko identify kar ta hai
                 //  and us mai sai run method ko chala taa hai 
     bike.start();

    }
    // multithreading is a concept jaha aaapn 2 yaa do sai jaa method ko run kar sak te hai 
    //jis mai eak method run hoo gaa thode time kai liye and us kai baad ddusra method run ho gaa

}