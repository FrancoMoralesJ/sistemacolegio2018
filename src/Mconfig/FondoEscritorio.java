package Mconfig;

import com.mysql.jdbc.Buffer;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class FondoEscritorio implements Border {

    BufferedImage fondo;

    public FondoEscritorio(String nombre) {
        try {
            //se obtiene la imagen
            URL url = new URL(getClass().getResource("/IconosFrm/" + nombre).toString());
            fondo = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(FondoEscritorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // se sobreescriben metodos propios de Border
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        //se dibuja la imagen de fondo en el centro del contenedor
        //cada vez que se redimensione el contenedor, la imagen automaticamente se posiciona en el centro
        //hay que tener en cuenta que la resolución de nuestra imagen sea igual o inferior al tamaño del Jframe para que se visualice en su totalidad
        g.drawImage(fondo, (x + (width - fondo.getWidth()) / 2), (y + (height - fondo.getHeight()) / 2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

}
