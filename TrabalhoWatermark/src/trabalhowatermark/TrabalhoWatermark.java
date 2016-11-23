package trabalhowatermark;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class TrabalhoWatermark {
    public static final String Formato = "jpg";
    public static final Color Cor = new Color(1, 1, 1, 0.28f);
    public static final Font Fonte = new Font("Wide Latin", Font.BOLD, 20);
    public static String makeWaterMark(String fileName, String ctx, int i)
            throws Exception {
            try {
                String dest = execute(ctx + "/" + fileName,"dest","TESTE", Cor, Fonte, i);
                return dest.substring(ctx.length());
            } catch (Exception ex) {
                return fileName;
            }
    }
    
        public static String execute(String src, String dest, String text,
        Color color, Font font, int i) throws Exception {
        BufferedImage srcImage = ImageIO.read(new File(src));

        int width = srcImage.getWidth(null);
        int height = srcImage.getHeight(null);
        BufferedImage destImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = destImage.getGraphics();

        g.drawImage(srcImage, 0, 0, width, height, null);
        g.setColor(color);
        g.setFont(font);
        g.drawString(text, (int) (width / 1.35), height - 10);
        g.dispose();

        ImageIO.write(destImage, Formato, new File("img" + i + ".jpg"));
        return dest;
    }
}