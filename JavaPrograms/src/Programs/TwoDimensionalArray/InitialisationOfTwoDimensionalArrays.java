package Programs.TwoDimensionalArray;
//WAP to initialisation of two dimensional array and traversing it using normal for loop & also enhanced for loop
public class InitialisationOfTwoDimensionalArrays {
    public static void main(String[] args) {
        //Initialisation of 2D array
        int a[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
        
        //Traversing the 2D array
        System.out.println("Traversing using normal for loop");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("Traversing using enhanced for loop");
        for(int[] x : a){
            for(int n : x)
                    System.out.print(n+"\t");
            System.out.println();
        }

    }
}
