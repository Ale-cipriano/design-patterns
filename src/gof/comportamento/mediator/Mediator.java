package gof.comportamento.mediator;

/**
 * @author alessandro.cipriano
 */
public  interface Mediator {

    void enviar(String mensagem, Colleague colleague);

}
