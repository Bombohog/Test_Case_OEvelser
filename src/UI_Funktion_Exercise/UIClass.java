/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package UI_Funktion_Exercise;

import java.util.*;

public class UIClass {

    public static void main(String[] args) {

        boolean UIStatus = true;

        Scanner input = new Scanner(System.in);

        while (UIStatus) {
            System.out.print("What test would you like 3, 4, 5 or 6: ");
            int test = input.nextInt();

            switch (test) {
                case 3 -> {
                    System.out.print("Test 3: Greatest number between 2 numbers\nInput 2 numbers: ");
                    int test3Input1 = input.nextInt();
                    int test3Input2 = input.nextInt();
                    System.out.println("The greatest number = " + FunktionClass.Selection3Test(test3Input1, test3Input2));
                    // input: 5 og 3, og omvendt
                    // forventet output: 5
                    // aktuel output: 5
                }
                case 4 -> {
                    System.out.print("Test 4: Greatest number between 3 numbers\nInput 3 numbers: ");
                    int test4Input1 = input.nextInt();
                    int test4Input2 = input.nextInt();
                    int test4Input3 = input.nextInt();
                    System.out.println("The greatest number = " + FunktionClass.Selection4Test(test4Input1, test4Input2, test4Input3));
                    // input 56, 23 og 62
                    // forventet output: 62
                    // aktuel output: 62
                }
                case 5 -> {
                    System.out.print("Test 5: What interval between [0:99] is the number\nInput 1 number: ");
                    int test5Input1 = input.nextInt();
                    System.out.println("The greatest number = " + FunktionClass.Selection5Test(test5Input1));
                    // input 62
                    // forventet output: [60:69]
                    // aktuel output: [60:69]
                }
                case 6 -> {
                    System.out.print("Test 6: Middle number between 3 numbers\nInput 3 numbers: ");
                    int test6Input1 = input.nextInt();
                    int test6Input2 = input.nextInt();
                    int test6Input3 = input.nextInt();
                    System.out.println("The greatest number = " + FunktionClass.Selection6Test(test6Input1, test6Input2, test6Input3));
                    // input 42, 77 og 61
                    // forventet output:
                    // aktuel output: 61
                }
                default -> UIStatus = false;
            }

        }

    }

}
