package Lesson_5;

public class RecursivePow {

    public static void main(String[] args) {
        int res = pow(9, 2);
        System.out.println(res);
    }

    private static int pow(int number, int power) {
        if (power == 1) return number;
        return number * pow(number, --power);
    }
}
