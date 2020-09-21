/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package UI_Funktion_Exercise;

public class FunktionClass {

    public static int Selection3Test(int input1, int input2) {

        int greatestValue = Math.max(input1, input2);

        return greatestValue;
    }

    public static int Selection4Test(int input1, int input2, int input3) {

        int greatestValue = Math.max(input1, Math.max(input2, input3));

        return greatestValue;
    }

    public static String Selection5Test(int input) {

        String interval = "";

        if(input <= 9) {
            interval = " tilhører intervallet  [0:9]";
        } else if (input > 9 && input <= 19) {
            interval = " tilhører intervallet  [10:19]";
        } else if (input > 19 && input <= 29) {
            interval = " tilhører intervallet  [20:29]";
        } else if (input > 29 && input <= 39) {
            interval = " tilhører intervallet  [30:39]";
        } else if (input > 39 && input <= 49) {
            interval = " tilhører intervallet  [40:49]";
        } else if (input > 49 && input <= 59) {
            interval = " tilhører intervallet  [50:59]";
        } else if (input > 59 && input <= 69) {
            interval = " tilhører intervallet  [60:69]";
        } else if (input > 69 && input <= 79) {
            interval = " tilhører intervallet  [70:79]";
        } else if (input > 79 && input <= 89) {
            interval = " tilhører intervallet  [80:89]";
        } else if (input > 89 && input <= 99) {
            interval = " tilhører intervallet  [90:99]";
        } else {
            interval = " ligger ikke indenfor intervallet [0:99]";
        }

        return interval;
    }

    public static int Selection6Test(int input1, int input2, int input3) {

        int middleNumber;

        if (input1 < input2 && input1 > input3 || input1 > input2 && input1 < input3) {

            middleNumber = input1;

        } else if (input2 < input1 && input2 > input3 || input2 > input1 && input2 < input3) {

            middleNumber = input2;

        } else if (input3 < input2 && input3 > input1 || input3 > input2 && input3 < input1) {

            middleNumber = input3;

        } else  if (input1 == input2 && input1 != input3 || input1 != input2 && input1 == input3) {

            middleNumber = input1;

        } else {

            middleNumber = input2;

        }

        return middleNumber;
    }

}
