public class Selektion_3 {

    public static void main(String[] args) {

        int first;
        int second;

        first = 4;
        second = 5;
        System.out.println("Test 1");
        test(first, second);

        first = 2;
        second = 7;
        System.out.println("Test 2");
        test(first, second);

        first = 23;
        second = 73;
        System.out.println("Test 3");
        test(first, second);

        first = 7;
        second = 7;
        System.out.println("Test 4");
        test(first, second);

    }

    public static void test(int x, int y) {

        System.out.println(x);
        System.out.println(y);
        if (x > y) {

            System.out.println("First variable is greater than second");

        } else if (y > x) {

            System.out.println("Second variable is greater than first");

        } else if (x == y) {

            System.out.println("First and second is equal");

        }

    }

}
