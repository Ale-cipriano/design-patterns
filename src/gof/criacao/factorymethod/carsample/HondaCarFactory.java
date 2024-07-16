package gof.criacao.factorymethod.carsample;

import gof.criacao.factorymethod.carsample.cars.Civic;

/**
 * @author alessandro.cipriano
 */
public class HondaCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new Civic();
    }

}
