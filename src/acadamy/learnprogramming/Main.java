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

        byte myMinByteValue = Byte.MIN_VALUE; // -128
        byte myMixByteValue = Byte.MAX_VALUE; // 127

        short myMinShortValue = Short.MIN_VALUE; // -32768
        short myMaxShortValue = Short.MAX_VALUE; // 32767

        long myLongNumber = 100L;
        long myMinLongValue = Long.MIN_VALUE; // -9223372036854775808
        long myMaxLongValue = Long.MAX_VALUE; // 9223372036854775807

        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);
    }
}
