package javaapplication13;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author higor
 */
public class PintarImagem  {
    
    public static void main(String [] agrs) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        int altura;
        int largura;
        String URL = sc.nextLine();
    
        BufferedImage imagem = ImageIO.read(new File(URL));
        
        altura = imagem.getHeight();
        largura = imagem.getWidth();
        
        System.out.println("URL: " + URL);
        System.out.println("largura: " + largura);
        System.out.println("altura: " + altura);
        
        // LETRA A
                
        //if(altura == 0 && largura == 0){
            //Color cor = new Color(255, 255, 0);
                    
          //  imagem.setRGB(0, 0, cor.getRGB());
        //}
                
        // LETRA B
                
        //if(altura == largura && altura%2 == 0 && largura%2 == 0){
            //Color cor = new Color(0, 0, 0);
                    
          //  imagem.setRGB(altura/2, largura/2, cor.getRGB());
        //}
                
        // LETRA C
                
        //if(altura-1 == largura-1){
          //  Color cor = new Color(255, 255, 255);
                    
            //imagem.setRGB(altura-1, largura-1, cor.getRGB());
        //}
        
        TonsImagem foto = new TonsImagem(imagem, largura, altura);
        
        foto.negativoRGB(largura, altura);
        
        //Yiq i = new Yiq(imagem, altura, largura);
        
       
        //i.rgb(i.yiq(altura, largura));
        
        ImageIO.write(imagem, "PNG", new File("C:\\Users\\higor\\Desktop\\Flamengot.png"));
        
        
    }
        
}
    


