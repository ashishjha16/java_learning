package abstractclass_method ;
abstract class abs{
    public abs(){
        System.out.println("good morning sir ");
        
    }
    public void hello(){
        System.out.println("hello sir how you doing ");
    }
    abstract public void greet();   
}
class child extends abs{
    public void greet(){
        // yee aagar koi abstract class extend kar rahe hai toh toh us mai jo abstract method 
        //declare kiya hai wao he method child mai use kar naa pad taa aagar class extend bhi kar naa hai 
        //and declared variable use bhai nahi kar naa toh extended class ko absstract declare kar naa
        //pad taa hai. 
        System.out.println("how are you sir!!");
    }
}
abstract class child2 extends abs{
    public void ashish(){
        System.out.println("how's the josh...");
    }
}
public class abstract_class_method {

    public static void main(String[] args){
         //abs obj = new abs();//yeee  nahi kar sak teehai kue kii abstract class hai is liye
         //bakii us kai child class kaa object bana sak te hai 
         child obj = new child();
         obj.greet();

    }
}
