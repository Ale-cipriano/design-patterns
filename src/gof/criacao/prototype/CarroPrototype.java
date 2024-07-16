package gof.criacao.prototype;

import java.math.BigDecimal;

/**
 * @author alessandro.cipriano
 */
@SuppressWarnings("all")
public abstract class CarroPrototype {

    protected BigDecimal preco;

    public abstract void imprimirInformacoes();

    public abstract CarroPrototype clonar();

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(final BigDecimal preco) {
        this.preco = preco;
    }

}
