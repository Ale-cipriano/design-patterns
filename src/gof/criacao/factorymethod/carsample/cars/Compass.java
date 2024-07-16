package gof.criacao.factorymethod.carsample.cars;

import gof.criacao.factorymethod.carsample.Car;

/**
 * @author alessandro.cipriano
 */
public class Compass implements Car {

    @Override
    public void getDescription() {
        System.out.println("Model: Compass\nFactor: Jeep\n");
    }

}