package Programs.TwoDimensionalArray;
//WAP to calculate the row and column length of 2D Array
public class CalculatingRowAndColumnLength {
    public static void main(String[] args) {
        //Initialisation of 2D Array
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        //Calculating the row length using arrayname.length
        System.out.println(a.length);
        
        //Calculating the column length using arrayname[index].length
        System.out.println(a[0].length);
    }
}
