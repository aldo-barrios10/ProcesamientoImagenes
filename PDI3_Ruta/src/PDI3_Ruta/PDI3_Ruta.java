
package PDI3_Ruta;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class PDI3_Ruta extends javax.swing.JFrame {

    public PDI3_Ruta() {
        initComponents();
    }
                       
    private void initComponents() {
        this.setTitle("Aplicación 3");
        panel_principal = new javax.swing.JPanel();
        panel_xy = new javax.swing.JPanel();
        label_ruta = new javax.swing.JLabel();
        label_largo = new javax.swing.JLabel();
        label_alto = new javax.swing.JLabel();
        panel_img = new javax.swing.JScrollPane();
        label_img = new javax.swing.JLabel();
        bar_menu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_archivo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_xy.setBackground(new java.awt.Color(255, 255, 255));

        
        panel_xy.setPreferredSize(new java.awt.Dimension(0, 25));

        label_ruta.setText("Ruta:");
        label_ruta.setToolTipText("");
        label_largo.setText("Largo:");
        label_alto.setText("Alto:");
        
        
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
                    .addComponent(label_alto)))
        );
        
        label_img.setHorizontalAlignment(SwingConstants.LEFT);
        label_img.setVerticalAlignment(SwingConstants.TOP);
        panel_img.setViewportView(label_img);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_xy, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(panel_img, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(panel_xy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_img, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
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
                String filepath=f.getPath();    
                ImageIcon icon = new ImageIcon( filepath );
                label_img.setIcon( icon );
                
                int x = label_img.getHeight();
                int y = label_img.getWidth();
                
                label_largo.setText("Largo: " +x);
                label_alto.setText("Alto: " +y);
                
                label_ruta.setText("Ruta: "+ filepath);
            }   
        }    
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDI3_Ruta().setVisible(true);
            }
        });
    }

                   
    private javax.swing.JMenuBar bar_menu;
    private javax.swing.JLabel label_alto;
    private javax.swing.JLabel label_img;
    private javax.swing.JLabel label_largo;
    private javax.swing.JLabel label_ruta;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_archivo;
    private javax.swing.JScrollPane panel_img;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_xy;
                  
}
