public class Selektion_6 {

    public static void main(String[] args) {

        int x;
        int y;
        int z;

        x = 42;
        y = 67;
        z = 55;
        test(x, y, z);

        x = 72;
        y = 23;
        z = 37;
        test(x, y, z);

        x = 82;
        y = 43;
        z = 82;
        test(x, y, z);

        x = 34;
        y = 34;
        z = 34;
        test(x, y, z);

    }

    public  static void test(int x, int y, int z) {

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x < y && x > z || x > y && x < z) {

            System.out.println("First variable is the middle");

        } else if (y < x && y > z || y > x && y < z) {

            System.out.println("Second variable is the middle");

        } else if (z < y && z > x || z > y && z < x) {

            System.out.println("Third variable is the middle");

        } else  if (x == y && x != z || x != y && x == z) {

            System.out.println("First variable is the middle");

        } else {

            System.out.println("Second variable is the middle");

        }

    }

}
