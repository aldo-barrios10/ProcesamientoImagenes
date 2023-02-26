
package PDI6_Brillo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class metodos extends PDIP6_Brillo{
    
    public static void histograma(int R[], int G[], int B[], String filepath){
        
        for(int i=0; i<256; i++){
            R[i]=0;
            G[i]=0; 
            B[i]=0; 
        }
        
        BufferedImage image;
        try {
            image = ImageIO.read(new File(filepath));
            int x=image.getWidth();
            int y=image.getHeight();    
            
            for(int i=1;i<=y;i++){
                for(int j=1;j<=x;j++){
                    int f = image.getRGB(j-1, i-1);
                    Color c = new Color(f);
                    int IR=c.getRed();
                    R[IR]+=1;
                    int IG=c.getGreen();
                    G[IG]+=1;
                    int IB=c.getBlue();
                    B[IB]+=1;       
                }
            }            
        } catch (IOException ex) {
            System.out.println("No hay imagen ");
        }
    }
      
    public static void dibuja_histo(int[] lista, Color colorBarras, String color, JPanel panel_grafica){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
        for(int i=0;i<256;i++){
            dataset.addValue(lista[i], "Numero de pixeles", ""+i);
        }
        String titulo="Histograma "+color;
        JFreeChart chart = ChartFactory.createBarChart(titulo, null, null,
                                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setSeriesPaint(0, colorBarras); 
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(214, 217, 223)); 

        panel_grafica.removeAll();
        panel_grafica.repaint();
        panel_grafica.setLayout(new java.awt.BorderLayout());
        panel_grafica.add(new ChartPanel(chart));
        panel_grafica.validate();
        
    }
    
    public static void ventana_aux(BufferedImage image, String titulo){
        ImageIcon imageIcon = new ImageIcon(image);
        JFrame jFrame = new JFrame();
        jFrame.setTitle(titulo);
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(1, 1, 550, 550);     
        jFrame.setSize(400, 350);
        
        JLabel jLabel = new JLabel();
        jLabel.setMinimumSize(new java.awt.Dimension(700,700));
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setVerticalAlignment(SwingConstants.TOP);
        scroll.setViewportView(jLabel);
        jFrame.add(scroll);
        
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void crear_brillo(String valor, String filepath) throws IOException{
        
        try{
            int aumento=parseInt(valor);
            if(aumento > 255){
                aumento=255;
            }

            int NR, NG, NB;
            File file = new File(filepath);
            BufferedImage bufferedImage = ImageIO.read(file);
            int x=bufferedImage.getWidth();
            int y=bufferedImage.getHeight();

            for(int i=1;i<=y;i++){
                for(int j=1;j<=x;j++){
                    int f = bufferedImage.getRGB(j-1, i-1);
                    Color c = new Color(f);
                    int IR=c.getRed();           
                    int IG=c.getGreen();
                    int IB=c.getBlue();

                    NR=aumento+IR;
                    NG=aumento+IG;
                    NB=aumento+IB;

                    if(NR >255){
                        NR = 255;
                    } else if(NR<0){
                        NR = 0;
                    }

                    if(NG >255){
                        NG = 255;
                    } else if(NG<0){
                        NG = 0;
                    }

                    if(NB >255){
                        NB = 255;
                    } else if(NB<0){
                        NB = 0;
                    }

                    Color newColor = new Color(NR, NG, NB);

                    int rgb = newColor.getRGB();


                    bufferedImage.setRGB(j-1,i-1,rgb);
                }
            }

            ventana_aux(bufferedImage, "Imagen con Brillo");
        }catch(NumberFormatException e){
     
        }
     }
     
     public static void crear_negativo(String valor, String filepath) throws IOException{
        try{
            int constante=parseInt(valor);
            if(constante > 255){
                constante=255;
            }
            int NR, NG, NB;
            File file = new File(filepath);
            BufferedImage bufferedImage = ImageIO.read(file);
            int x=bufferedImage.getWidth();
            int y=bufferedImage.getHeight();

            for(int i=1;i<=y;i++){
                for(int j=1;j<=x;j++){
                    int f = bufferedImage.getRGB(j-1, i-1);
                    Color c = new Color(f);
                    int IR=c.getRed();           
                    int IG=c.getGreen();
                    int IB=c.getBlue();

                    NR=constante-IR;
                    NG=constante-IG;
                    NB=constante-IB;

                    if(NR <0){
                        NR = 0;
                    } 
                    if(NG <0){
                        NG = 0;
                    } 

                    if(NB <0){
                        NB = 0;
                    } 

                    Color newColor = new Color(NR, NG, NB); // Color white

                    int rgb = newColor.getRGB();
                    bufferedImage.setRGB(j-1,i-1,rgb);
                }
            }
            ventana_aux(bufferedImage, "Imagen Negativa");;
        }catch(NumberFormatException e){              
        }
    }
    
}
