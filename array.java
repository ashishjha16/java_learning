import java.util.Arrays;   
import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        int[] marks = new int[5]; // is main array declaration hau hai as "int[] marks"and array create kiya hai 
        // array size is 5 means 5 element store kar sakte hai as  new int[5]
        marks[0] = 56;//this is initialization of array element
        marks[1] = 98;
        marks[2] = 78;
        marks[3] = 99;
        marks[4] = 100;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        
        int [] marks1 = {56, 98, 78, 99, 100};
        System.out.println(Arrays.toString(marks1));
         // the above is another way to declare and initialize array in a single line
        
         int[] a  =new int[5];
         a[0] = 56;
         a[1] = 98;
         a[2] = 78;
         System.out.println(Arrays.toString(a));
        

         //twwo dimensional array
         int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         System.out.println(twoD[0][0]);
         System.out.println(twoD[1][0]);
         System.out.println(twoD[2][0]);
         //System.out.println(twoD[0][4]);// here it will give ArrayIndexOutOfBoundsException
         //  which is an error because we are trying to access an index which is not present
         //  in the array
         // this is 2d array where the {}shows that array index is 0,1,2 and inside the {} 
         // we have 3 elements in each index which are also indexed as 0,1,2 
         int [] b = {56, 98, 78, 99, 100};
         for(int i=0; i<b.length; i++){
            System.out.println(b[i]); // yaha pai aapn nai for loop kaa concept use kiya hai
            //  jismei humne array kaa length liya hai and uske according loop chalaya hai
            //  and print kiya hai array kaa element
         }
         //here we aree taking input from user to determine the size of the array 
         Scanner s = new Scanner(System.in);
            System.out.println("enter the size of the array: ");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("enter the elements of the array: ");
            int a1 = s.nextInt();
            for  (a1 = 0; a1 < size ; a1++) {
                arr[a1] = s.nextInt();
             System.out.println(Arrays.toString(arr));
            }




    } 
}