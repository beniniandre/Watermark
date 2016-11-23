package trabalhowatermark;

public class Trabalho {

    public static void main(String[] args) throws Exception {
        TrabalhoWatermark.makeWaterMark("arvore.jpg", "Imagens", 1);
        TrabalhoWatermark.makeWaterMark("gato.jpg", "Imagens", 2);
        TrabalhoWatermark.makeWaterMark("lena.jpg", "Imagens", 3 );
        TrabalhoWatermark.makeWaterMark("natureza.jpg", "Imagens", 4);
        TrabalhoWatermark.makeWaterMark("vulcao.jpg", "Imagens", 5);
    }
    
}
