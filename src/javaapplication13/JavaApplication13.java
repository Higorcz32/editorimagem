
package javaapplication13;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import java.awt.Color;

/**
 *
 * @author higor
 */
public class JavaApplication13 {

    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int largura = 0;
        int altura = 0;
        String URL =  sc.nextLine();
        System.out.println(URL);
        
        BufferedImage imagem = ImageIO.read(new File(URL));
        
        //ImageIO.write(imagem, "PNG", new File("C:\\Users\\higor\\Desktop\\Flamengo.png"));
        
        altura = imagem.getHeight();
        largura = imagem.getWidth();
        
        System.out.println("URL: " + URL);
        System.out.println("lagura: " + largura);
        System.out.println("altura: " + altura);
        
        //for(int i=0; i<altura; i++){
          //  for(int j=0; j<largura; j++){
            //    Color cor = new Color(imagem.getRGB(i, j));
              //      int red = cor.getRed();
                //    int green = cor.getGreen();
                  //  int blue = cor.getBlue();
                    //System.out.println("Pixel " + (i+1) + "/" + (j+1) + " RGB(" + red + ", " + green + ", " + blue + ")");
                //}
            //}
            
        TonsImagem foto = new TonsImagem(imagem, altura, largura);
        
        foto.negativoRGB(altura, largura);
        
        ImageIO.write(imagem, "PNG", new File("C:\\Users\\higor\\Desktop\\Flamengo.png"));
        }
    }
    

