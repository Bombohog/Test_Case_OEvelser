public class Selektion_4 {

    public static void main(String[] args) {

        int first;
        int second;
        int third;

        first = 56;
        second = 23;
        third = 62;
        System.out.println("Test 1");
        test(first, second, third);

        first = 44;
        second = 63;
        third = 44;
        System.out.println("Test 2");
        test(first, second, third);

        first = 73;
        second = 73;
        third = 73;
        System.out.println("Test 3");
        test(first, second, third);

        first = 66;
        second = 66;
        third = 35;
        System.out.println("Test 4");
        test(first, second, third);

    }

    public static void test(int x, int y, int z) {

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        if (x > y && x > z) {

            System.out.println("First variable is the greatest");

        } else if (y > x && y > z) {

            System.out.println("Second variable is the greatest");

        } else if (z > x && z > y) {

            System.out.println("Third variable is the greatest");

        } else if (x == y && x != z || x == z && x != y || y == z && y != x) {

            System.out.println("Two of the variables are equal");

        } else {

            System.out.println("All is equal");

        }

    }

}
