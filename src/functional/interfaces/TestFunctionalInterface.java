package functional.interfaces;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        MultiplyTwoNumbers multiplyTwoNumbers = (a1, b1) -> a1*b1;
        int result =  multiplyTwoNumbers.multiply(a, b);
        System.out.println("Multiplication of "+a+" and "+b+" is "+ result);
    }
}
