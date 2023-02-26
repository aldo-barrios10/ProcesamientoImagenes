package PDI8_Filtr;


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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class PDI8_Filtro extends javax.swing.JFrame implements MouseMotionListener{

    public PDI8_Filtro() {
        initComponents();
    }
    
                     
    private void initComponents() {
        this.setTitle("Aplicación 8");
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
        menu_conv = new javax.swing.JMenu();
        menu_personalizado = new javax.swing.JMenu();
        menu_archivo = new javax.swing.JMenuItem();
        menu_borde = new javax.swing.JMenuItem();
        menu_3x3 = new javax.swing.JMenuItem();
        menu_5x5 = new javax.swing.JMenuItem();
        menu_7x7 = new javax.swing.JMenuItem();
        
        menu_sobel1 = new javax.swing.JMenuItem();
        menu_sobel2 = new javax.swing.JMenuItem();
        menu_prewitt1 = new javax.swing.JMenuItem();
        menu_prewitt2 = new javax.swing.JMenuItem();
        menu_laplace = new javax.swing.JMenuItem();
        
        

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
        
        
        menu_conv.setText("Convolución");
        menu_conv.add(menu_borde);
        menu_conv.add(menu_sobel1);
        menu_conv.add(menu_sobel2);
        menu_conv.add(menu_prewitt1);
        menu_conv.add(menu_prewitt2);
        menu_conv.add(menu_laplace);
        bar_menu.add(menu_conv);
        
        
        menu_personalizado.setText("Filto Personalizado");
        menu_personalizado.add(menu_3x3);
        menu_personalizado.add(menu_5x5);
        menu_personalizado.add(menu_7x7);
        bar_menu.add(menu_personalizado);
        
        setJMenuBar(bar_menu);
        
        menu_archivo.setText("Abrir");
        menu_borde.setText("Borde");
        menu_sobel1.setText("Sobel 1");
        menu_sobel2.setText("Sobel 2");
        menu_prewitt1.setText("Prewitt 1");
        menu_prewitt2.setText("Prewitt 2");
        menu_laplace.setText("Laplace");
        
        menu_3x3.setText("Filtro 3x3");
        menu_5x5.setText("Filtro 5x5");
        menu_7x7.setText("Filtro 7x7");
        
            
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
            .addGap(0, 649, Short.MAX_VALUE)
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
        
        //-------------------------Convolución --------------------------------
        menu_borde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menu_bordeActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        menu_sobel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menu_sobel1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        menu_sobel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menu_sobel2ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        menu_prewitt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menu_prewitt1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         menu_prewitt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menu_prewitt2ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
        menu_laplace.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              try {
                  menu_laplaceActionPerformed(evt);
              } catch (IOException ex) {
                  Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        });
        
        
        
        //-------------------Filtros personalizados----------------------------------
        menu_3x3.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              menu_3x3ActionPerformed(evt);
          }

            private void menu_3x3ActionPerformed(ActionEvent evt) {
                interfaz.interfaz_3x3(filepath);
            }
        });
        
        menu_5x5.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              menu_5x5ActionPerformed(evt);
          }

            private void menu_5x5ActionPerformed(ActionEvent evt) {
                interfaz.interfaz_5x5(filepath);
            }
        });
        
        menu_7x7.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              menu_7x7ActionPerformed(evt);
          }

            private void menu_7x7ActionPerformed(ActionEvent evt) {
                interfaz.interfaz_7x7(filepath);
            }
        });
        
        
        
        //------------Histograma------------------------
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
        
        //-----------------Brillo y negativos-------------------------------------
        boton_brillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    brilloActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        boton_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    negativoActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(PDI8_Filtro.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
    
    private void menu_bordeActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int[][] matriz={{-1,-1,-1},{-1,8,-1},{-1,-1,-1}};
        metodos.conv(filepath, matriz, "Convolución Borde",3); 
    }

    private void menu_sobel1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int[][] matriz={{-1,-1,-1},{0,0,0},{1,1,1}};
        metodos.conv(filepath, matriz,"Convolución Sobel 1",3);  
    }
    private void menu_sobel2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int[][] matriz={{-1,0,1},{-1,0,1},{-1,0,1}};
        metodos.conv(filepath, matriz,"Convolución Sobel 2",3); 

    }
    private void menu_prewitt1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
       int[][] matriz={{-1,-2,-1},{0,0,0},{1,2,1}};
        metodos.conv(filepath, matriz, "Convolución Prewitt 1",3);  
    }

    private void menu_prewitt2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int[][] matriz={{-1,0,1},{-2,0,2},{-1,0,1}};
        metodos.conv(filepath, matriz, "Convolución Prewitt 2",3); 
    }

    private void menu_laplaceActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int[][] matriz={{-1,0,-1},{0,4,0},{-1,0,-1}};
        metodos.conv(filepath, matriz, "Convolución Laplace",3); 
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
                new PDI8_Filtro().setVisible(true);
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
    public javax.swing.JMenu menu_conv;
    public javax.swing.JMenu menu_personalizado;
    public javax.swing.JMenuItem menu_archivo;
    public javax.swing.JMenuItem menu_borde;
    public javax.swing.JMenuItem menu_sobel1;
    public javax.swing.JMenuItem menu_sobel2;
    public javax.swing.JMenuItem menu_prewitt1;
    public javax.swing.JMenuItem menu_prewitt2;
    public javax.swing.JMenuItem menu_laplace;
    public javax.swing.JMenuItem menu_3x3;
    public javax.swing.JMenuItem menu_5x5;
    public javax.swing.JMenuItem menu_7x7;
    
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