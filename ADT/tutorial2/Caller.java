package ADT.tutorial2;

/**
 * Caller
 */
public class Caller {
    public static void main(String[] args) {
        int ans = 0;
        sub1.method1(1, 2);
        ans = sub1.method2(5, 5);
        System.out.println("multiplication results= " + ans);
        
        // return a summation result only in even
        System.out.println(sub1.sumToEven(10, 5)); 
        System.out.println(sub1.sumToEven(10, 20));
    }

    /**
     * InnerCaller
     */
    static class sub1 {
        static void method1(int a, int b) {
            System.out.println("First number is " + a + " Second number is " + b);
        }

        static int method2(int x, int y) {
            return x * y;
        }

        static int sumToEven(int a, int b) {
            int sum = a + b;
            if (sum % 2 == 0) {
                return sum;
            } else {
                return sum + 1;
            }
        }
    }

}