public class Selektion_5 {

    public static void main(String[] args) {

        int var;

        var = 62;
        test(var);

        var = 45;
        test(var);

        var = 91;
        test(var);

        var = 100;
        test(var);

    }

    public static void test(int input) {

        if(input <= 9) {
            System.out.println(input + " tilhører intervallet  [0:9]");
        } else if (input > 9 && input <= 19) {
            System.out.println(input + " tilhører intervallet  [10:19]");
        } else if (input > 19 && input <= 29) {
            System.out.println(input + " tilhører intervallet  [20:29]");
        } else if (input > 29 && input <= 39) {
            System.out.println(input + " tilhører intervallet  [30:39]");
        } else if (input > 39 && input <= 49) {
            System.out.println(input + " tilhører intervallet  [40:49]");
        } else if (input > 49 && input <= 59) {
            System.out.println(input + " tilhører intervallet  [50:59]");
        } else if (input > 59 && input <= 69) {
            System.out.println(input + " tilhører intervallet  [60:69]");
        } else if (input > 69 && input <= 79) {
            System.out.println(input + " tilhører intervallet  [70:79]");
        } else if (input > 79 && input <= 89) {
            System.out.println(input + " tilhører intervallet  [80:89]");
        } else if (input > 89 && input <= 99) {
            System.out.println(input + " tilhører intervallet [90:99]");
        } else {
            System.out.println(input + "ligger ikke indenfor intervallet [0:90]");
        }

    }

}
