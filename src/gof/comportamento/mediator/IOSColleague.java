package gof.comportamento.mediator;

/**
 * @author alessandro.cipriano
 */
public class IOSColleague extends Colleague {

    public IOSColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("iOs recebeu: " + mensagem);
    }

}
