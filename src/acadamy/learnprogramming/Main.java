package acadamy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int myValue = 1000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min = " + myMinValue);
        System.out.println("Integer Max = " + myMaxIntValue);
        System.out.println("Busted Max = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min = " + (myMinValue - 1)); // underflow
    }
}
