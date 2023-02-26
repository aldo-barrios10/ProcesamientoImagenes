package PDI6_Brillo;


import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.Color;
import javax.swing.SwingConstants;


public class PDIP6_Brillo extends javax.swing.JFrame implements MouseMotionListener{

    public PDIP6_Brillo() {
        initComponents();
    }
                     
    private void initComponents() {
        this.setTitle("Aplicación 6");
        panel_principal = new javax.swing.JPanel();
        panel_grafica = new javax.swing.JPanel();
        panel_xy = new javax.swing.JPanel();
        label_ruta = new javax.swing.JLabel();
        label_largo = new javax.swing.JLabel();
        label_alto = new javax.swing.JLabel();
        label_R = new javax.swing.JLabel();
        label_G = new javax.swing.JLabel();
        label_B = new javax.swing.JLabel();
        panel_img = new javax.swing.JScrollPane();
        label_img = new javax.swing.JLabel();
        panel_histo = new javax.swing.JPanel();
        butt_histR = new javax.swing.JButton();
        butt_histG = new javax.swing.JButton();
        butt_histB = new javax.swing.JButton();
        boton_brillo = new javax.swing.JButton();
        boton_negativo = new javax.swing.JButton();
        brillo_valor = new javax.swing.JTextField();
        negativo_valor = new javax.swing.JTextField();
        bar_menu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_archivo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 550));

        panel_principal.setBackground(new java.awt.Color(150, 150, 150));

        panel_xy.setBackground(new java.awt.Color(150, 150, 150));
        panel_xy.setPreferredSize(new java.awt.Dimension(0, 25));

        label_ruta.setText("Ruta:");
        label_ruta.setToolTipText("");
        label_largo.setText("Largo:");
        label_alto.setText("Ancho:");
        label_R.setText("R:");
        label_G.setText("G:");
        label_B.setText("B:");
        
        butt_histR.setText("Histograma R");
        butt_histG.setText("Histograma G");
        butt_histB.setText("Histograma B");

        menu.setText("Archivo");
        menu.add(menu_archivo);
        bar_menu.add(menu);
        setJMenuBar(bar_menu);
        menu_archivo.setText("Abrir");
            
        boton_brillo.setText("Aplicar Brillo");
        boton_negativo.setText("Aplicar Negativo");
        
        label_img.setMinimumSize(new java.awt.Dimension(700,500));
        label_img.setHorizontalAlignment(SwingConstants.LEFT);
        label_img.setVerticalAlignment(SwingConstants.TOP);
        panel_img.setViewportView(label_img);
                      
         javax.swing.GroupLayout panel_xyLayout = new javax.swing.GroupLayout(panel_xy);
        panel_xy.setLayout(panel_xyLayout);
        panel_xyLayout.setHorizontalGroup(
            panel_xyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_xyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_ruta)
                .addGap(96, 96, 96)
                .addComponent(label_R)
                .addGap(18, 18, 18)
                .addComponent(label_G)
                .addGap(18, 18, 18)
                .addComponent(label_B)
                .addGap(50, 50, 50)
                .addComponent(label_largo)
                .addGap(35, 35, 35)
                .addComponent(label_alto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_xyLayout.setVerticalGroup(
            panel_xyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_xyLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(panel_xyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ruta)
                    .addComponent(label_largo)
                    .addComponent(label_alto)
                    .addComponent(label_R)
                    .addComponent(label_G)
                    .addComponent(label_B)))
        );

         javax.swing.GroupLayout panel_graficaLayout = new javax.swing.GroupLayout(panel_grafica);
        panel_grafica.setLayout(panel_graficaLayout);
        panel_graficaLayout.setHorizontalGroup(
            panel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        panel_graficaLayout.setVerticalGroup(
            panel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_histoLayout = new javax.swing.GroupLayout(panel_histo);
        panel_histo.setLayout(panel_histoLayout);
        panel_histoLayout.setHorizontalGroup(
            panel_histoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_histoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_histoLayout.setVerticalGroup(
            panel_histoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_histoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_xy, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(panel_img, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_histo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(panel_xy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_histo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_img))
                .addContainerGap())
        );
        
        menu_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_archivoActionPerformed(evt);
            }
        });
        butt_histR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_histRActionPerformed(evt);
            }
        });
        butt_histG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_histGActionPerformed(evt);
            }
        });
        butt_histB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_histBActionPerformed(evt);
            }
        });
        boton_brillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    brilloActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDIP6_Brillo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        boton_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    negativoActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDIP6_Brillo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(butt_histR)
                .addGap(18, 18, 18)
                .addComponent(butt_histG)
                .addGap(18, 18, 18)
                .addComponent(butt_histB)
                .addGap(241, 241, 241)
                .addComponent(brillo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_brillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(negativo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butt_histR)
                        .addComponent(butt_histG)
                        .addComponent(butt_histB))
                    .addComponent(boton_negativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_brillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brillo_valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(negativo_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }  
    
    private void menu_archivoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(evt.getSource()==menu_archivo){
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            j.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
            j.setAcceptAllFileFilterUsed(false);
            int i=j.showOpenDialog(this);  
            
            if(i==JFileChooser.APPROVE_OPTION){    
                File f=j.getSelectedFile();    
                filepath=f.getPath();    
                ImageIcon icon = new ImageIcon( filepath );
                
                label_img.setIcon( icon );
                label_img.addMouseMotionListener((MouseMotionListener) this);
                int lx = label_img.getHeight();
                int ly = label_img.getWidth();

                label_ruta.setText("Ruta: "+ filepath);
                metodos.histograma(R,G,B, filepath);
            }   
        }    
    }

    private void butt_histRActionPerformed(java.awt.event.ActionEvent evt) {                                           
        metodos.dibuja_histo(R, new Color(255, 0, 0), "Rojo", panel_grafica);
    }   
    private void butt_histGActionPerformed(java.awt.event.ActionEvent evt) {                                           
        metodos.dibuja_histo(G, new Color(0, 255, 0), "Verde",panel_grafica);
    }   
    private void butt_histBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        metodos.dibuja_histo(B, new Color(0, 0, 255), "Azul", panel_grafica);
    }  
    
     private void brilloActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String valor=brillo_valor.getText();
        metodos.crear_brillo(valor, filepath);
    } 
     
      private void negativoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        String valor=negativo_valor.getText();
        metodos.crear_negativo(valor, filepath);
    } 

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PDIP6_Brillo().setVisible(true);
            }
        });
    }
                   
    public javax.swing.JLabel label_G;
    public javax.swing.JMenuBar bar_menu;
    public javax.swing.JButton butt_histB;
    public javax.swing.JButton butt_histG;
    public javax.swing.JButton butt_histR;
    public javax.swing.JLabel label_B;
    public javax.swing.JLabel label_R;
    public javax.swing.JLabel label_alto;
    public javax.swing.JLabel label_img;
    public javax.swing.JLabel label_largo;
    public javax.swing.JLabel label_ruta;
    public javax.swing.JMenu menu;
    public javax.swing.JMenuItem menu_archivo;
    public javax.swing.JPanel panel_histo;
    public javax.swing.JPanel panel_grafica;
    public javax.swing.JScrollPane panel_img;
    public javax.swing.JPanel panel_principal;
    public javax.swing.JPanel panel_xy;    
    public javax.swing.JButton boton_brillo;
    public javax.swing.JTextField brillo_valor;
    public javax.swing.JButton boton_negativo;
    public javax.swing.JTextField negativo_valor;
    public String filepath;
    public final int[] R=new int[256];
    public final int[] G=new int[256];
    public final int[] B=new int[256];
    
    @Override
    public void mouseMoved(MouseEvent me) {
        int x=(int)me.getPoint().getX();
        int y=(int)me.getPoint().getY();
        label_largo.setText("X: "+x);
        label_alto.setText("Y: "+y);
        try {
            BufferedImage image = ImageIO.read(new File(filepath));
            
            int f = image.getRGB(x, y);
            Color c = new Color(f);
            label_R.setText("R: "+c.getRed());
            label_G.setText("G: "+c.getGreen());
            label_B.setText("B: "+c.getBlue());
            
        } catch (Exception ex) {
            
        }         
    }
    @Override
    public void mouseDragged(MouseEvent me) {
        
    }
}