package Programs.Arrays;
//WAP to traverse a array using for loop and also enhanced for loop
public class TraversingArray {
    public static void main(String[] args) {
        //Initialisation of array
        int a[] = {10,20,30,40,50};
        
        System.out.println("Traversing using Normal for loop");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        
        System.out.println("Traversing using Enhanced for loop");
        for(int arr:a){
            System.out.print(arr+"\t");
        }
        
    }
}
