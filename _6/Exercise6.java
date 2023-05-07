import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        public Boolean isWeekend;

         Days(boolean isWeekend){
            this.isWeekend = isWeekend;
        }

        public Boolean getWeekend() {
            return isWeekend;
        }
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        for (Days value : Days.values()) {
            System.out.println(value);

        }// Your code here
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private enum Seasons {
        SPRING("From March to June"),
        SUMMER("From June to September"),
        FALL("From September to December"),
        WINTER("From December to March");

        private String range;
        Seasons(String range){
            this.range = range;
        }

        public String getRange() {
            return range;
        }
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        System.out.println(valore(Seasons.SPRING));// Your code here
    }
public static String valore(Seasons value){
        return value.getRange();
}
    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private enum TrafficLights {
        RED,
        GREEN,
        YELLOW;

        public TrafficLights changeColor(TrafficLights trafficLight) {
            if (trafficLight == TrafficLights.RED) {
                try {
                    System.out.println("Green light is coming..");
                    Thread.sleep(2000);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);

                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                    System.exit(0);
                }
                    return TrafficLights.GREEN;
            } else if (trafficLight == TrafficLights.GREEN) {
                try {
                    System.out.println("Yellow light is coming..");
                    Thread.sleep(2000);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                    System.exit(0);
                }
                    return TrafficLights.YELLOW;
            } else if (trafficLight == TrafficLights.YELLOW) {
                try {
                    System.out.println("Red light is coming..");
                    Thread.sleep(2000);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                    System.exit(0);
                }
                    return TrafficLights.RED;
            }
            return trafficLight;
        }
    }


    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        TrafficLights start = TrafficLights.RED;
        start = start.changeColor(start);
        System.out.println(start);// Your code here

    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */

    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        printDay();// Your code here
    }
    public static void printDay(){
        for (Days day: Days.values()) {
            if (day.getWeekend() == true) {
                System.out.println(day + " "+ "Is part of the weekend! :)");
            } else System.out.println(day + " " + "Is a weekday :(");
            System.out.println();

        }

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    public static double operation(int x, int y, Operator op) {
        double result = 0;
        switch (op) {
            case ADD:
                result = x + y;
                break;
            case SUBTRACT:
                result = x - y;
                break;
            case MULTIPLY:
                result = x * y;
                break;
            case DIVIDE:
                if (y == 0) {
                    throw new ArithmeticException("Can't be divided by zero!");
                }
                result = x / y;
                break;
        }
        return result;
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");

        int num1 = 5;
        int num2 = 2;
        double result = operation(num1, num2, Operator.MULTIPLY);
        System.out.println(result);// Your code here

    }
}
