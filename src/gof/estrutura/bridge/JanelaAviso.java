package gof.estrutura.bridge;

/**
 * @author alessandro.cipriano
 */
public class JanelaAviso extends JanelaAbstrata {

    public JanelaAviso(Janela janela) {
        super(janela);
    }

    @Override
    public void render() {
        addTitle("Warning!");
        addButton("Ok");
    }

}
