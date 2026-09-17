package classes;

//package oops;
//when ever yo make a new folder in java you have to make a package of that folder and then
//  you can use that package in your main class 

import java.util.Scanner;

class employee{
    int id;
    String name;
    public void printDetails()
    {
    System.out.println("my id is"+ id);
    }
}

public class javaclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        employee member= new employee();
        System.out.println("enter you name");
        String names= sc.nextLine(); 
        System.out.println("enter your id");
        int ids= sc.nextInt();

        member.id = ids;
        member.name = names;
       System.out.println(member.id);
       System.out.println(member.name);

       //what we have done in above code is kii aapan 
       // nai eak class banyaya and us class kaa data aapan nai user sai he liya and 
       // un variable main main set kar ddiya 

         member.id = 101;
         member.name = "ashish";
         System.out.println(member.id);
         System.out.println(member.name);
         //we have pre fited the values into it
         
    }

}
//here we have learned how to make class into a class