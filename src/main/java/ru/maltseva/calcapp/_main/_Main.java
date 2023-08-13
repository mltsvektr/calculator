package ru.maltseva.calcapp._main;

import ru.maltseva.calcapp.service.ResultWriterService;
import ru.maltseva.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int sumResult = Calculator.summarize(3, 7);
        int subtractionResult = Calculator.deduct(8, 5);
        int productResult = Calculator.multiply(5, 10);
        ResultWriterService.printResult(3, 7, sumResult, "сложение");
        ResultWriterService.printResult(8, 5, subtractionResult, "вычитание");
        ResultWriterService.printResult(5, 10, productResult, "умножение");
    }
}
