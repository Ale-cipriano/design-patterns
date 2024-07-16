package gof.criacao.abstractfactory.carros;

import gof.criacao.abstractfactory.CarroSedan;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public class Jetta implements CarroSedan {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Jetta\nCategoria: Sedan\n");
    }

}
