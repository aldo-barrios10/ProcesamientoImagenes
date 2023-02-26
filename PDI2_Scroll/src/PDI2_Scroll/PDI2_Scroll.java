package PDI2_Scroll;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author aldo_
 */
public class PDI2_Scroll extends Frame implements ActionListener, ScrollPaneConstants {
    public Image imagen;
    int ancho, largo;
    JMenu archivo_menu, submenu;  
    JMenuItem archivo_escoger;  
    JLabel etiqueta;
    JPanel panel;
    ScrollPane scroll;
    int x, y;
        
    public PDI2_Scroll(){  
    JFrame f= new JFrame("Aplicación 2"); 
    JMenuBar menuBar=new JMenuBar(); 
    etiqueta = new JLabel();
    panel = new JPanel();
    
    archivo_menu=new JMenu("Archivo");  
    archivo_escoger=new JMenuItem("Elegir Archivo");  
    archivo_menu.add(archivo_escoger); 
    archivo_escoger.addActionListener(this);
    
    menuBar.add(archivo_menu); 
      
    etiqueta.setBounds(30,30,300,300);
    panel.add(etiqueta);
    panel.setBounds(0, 0, 200, 200);
    
    final JScrollPane scroller = new JScrollPane(panel,  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scroller.setViewportView(panel);
    etiqueta.setBackground(new java.awt.Color(255,0, 0));
    f.setJMenuBar(menuBar);
    f.add(scroller);
    f.setSize(800,600);  
    f.setVisible(true);  
    
    f.addWindowListener(
        new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent evt){
                System.exit(0);
                }
            }
        );
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {    
        if(e.getSource()==archivo_escoger){
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            j.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
            j.setAcceptAllFileFilterUsed(false);
            int i=j.showOpenDialog(this);  
            
            if(i==JFileChooser.APPROVE_OPTION){    
                File f=j.getSelectedFile();    
                String filepath=f.getPath();    
                ImageIcon icon = new ImageIcon( filepath );
                etiqueta.setIcon( icon );
                x=etiqueta.getHeight();
                y = etiqueta.getWidth();
            }   
        }    
    }     
    
    public static void main(String[] args) {
        new PDI2_Scroll();
    }
    
    @Override
    public void paint(Graphics g){
        largo = imagen.getHeight(this);
        ancho = imagen.getWidth(this);
        g.drawImage(imagen, 10, 10, ancho, largo, this);
    }   
}