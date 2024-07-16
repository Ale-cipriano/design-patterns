package gof.estrutura.bridge;

/**
 * @author alessandro.cipriano
 */
public class LinuxTema implements Janela {

    @Override
    public void addTitle(final String title) {
        System.out.println(title + " - Janela Linux");
    }

    @Override
    public void addButton(final String name) {
        System.out.println(name + " - Botão Linux");
    }

}
