/*
1.	Написать класс Калькулятор (необобщенный),
 который содержит обобщенные статические методы:
 sum(), multiply(), divide(), subtract().
  Параметры этих методов – два числа разного типа,
  над которыми должна быть произведена операция.
*/
package ru.gb.student.task01;

public class Calculator {
    public static <T1, T2> double sum (T1 t1, T2 t2) {
        return Double.sum(Double.parseDouble(t1.toString())
                , Double.parseDouble(t2.toString()));
    }

    public static <T1, T2> double multiply (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                * Double.parseDouble(t2.toString());
    }

    public static <T1, T2> double divide (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                / Double.parseDouble(t2.toString());
    }

    public static <T1, T2> double subtract (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                - Double.parseDouble(t2.toString());
    }


}
