package gb.calculator;

public class Calculator {

    public static <T extends Number, E extends Number> Double sum(T first, E second) {
        return first.doubleValue() + second.doubleValue();
    }
    public static <T extends Number, E extends Number> Double minus(T first, E second) {
        return first.doubleValue() - second.doubleValue();
    }
    public static <T extends Number, E extends Number> Double mult(T first, E second) {
        return first.doubleValue() * second.doubleValue();
    }
    public static <T extends Number, E extends Number> Double devide(T first, E second) {
        return first.doubleValue() / second.doubleValue();
    }
}
