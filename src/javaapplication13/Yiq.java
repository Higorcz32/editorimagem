package javaapplication13;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author higor
 */
public class Yiq {
    
    BufferedImage imagem;
    int altura;
    int largura;

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public Yiq(BufferedImage imagem, int largura, int altura) {
        this.imagem = imagem;
        this.altura = altura;
        this.largura = largura;
    }
    
    public double[][][] yiq(int largura, int altura){
        double[][][] matriz = new double [largura][altura][3];
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                
                matriz[i][j][0] = 0.299 * red + 0.587 * green + 0.114 * blue;
                matriz[i][j][1] = 0.596 * red - 0.274 * green - 0.322 * blue;
                matriz[i][j][2] = 0.211 * red - 0.523 * green + 0.312 * blue;
            }
        }
        return matriz;
    }
    
    public BufferedImage rgb(double [][][] matriz){
        int altura = matriz[0].length;
        int largura = matriz.length;
        
        BufferedImage imagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
        
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));

                int red = cor.getRed();  
                int green = cor.getGreen();  
                int blue = cor.getBlue(); 

                if(cor.getRed() < 0 ){
                    red = 0;
                }
                else if(cor.getRed() > 255){
                    red = 255;
                }
                
                if(cor.getGreen() < 0){
                    green = 0;
                }
                else if(cor.getGreen() > 255){
                    green = 255;
                }
                
                if(cor.getBlue() < 0){
                    blue = 0;
                }
                else if(cor.getBlue() > 255){
                    blue = 255;
                }
                
                
                matriz[i][j][0] = + 0.956*matriz[i][j][1] + 0.621*matriz[i][j][2];
                matriz[i][j][0] = - 0.272*matriz[i][j][1] - 0.647*matriz[i][j][2];
                matriz[i][j][0] = - 1.106*matriz[i][j][1] + 1.703*matriz[i][j][2];
                
                imagem.setRGB(i, j, cor.getRGB());
            }
        }
        return imagem;
    }
}
