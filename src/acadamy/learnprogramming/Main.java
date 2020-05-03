package acadamy.learnprogramming;

public class Main {

    private static final String INVALID_VAL_MGS = "Invalid value!";

    public static void main(String[] args) {
        System.out.println(INVALID_VAL_MGS);
    }

    public static int calc(int p1, int p2) {
        return p1 + p2;
    }

    public static double calc(double p1, double p2) {
        return p1 + p2;
    }

    public static String calc(int p1) {
        return "Num: " + p1;
    }

    public static String calc(String p1) {
        return "String: " + p1;
    }

    public static String calc() {
        return "Method";
    }

    public static void calc(double p1) {

    }
}
