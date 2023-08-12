package ru.maltseva.calcapp._main;

import ru.maltseva.calcapp.service.ResultWriterService;
import ru.maltseva.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int resultOfSum = Calculator.summarize(3, 7);
        int resultOfSubtraction = Calculator.deduct(8, 5);
        int resultOfProduct = Calculator.multiply(5, 10);

        ResultWriterService.printResult(3, 7, resultOfSum, "сложение");
        ResultWriterService.printResult(8, 5, resultOfSubtraction, "вычитание");
        ResultWriterService.printResult(5, 10, resultOfProduct, "умножение");
    }
}
