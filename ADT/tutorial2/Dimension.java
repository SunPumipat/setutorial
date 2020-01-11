package ADT.tutorial2;

/**
 * Dimension
 */
public class Dimension {

    public static void main(final String[] args) {
        int[][] array = { { 1, 3, 4 }, { 3, 4, 5 } };
        System.out.println("Summation: " + summation(array));
    }

    static int summation(int [][] a){
        int sum = 0;
        for (int i =0; i < a.length ; i++){
            // loop i: counter rows
            for (int j = 0; j < a[i].length ; j++) {
                // loop j: counter columns
                sum = sum + a[i][j];
            }
        }
        return sum;
    }
}