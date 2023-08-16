package ru.maltseva.calcapp._main;

import ru.maltseva.calcapp.service.ResultWriterService;
import ru.maltseva.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int result = Calculator.summarize(3, 7);
        ResultWriterService.printResult(3, 7, result, "сложение");
        result = Calculator.deduct(8, 5);
        ResultWriterService.printResult(8, 5, result, "вычитание");
        result = Calculator.multiply(5, 10);
        ResultWriterService.printResult(5, 10, result, "умножение");
    }
}
