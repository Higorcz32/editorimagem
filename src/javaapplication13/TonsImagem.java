package javaapplication13;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author higor
 */
public class TonsImagem {
    
    BufferedImage imagem;
    int largura;
    int altura;
    
    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }

    public int getAltura() {
        return largura;
    }

    public void setAltura(int largura) {
        this.largura = largura;
    }

    public int getLargura() {
        return altura;
    }

    public void setLargura(int altura) {
        this.altura = altura;
    }

    public TonsImagem(BufferedImage imagem, int largura, int altura) {
        this.imagem = imagem;
        this.largura = largura;
        this.altura = altura;
    }
    
    // LETRA A
    
    public BufferedImage bandaR(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                Color vermelho = new Color(red, 0, 0);
                imagem.setRGB(i, j, vermelho.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA B
    
    public BufferedImage bandaG(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int green = cor.getGreen();
                Color vermelho = new Color(0, green, 0);
                imagem.setRGB(i, j, vermelho.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA C
    
    public BufferedImage bandaB(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int blue = cor.getBlue();
                Color vermelho = new Color(0, 0, blue);
                imagem.setRGB(i, j, vermelho.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA D
        
    public BufferedImage cinzaR(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                Color cinza = new Color(red, red, red);
                imagem.setRGB(i, j, cinza.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA E
    
    public BufferedImage cinzaG(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int green = cor.getGreen();
                Color cinza = new Color(green, green, green);
                imagem.setRGB(i, j, cinza.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA F
    
    public BufferedImage cinzaB(int largura, int altura){
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int blue = cor.getBlue();
                Color cinza = new Color(blue, blue, blue);
                imagem.setRGB(i, j, cinza.getRGB());
            }
        }
        return imagem;
    }
    
    // LETRA G
    
    public BufferedImage cinzaMedia(int largura, int altura){
        
        
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                
                int media = (red + green + blue) / 3;
                
                Color cinza = new Color(media, media, media);
                imagem.setRGB(i, j, cinza.getRGB());
            }
        }
        return imagem;
    }
    
    public BufferedImage negativoRGB(int largura, int altura){
        
        for(int i=0; i<largura; i++){
            for(int j=0; j<altura; j++){
                Color cor = new Color(imagem.getRGB(i, j));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color negativo = new Color(255 - red, 255 - green, 255 - blue);
                imagem.setRGB(i, j, negativo.getRGB());
            }
        }
        return imagem;
    }
    
    
        
        
        
        
    
}    
    

