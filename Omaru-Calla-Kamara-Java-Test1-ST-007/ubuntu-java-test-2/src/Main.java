import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        System.out.println("Exercise 1 ----------------------------");
//        Exercise 1:
//        Create two differents numbers (int) variables (between 1 and 20):

        int num1 = 6;           //First Number
        int num2 = 5;           //Second Number

//              - Show by console which one is the highest or if they are equal
        if (num1 > num2){
            System.out.println("The First Number " + num1 + " is the highest");
        } else if (num2 > num1) {
            System.out.println("The Second Number " + num2 + " is the highest");
        } else {
            System.out.println("They are both Equal");
        }

//              - Calculate and print in the console the sum
        int sum = num1 + num2;
        System.out.println("The Sum is: " + sum);

//              - Calculate and print in the console the subtraction
        int sub = num1 - num2;
        System.out.println("The Subtraction is: " + sub);

//              - Calculate and print in the console the multiplication
        int mult = num1 * num2;
        System.out.println("The Multiple is: " + mult);

//              - Calculate and print in the console the division
        int div = num1 / num2;
        System.out.println("The Division is: " + div);



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 2 ----------------------------");
//        Exercise 2:
//        Create a string with the value “Ubuntu: I am because we are”.
        String value = "Ubuntu: I am because we are";

//              - Show in the console how many characters has
        System.out.println("The lenght is: " + value.length());

//              - Replace the spaces for the character ‘_’ and show the result in the console
        System.out.println("The Replace value: " + value.replace(" ", "_"));



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 3 ----------------------------");
//        Exercise 3
//        Create a 6 numbers array (values from 1 to 100) and do the following:
        int[] sixNumbersArray = {22, 28, 49, 47, 12, 19};

//              - Show by console the odd numbers
        for (int i : sixNumbersArray) {
            if (i % 2 == 1) {
                System.out.println(i + ", ");
            }
        }
//              - Show in the console which number is the lowest

//              - Show the reverse order of the array
        for (int i = sixNumbersArray.length -1; i > 0; i--)
            System.out.print(sixNumbersArray[i] + " ");



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 4 ----------------------------");
//        Exercise 4
//        Create a variable date and show the date and time from now.
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        System.out.println(today);

//              - Sum three days at the date and show by console if it is weekend or not
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        Date newDate = calendar.getTime();

        int day = Calendar.DAY_OF_WEEK;
        if (day == Calendar.SATURDAY || day == Calendar.SUNDAY) {
            System.out.println(newDate + " It is Weekend");
        }else {
            System.out.println(newDate + " It is not, Its a Weekday");
        }



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 5 ----------------------------");
//        Exercise 5
//        Create a 6 number array (values from 1 to 10), and do the following
        double[] numberArray = {3, 4, 5, 6, 7, 8};

//              - Print the average in the console
        double total = numberArray[0];
        for (double i : numberArray) {
            total += numberArray.length;

            System.out.println("The average is: " + total);
        }

//              - Check number by number if are higher than 5 and show by console
        if (total > numberArray.length) {
            System.out.println("The numbers higher than 5 are: " + numberArray);
        }




    }
}
