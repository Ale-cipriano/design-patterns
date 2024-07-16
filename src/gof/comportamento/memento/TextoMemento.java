package gof.comportamento.memento;

/**
 * @author alessandro.cipriano
 */
public class TextoMemento {

    private String estado;

    public TextoMemento(String texto) {
        estado = texto;
    }

    public String getTextoSalvo() {
        return estado;
    }

}
