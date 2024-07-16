package gof.criacao.abstractfactory;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public interface FabricaDeCarro {

    CarroSedan fabricarSedan();
    CarroHatch fabricarHatch();

}
