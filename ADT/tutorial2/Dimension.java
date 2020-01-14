package ADT.tutorial2;

/**
 * Dimension
 */
public class Dimension {

    public static void main(final String[] args) {
        int[][] array = { { 1, 3, 4 }, { 3, 4, 5 } };
        int[] myAnswer = new int[array.length];
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            myAnswer[i] = summation(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(myAnswer[i]);
            total = total + myAnswer[i];
        }

        System.out.println("Total: " + total);

    }

    static int summation(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}