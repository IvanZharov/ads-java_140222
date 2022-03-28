package lesson5;

public class HomeWork5 {

    public static double exponentiation (int value, int degree) {
        double number;
        if (Math.abs(degree) == 1) {
            return value;
        } number = value * exponentiation(value, Math.abs(degree - 1));

        if (degree >= 0) {
            return number;
        } else {
            return (1 / number);
        }
    }
    public static void main(String[] args) {
        System.out.println(exponentiation(3,-1));
    }
}
