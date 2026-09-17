package dynamic_method;
class ashish {
    public void meth1(){
        System.out.println("this is the meth1 of class ashish");
    }
    public void meth2(){
        System.out.println("this is the meth2 of class ashish");
    }
}
class minakshi extends ashish{
    public void meth1(){
        System.out.println("this is the meth1 of class minakshi");
    }
    public void meth3(){
        System.out.println("this is the meth3 of class minakshi");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        //ashish obj = new ashish(); //this is allowed 
        //obj.meth2();
        //minakshi obj = new ashish(); // this is not allowed
        //minakshi obj = new minakshi(); // this is allowed
        //obj.meth2();
        ashish obj = new minakshi();
        obj.meth2();
        //obj.meth3();// not allowed throws an error
        //yaha pai aapn nai kya kiya hain kii jo object declare kar kai diya hai us kooo super obj = new sub 
        //kai form mai declare kiya hai sooo and is mai method overriding bhi kiya hai is kai saath 
        //abb jab aapn us method ko call kar tee hai toh wao sub class kai data ko print kare gaa kue 
        // kii object jo hai wao sub class ka ban rah hai is liye 
        
    }
}