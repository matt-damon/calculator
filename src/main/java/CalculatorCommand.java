public class CalculatorCommand extends Command {

    private Calculator calculator;
    private char operator;
    private int operand;

    CalculatorCommand(Calculator calculator, char operator, int operand) {
        super();
        this.calculator = calculator;
        this.operator = operator;
        this.operand = operand;
    }

    public void exec() {
        calculator.cal(operator, operand);
    }


    public void unexec() throws Exception {
        calculator.cal(calculator.getUndoOperator(operator), operand);
    }
}
