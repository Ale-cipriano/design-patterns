package gof.comportamento.command;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public interface Command {

    int execute(int number);

    void undo();

}
