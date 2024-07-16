package gof.comportamento.mediator;

/**
 * @author alessandro.cipriano
 */
public class SymbianColleague extends Colleague {

    public SymbianColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Symbian recebeu: " + mensagem);
    }
}
