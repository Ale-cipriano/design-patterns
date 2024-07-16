package gof.comportamento.state;

/**
 * @author alessandro.cipriano
 */
public interface MarioState {

    MarioState pegarCogumelo();

    MarioState pegarFlor();

    MarioState pegarPena();

    MarioState levarDano();

}
