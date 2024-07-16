package gof.criacao.abstractfactory;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public class AbstractFactoryTests {

    public static void main(String[] args) {

        FabricaDeCarro fabrica = new FabricaHonda();
        CarroHatch carroHatch = fabrica.fabricarHatch();
        CarroSedan carroSedan = fabrica.fabricarSedan();
        carroHatch.imprimirInformacoes();
        carroSedan.imprimirInformacoes();

        fabrica = new FabricaVolkswagen();
        carroHatch = fabrica.fabricarHatch();
        carroSedan = fabrica.fabricarSedan();
        carroHatch.imprimirInformacoes();
        carroSedan.imprimirInformacoes();

    }

}
