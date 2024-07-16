package gof.criacao.abstractfactory.carros;

import gof.criacao.abstractfactory.CarroSedan;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public class Civic implements CarroSedan {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Civic\nCategoria: Sedan\n");
    }

}
