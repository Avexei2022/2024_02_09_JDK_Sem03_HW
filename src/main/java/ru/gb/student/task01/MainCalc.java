package ru.gb.student.task01;

public class MainCalc {

    public static void main(String[] args) {
        int intNum = 111;
        long longNum = 33333333L;
        float floatNum = 4.4444444f;
        double doubleNum = 5.5555555555;
        byte byteNum = -127;
        short shortNum = 22222;
        printResult(intNum, longNum, "+");
        printResult(longNum, floatNum, "*");
        printResult(floatNum, doubleNum, "/");
        printResult(doubleNum, intNum, "-");
        printResult(byteNum, shortNum, "/");
;
    }

    private static void printResult(Object o1, Object o2, String operand) {
        String a = o1.toString();
        String b = o2.toString();
        String c = "";
        switch (operand) {
            case "+":
                c = Double.toString(Calculator.sum(o1, o2));
                break;
            case "*":
                c = Double.toString(Calculator.multiply(o1, o2));
                break;
            case "/":
                c = Double.toString(Calculator.divide(o1, o2));
                break;
            case "-":
                c = Double.toString(Calculator.subtract(o1, o2));
        }
        System.out.printf("\n%s %s %s = %s\n", a, operand, b, c);
    }

}
