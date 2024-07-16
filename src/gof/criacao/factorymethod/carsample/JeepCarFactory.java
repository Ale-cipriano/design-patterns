package gof.criacao.factorymethod.carsample;

import gof.criacao.factorymethod.carsample.cars.Compass;

/**
 * @author alessandro.cipriano
 */
public class JeepCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new Compass();
    }

}
