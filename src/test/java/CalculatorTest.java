public class CalculatorTest {
    public static void main(String[] args) throws Exception{
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        calculatorUtil.compute('+', 10);
        calculatorUtil.compute('-', 2);
        calculatorUtil.compute('*', 3);

        calculatorUtil.redo(1);
        calculatorUtil.undo(2);
    }
}
