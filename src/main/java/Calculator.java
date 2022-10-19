public class Calculator {

    private int val = 0;

    public void cal(char operator,int operand) {
        switch (operator) {
            case '+':
                val += operand;
                break;
            case '-':
                val -= operand;
                break;
            case '*':
                val *= operand;
                break;
            case '/':
                val /= operand;
                break;
        }
        System.out.println(operator + " " + operand + " =" + val);
    }

    public char getUndoOperator(char operator) throws Exception {
        switch (operator) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            case '/':
                return '*';
        }
        throw new Exception("no shuch operator");
    }

}
