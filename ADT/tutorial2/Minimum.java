package ADT.tutorial2;

/**
 * Minimum
 */
public class Minimum {

    public static void main(String[] args) {
        int temp[] = { 343, 474, 755, 366 };
        System.out.println("Minimum value is " + minimum_value(temp));
    }

    static int minimum_value(int array[]) {
        int min_index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[min_index] > array[i]) {
                min_index = i;
            }
        }
        return array[min_index];
    }
}