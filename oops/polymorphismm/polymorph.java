interface camera{
    void takesnap();
    void recordVideo();
}
interface phone{
    void makecall();
    void sendAMessage();
}
interface recordVideo{
    void takeAShot();
    void startRecording();
}
class gps{
    public void display(){
        System.out.println("i am sharing location");
    }
}
class smartPhone extends gps implements camera, phone, recordVideo{
    public void takesnap(){
        System.out.println("taking photo through camera");
    }
    public void makecall(){
        System.out.println("Making A Call");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    public void sendAMessage(){
        System.out.println("Sending A message");
    }
    public void takeAShot(){
        System.out.println("Taking a shot");
    }
    public void startRecording(){
        System.out.println("Started recording video");
    }
}

public class polymorph{
    public static void main(String[] args){
        camera obj= new smartPhone();
        //obj.makecall();//this throws an error kue kii aapn nai phone ka object banaya nahi hai is 
        //is liye aapn phone class ko acess nahi kar sakte hai 
        obj.takesnap();//this id correct because camera kaa object bana hai 
    }
}//this is the concept of polymorph jis mai aapn sir wao he class acess kar sak te hai jis kaaa object banaya hai 