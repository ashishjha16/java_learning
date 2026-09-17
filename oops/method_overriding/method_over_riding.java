package method_overriding;
//basically method overridding kya hai kii is mai naa aapn 2 class declare kar te hai and eak class ko
//in herrit kar tee hai and inherit kar nai kai baad same naam kai method bana te hai so aapn 
// jo class kaa object bana kai un same method ko call kare gai toh wao wao he class kai method ko 
//print kare gaa


class atmaram{
    public void ashish(){
        System.out.println("this method of parent class ");
    }
}
class tukaram extends atmaram{
    public void ashish(){
        System.out.println("this method of child class");
    }
    public void display(){
        System.out.println("this is the another method of child class");
    }
}
public class method_over_riding {
    public static void main(String[] args) {
        atmaram obj1 = new atmaram();
        tukaram obj = new tukaram();
        obj.ashish();
        obj1.ashish();
    }
}
