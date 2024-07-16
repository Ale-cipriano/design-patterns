package gof.estrutura.adapter;

/**
 * @author alessandro.cipriano
 */
public class ImagemPng {

    public void carregarImagemPng(String arquivo) {
        System.out.println("[ImagemPng] a imagem " + arquivo + " carregada");
    }

    public void desenharImagemPng(int posicaoX, int posicaoY) {
        System.out.println("[ImagemPng] a imagem foi desenhada");
    }

}
