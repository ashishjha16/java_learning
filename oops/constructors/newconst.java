//constructors yee eak aaisa concept hai jis mai appn jab new class bana te hai tab he 
//aagar us ko private kar ddiya ho toh phir us kii class lai ander values declare kar naa
//usee constructor keh tai hai 
 

package constructors;

class employee12{
    private String name;
    private int id;

    public employee12(){ //yee constructor hai is kaa naam class kai naam sai same reh taa hai 
    name = "ashish jha";
    id = 1234;
    }
        public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

public class newconst {
    public static void main(String[] args){
        employee12 ashish = new employee12();
        System.out.println("your name is "+ ashish.getName());
        System.out.println("your id is"+ ashish.getId());

    }
    
}
