package it.develhope.exercise23;

/**
 * @author Jason Di Bartolo
 * This class run the code
 */
public class Start {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(5,5));
        System.out.println(arithmeticOperators.sub(5,5));
        System.out.println(arithmeticOperators.mul(5,5));
        System.out.println(arithmeticOperators.div(5,5));
    }
}
