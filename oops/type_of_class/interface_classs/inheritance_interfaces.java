interface  parent{
    void meth1();
    void meth2();
}
interface child extends parent{
    void meth3();
    void meth4();
}
interface grandechild{
    void meth5();
    void meth6();
}
class inheritanceInInterface implements child,grandechild{//this line is of inheritance in interface
    public void meth1(){
        System.out.println(" hello! i am meth1 ");
    }
    public void meth2(){
        System.out.println(" hello! i am meth2");
    }
    public void meth3(){
        System.out.println(" hello! i am meth3 ");
    }
    public void meth4(){
        System.out.println(" hello! i am meth4");
    }
    public void meth5(){
        System.out.println(" hello! i am meth5 ");
    }
    public void meth6(){
        System.out.println(" hello! i am meth6 ");
    }
}
public class inheritance_interfaces{
    public static void main(String[] args) {
        inheritanceInInterface obj = new inheritanceInInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        obj.meth5();
        obj.meth6();
}
}