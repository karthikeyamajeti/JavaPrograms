//Increment and decrement at the time of assignment
public class IncrementAndDecrement2 {    
    public static void main(String[] args) {
        int a=10,b;
        
        b=a++;//First print a's value to b and then increment the a's value by one
        System.out.println(a+"\t"+b);
        
        b=++a;//First increment the a's value by one and then assign a's value to b
        System.out.println(a+"\t"+b);
        
        b=a--;//First print a's value and then decrement by one
        System.out.println(a+"\t"+b);
        
        b=--a;//First decrement a's value and then assign a's value to b;
        System.out.println(a+"\t"+b);
    }
}
