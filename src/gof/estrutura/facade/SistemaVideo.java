package gof.estrutura.facade;

/**
 * @author alessandro.cipriano
 */
public class SistemaVideo {

    public void configurarCores() {
        System.out.println("[SistemaVideo] configurando cores");
    }

    public void configurarResolucao() {
        System.out.println("[SistemaVideo] configurando resolução");
    }

    public void renderizarImagem(final String imagem) {
        System.out.println(String.format("[SistemaVideo] renderizando %s", imagem));
    }
}
