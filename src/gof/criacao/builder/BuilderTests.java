package gof.criacao.builder;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public class BuilderTests {

    private static final int TAMANHO_GIGANTE = 10;

    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder(TAMANHO_GIGANTE)
                .calabresa(false)
                .queijo(true)
                .tomate(true)
                .build();

        System.out.println(pizza);
    }

}
