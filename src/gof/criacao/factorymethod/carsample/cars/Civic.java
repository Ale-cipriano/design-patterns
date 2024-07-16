package gof.criacao.factorymethod.carsample.cars;

import gof.criacao.factorymethod.carsample.Car;

/**
 * @author alessandro.cipriano
 */
public class Civic implements Car {

    @Override
    public void getDescription() {
        System.out.println("Model: Civic\nFactor: Honda\n");
    }

}
