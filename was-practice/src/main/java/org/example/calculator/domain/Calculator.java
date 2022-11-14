package org.example.calculator.domain;

import org.example.calculator.tobe.*;
import org.example.calculator.tobe.ArithmeticOperator;

import java.util.List;

public class Calculator {

    private static final List<ArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new DivisionOperator(), new MultiplicationOperator(), new SubtractionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
