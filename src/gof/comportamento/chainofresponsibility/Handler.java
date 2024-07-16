package gof.comportamento.chainofresponsibility;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public abstract class Handler {

    protected Handler sucessor;

    public abstract void handleRequest(int number);

    public void setSucessor(final Handler sucessor) {
        this.sucessor = sucessor;
    }

}
