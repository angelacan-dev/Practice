import java.util.*; //library that allows you to create arrays

public class ReversingArray{
    static void reverseArray(Integer a[]) {
    
    Collections.reverse(Arrays.asList(a)); //collections.reverse method that reverses the elements of a list
    System.out.println(Arrays.asList(a)); //prints the reversed elements to the screen
    
}

     public static void main(String []args){
        Integer [] arr = {1,2,3,4}; //we create integer object array of 4 elements
        reverseArray(arr); //calls the reverse method on arr
     }
}
