
package PDI4_RGB;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class PDI4_RGB extends javax.swing.JFrame implements MouseMotionListener {
    
    

    public PDI4_RGB() {
        initComponents();
    }
                  
    private void initComponents() {
        
        
        this.setTitle("Aplicación 4");
        panel_principal = new javax.swing.JPanel();
        panel_xy = new javax.swing.JPanel();
        label_ruta = new javax.swing.JLabel();
        label_largo = new javax.swing.JLabel();
        label_alto = new javax.swing.JLabel();
        
        label_R = new javax.swing.JLabel();
        label_G = new javax.swing.JLabel();
        label_B = new javax.swing.JLabel();
        
        panel_img = new javax.swing.JScrollPane();
        label_img = new javax.swing.JLabel();
        bar_menu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_archivo = new javax.swing.JMenuItem();
        
        //label_img.addMouseMotionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        //setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_xy.setBackground(new java.awt.Color(255, 255, 255));
        
       

        
        panel_xy.setPreferredSize(new java.awt.Dimension(0, 25));

        label_ruta.setText("Ruta:");
        
        label_largo.setText("X:");
        label_alto.setText("Y:");
        label_R.setText("R:");
        label_G.setText("G:");
        label_B.setText("B:");
        
        
         menu.setText("File");

        menu_archivo.setText("Abrir");
        menu_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_archivoActionPerformed(evt);
            }
        });
        menu.add(menu_archivo);

        bar_menu.add(menu);

        setJMenuBar(bar_menu);


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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_largo)
                .addGap(49, 49, 49)
                .addComponent(label_alto)
                .addGap(78, 78, 78))
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
        label_img.setHorizontalAlignment(SwingConstants.LEFT);
        label_img.setVerticalAlignment(SwingConstants.TOP);
        panel_img.setViewportView(label_img);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_xy, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
            .addComponent(panel_img, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(panel_xy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_img, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        
        
    }// </editor-fold>                        

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
                label_img.addMouseMotionListener(this);
                int lx = label_img.getHeight();
                int ly = label_img.getWidth();
                panel_img.setMaximumSize(new Dimension(lx,ly));
                label_img.setMaximumSize(new Dimension(lx,ly));
                label_ruta.setText("Ruta: "+ filepath);
            }   
        }    
    }      
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDI4_RGB().setVisible(true);
            }
        });
    }

                   
    private javax.swing.JMenuBar bar_menu;
    private javax.swing.JLabel label_alto;
    private javax.swing.JLabel label_img;
    private javax.swing.JLabel label_largo;
    private javax.swing.JLabel label_ruta;
    private javax.swing.JLabel label_R;
    private javax.swing.JLabel label_G;
    private javax.swing.JLabel label_B;

    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_archivo;
    private javax.swing.JScrollPane panel_img;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_xy;        
    private String filepath;

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
