//package acess_mod;
//class myemployee{
//    int id;
 //   String name;
   // public void printDetails() {
     //   System.out.println("ID: " + id);
       // System.out.println("Name: " + name);
//    }
//}
//public class modifier {
  //  public static void main(String[] args)
    //    {
      //  myemployee ashish = new myemployee();
        //ashish.name="pankaj";
        //ashish.id=1234;
        //ashish.printDetails();
       // }
    
//}
// is main aapan nai class banaya hai myempploye and kai ander method banaya hai print details 
//aapn main class sai detail le rahe hai and myeployee class main store kAR RAHE HAI
//and phir sai usee main sai call kae kai print kar rahe hai

package acess_mod;
class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        name = n;
    }
    public String getname(){
       return name;
    }
        public void setid (int i){
        id = i;
    }
        public int getid(){
       return id ;
    }
    public void printDetails(){
        System.out.println("name : "+getname());
        System.out.println("id : "+getid());
    }
}
public class modifier {
    public static void main(String[] args)
        {
        myemployee ashish = new myemployee();
        ashish.setname("pankaj");
        ashish.setid(12345);
        ashish.printDetails();
       // ashish.name="pankaj";
       // ashish.id=1234;
//  this throws an error because aapn nai class mai data 
// secure rakh nai kai liye private access modifier kaa use kiya hai 
        }
    
}
