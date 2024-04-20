package TaskCalculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); /*Разберем действия:
                                            a = 1 + 2 = 3
                                            b = 1 - 1 = 0
                                            c = a / b = 3 / 0 - здесь возникает ошибка
                                            по причине того, что делить на 0 нельзя.

                                            Поэтому выбрасываем исключение в Calculator.java:11
                                         */
        calc.println.accept(c);

    }
}