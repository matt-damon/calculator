import java.util.ArrayList;
import java.util.List;

public class CalculatorUtil {

    private Calculator calculator = new Calculator();
    private List<Command> commands = new ArrayList<Command>();

    private int current=0;

    //重做最近的N步，从前往后执行
    public void redo(int steps) throws Exception {
        int size = commands.size();
        if (steps > size) {
            throw new Exception("steps is greater than commands size!");
        }

        System.out.println("starting redo n recent steps...");
        for(int i = size - steps; i < size; i++) {
            commands.get(i).exec();
        }

    }

    //撤销最近的N步，从后往前执行
    public void undo(int steps) throws Exception {
        if (steps > commands.size()) {
            throw new Exception("steps is greater than commands size!");
        }

        for(int i = commands.size() - 1; i >= commands.size() - steps; i--) {
            --current;
            commands.get(i).unexec();
            commands.remove(i);

        }
    }

    public void compute(char operator,int operand) throws Exception {
        Command command = new CalculatorCommand(calculator, operator, operand);
        command.exec();
        commands.add(command);
        current++;
    }
}
