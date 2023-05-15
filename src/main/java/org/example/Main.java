package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints calc1 = new IntsCalculator(new Calculator());
        System.out.println(calc1.mult(5, 15));

        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("11", "10"));
        System.out.println(binOps.mult("11", "10"));
    }
}