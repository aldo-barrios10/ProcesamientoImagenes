
package pdi9_guardar;


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class interfaz extends PDI9_Guardar{
    
    
    
        public static void interfaz_3x3(String filepath){
   
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Matriz 3");
        JPanel panel = new JPanel();
        jFrame.setSize(250,300);
        JLabel label = new JLabel();
        
        JTextField m1 = new JTextField();
        JTextField m2 = new JTextField();
        JTextField m3 = new JTextField();
        JTextField m4 = new JTextField();
        JTextField m5 = new JTextField();
        JTextField m6 = new JTextField();
        JTextField m7 = new JTextField();
        JTextField m8 = new JTextField();
        JTextField m9 = new JTextField();
        JButton boton_filtro = new JButton();
        
        jFrame.setPreferredSize(new java.awt.Dimension(250, 300));
      

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setPreferredSize(new java.awt.Dimension(250, 300));
        
        label.setText("Ingresa los valores de tu filtro");
        boton_filtro.setText("Aplicar");

        
        javax.swing.GroupLayout panel_matrizLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panel_matrizLayout);
        panel_matrizLayout.setHorizontalGroup(
            panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_matrizLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label)
                    .addGroup(panel_matrizLayout.createSequentialGroup()
                        .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        panel_matrizLayout.setVerticalGroup(
            panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_matrizLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label)
                .addGap(27, 27, 27)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(m5)
                    .addComponent(m6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(boton_filtro)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        boton_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    boron_filtroActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void boron_filtroActionPerformed(ActionEvent evt) throws IOException {
                try{
                    int L1,L2,L3,L4,L5,L6,L7,L8,L9;
                    L1 = Integer.parseInt(m1.getText());
                    L2 = Integer.parseInt(m2.getText());
                    L3 = Integer.parseInt(m3.getText());
                    L4 = Integer.parseInt(m4.getText());
                    L5 = Integer.parseInt(m5.getText());
                    L6 = Integer.parseInt(m6.getText());
                    L7 = Integer.parseInt(m7.getText());
                    L8 = Integer.parseInt(m8.getText());
                    L9 = Integer.parseInt(m9.getText());
                    int[][] matriz={{L1,L2,L3},{L4,L5,L6},{L7,L8,L9}};
                    metodos.conv(filepath, matriz, "Filto personalizado", 3);
                }catch (Exception e){
                }
            }
        });
        
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
        jFrame.setResizable(false);
    }
        
        public static void interfaz_5x5(String filepath){
            JFrame jFrame = new JFrame();
            jFrame.setTitle("Matriz 5x5");

            JPanel panel_matriz = new JPanel();
            JTextField mat_1 = new javax.swing.JTextField();
            JTextField mat_2 = new javax.swing.JTextField();
            JTextField mat_3 = new javax.swing.JTextField();
            JTextField mat_4 = new javax.swing.JTextField();
            JTextField mat_5 = new javax.swing.JTextField();
            JTextField mat_6 = new javax.swing.JTextField();
            JTextField mat_7 = new javax.swing.JTextField();
            JTextField mat_8 = new javax.swing.JTextField();
            JTextField mat_9 = new javax.swing.JTextField();
            JLabel mat_label = new javax.swing.JLabel();
            JButton boton_filtro = new javax.swing.JButton();
            JTextField mat_10 = new javax.swing.JTextField();
            JTextField mat_11 = new javax.swing.JTextField();
            JTextField mat_12 = new javax.swing.JTextField();
            JTextField mat_13 = new javax.swing.JTextField();
            JTextField mat_14 = new javax.swing.JTextField();
            JTextField mat_15 = new javax.swing.JTextField();
            JTextField mat_16 = new javax.swing.JTextField();
            JTextField mat_17 = new javax.swing.JTextField();
            JTextField mat_18 = new javax.swing.JTextField();
            JTextField mat_19 = new javax.swing.JTextField();
            JTextField mat_20 = new javax.swing.JTextField();
            JTextField mat_21 = new javax.swing.JTextField();
            JTextField mat_22 = new javax.swing.JTextField();
            JTextField mat_23 = new javax.swing.JTextField();
            JTextField mat_24 = new javax.swing.JTextField();
            JTextField mat_25 = new javax.swing.JTextField();

        jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setMinimumSize(new java.awt.Dimension(300, 360));
        jFrame.setResizable(false);

        panel_matriz.setBackground(new java.awt.Color(204, 204, 204));

        mat_1.setToolTipText("");

        mat_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mat_label.setText("Ingresa los valores de tu filtro");

        boton_filtro.setText("Aplicar");

        javax.swing.GroupLayout panel_matrizLayout = new javax.swing.GroupLayout(panel_matriz);
        panel_matriz.setLayout(panel_matrizLayout);
        panel_matrizLayout.setHorizontalGroup(
            panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_matrizLayout.createSequentialGroup()
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_matrizLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_matrizLayout.createSequentialGroup()
                                        .addComponent(mat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mat_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_matrizLayout.createSequentialGroup()
                                        .addComponent(mat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_matrizLayout.createSequentialGroup()
                                        .addComponent(mat_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mat_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(mat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_matrizLayout.createSequentialGroup()
                                        .addComponent(mat_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mat_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mat_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(boton_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(mat_11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(mat_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_matrizLayout.createSequentialGroup()
                                .addComponent(mat_21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mat_25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_matrizLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(mat_label)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_matrizLayout.setVerticalGroup(
            panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_matrizLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(mat_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(boton_filtro)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        
        
        boton_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    boron_filtroActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }

            private void boron_filtroActionPerformed(ActionEvent evt) throws IOException {
                try{
                    int L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19,L20,L21,L22,L23,L24,L25;
                    L1 = Integer.parseInt(mat_1.getText());
                    L2 = Integer.parseInt(mat_2.getText());
                    L3 = Integer.parseInt(mat_3.getText());
                    L4 = Integer.parseInt(mat_4.getText());
                    L5 = Integer.parseInt(mat_5.getText());
                    L6 = Integer.parseInt(mat_6.getText());
                    L7 = Integer.parseInt(mat_7.getText());
                    L8 = Integer.parseInt(mat_8.getText());
                    L9 = Integer.parseInt(mat_9.getText());
                    L10 = Integer.parseInt(mat_10.getText());
                    L11 = Integer.parseInt(mat_11.getText());
                    L12 = Integer.parseInt(mat_12.getText());
                    L13 = Integer.parseInt(mat_13.getText());
                    L14 = Integer.parseInt(mat_14.getText());
                    L15 = Integer.parseInt(mat_15.getText());
                    L16 = Integer.parseInt(mat_16.getText());
                    L17 = Integer.parseInt(mat_17.getText());
                    L18 = Integer.parseInt(mat_18.getText());
                    L19 = Integer.parseInt(mat_19.getText());
                    L20 = Integer.parseInt(mat_20.getText());
                    L21 = Integer.parseInt(mat_21.getText());
                    L22 = Integer.parseInt(mat_22.getText());
                    L23 = Integer.parseInt(mat_23.getText());
                    L24 = Integer.parseInt(mat_24.getText());
                    L25 = Integer.parseInt(mat_25.getText());
                    int[][] matriz={{L1,L2,L3, L4,L5},{L6,L7,L8, L9,L10},
                                    {L11,L12,L13, L14,L15},{L16,L17,L18, L19,L20},
                                    {L21,L22,L23, L24,L25} };
                    
                    metodos.conv(filepath, matriz, "Filto personalizado", 5);
                }catch(Exception e){}
            }
        });
        
        jFrame.setVisible(true);
        
        }
        
        
        public static void interfaz_7x7(String filepath){
            JFrame jFrame = new JFrame();
            jFrame.setTitle("Matriz 7x7");
            JLabel mat_label = new javax.swing.JLabel();
            JButton boton_filtro = new javax.swing.JButton();
            JPanel panel_matriz = new javax.swing.JPanel();
            JTextField mat_1 = new javax.swing.JTextField();
            JTextField mat_2 = new javax.swing.JTextField();
            JTextField  mat_3 = new javax.swing.JTextField();
            JTextField mat_4 = new javax.swing.JTextField();
            JTextField mat_5 = new javax.swing.JTextField();
            JTextField mat_6 = new javax.swing.JTextField();
            JTextField mat_7 = new javax.swing.JTextField();
            JTextField mat_8 = new javax.swing.JTextField();
            JTextField mat_9 = new javax.swing.JTextField();
            JTextField mat_10 = new javax.swing.JTextField();
            JTextField mat_11 = new javax.swing.JTextField();
            JTextField mat_12 = new javax.swing.JTextField();
            JTextField mat_13 = new javax.swing.JTextField();
            JTextField mat_14 = new javax.swing.JTextField();
            JTextField mat_15 = new javax.swing.JTextField();
            JTextField mat_16 = new javax.swing.JTextField();
            JTextField mat_17 = new javax.swing.JTextField();
            JTextField mat_18 = new javax.swing.JTextField();
            JTextField mat_19 = new javax.swing.JTextField();
            JTextField mat_20 = new javax.swing.JTextField();
            JTextField mat_21 = new javax.swing.JTextField();
            JTextField mat_22 = new javax.swing.JTextField();
            JTextField mat_23 = new javax.swing.JTextField();
            JTextField mat_24 = new javax.swing.JTextField();
            JTextField mat_25 = new javax.swing.JTextField();
            JTextField mat_26 = new javax.swing.JTextField();
            JTextField mat_27 = new javax.swing.JTextField();
            JTextField mat_28 = new javax.swing.JTextField();
            JTextField mat_29 = new javax.swing.JTextField();
            JTextField mat_30 = new javax.swing.JTextField();
            JTextField mat_31 = new javax.swing.JTextField();
            JTextField mat_32 = new javax.swing.JTextField();
            JTextField mat_33 = new javax.swing.JTextField();
            JTextField mat_34 = new javax.swing.JTextField();
            JTextField mat_35 = new javax.swing.JTextField();
            JTextField mat_36 = new javax.swing.JTextField();
            JTextField mat_37 = new javax.swing.JTextField();
            JTextField mat_38 = new javax.swing.JTextField();
            JTextField mat_39 = new javax.swing.JTextField();
            JTextField mat_40 = new javax.swing.JTextField();
            JTextField mat_41 = new javax.swing.JTextField();
            JTextField mat_42 = new javax.swing.JTextField();
            JTextField mat_43 = new javax.swing.JTextField();
            JTextField mat_44 = new javax.swing.JTextField();
            JTextField mat_45 = new javax.swing.JTextField();
            JTextField mat_46 = new javax.swing.JTextField();
            JTextField mat_47 = new javax.swing.JTextField();
            JTextField mat_48 = new javax.swing.JTextField();
            JTextField mat_49 = new javax.swing.JTextField();

            jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            jFrame.setMinimumSize(new java.awt.Dimension(420, 470));
            jFrame.setResizable(false);

            panel_matriz.setBackground(new java.awt.Color(204, 204, 204));

            mat_1.setToolTipText("");

            mat_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            mat_label.setText("Ingresa los valores de tu filtro");

            boton_filtro.setText("Aplicar");

            javax.swing.GroupLayout panel_matrizLayout = new javax.swing.GroupLayout(panel_matriz);
            panel_matriz.setLayout(panel_matrizLayout);
            panel_matrizLayout.setHorizontalGroup(
                panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_matrizLayout.createSequentialGroup()
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_matrizLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(boton_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_matrizLayout.createSequentialGroup()
                                    .addComponent(mat_43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(mat_47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat_49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_matrizLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(mat_label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(35, Short.MAX_VALUE))
            );
            panel_matrizLayout.setVerticalGroup(
                panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_matrizLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(mat_label)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(panel_matrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mat_49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(boton_filtro)
                    .addContainerGap(33, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jFrame.getContentPane());
            jFrame.getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(panel_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            
            
            boton_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    boron_filtroActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }

            private void boron_filtroActionPerformed(ActionEvent evt) throws IOException {
                try{
                 
                short    L1 = (short) Integer.parseInt(mat_1.getText());
                short    L2 = (short) Integer.parseInt(mat_2.getText());
                short    L3 = (short) Integer.parseInt(mat_3.getText());
                short    L4 = (short) Integer.parseInt(mat_4.getText());
                short    L5 = (short) Integer.parseInt(mat_5.getText());
                short    L6 = (short) Integer.parseInt(mat_6.getText());
                short    L7 = (short) Integer.parseInt(mat_7.getText());
                short    L8 = (short) Integer.parseInt(mat_8.getText());
                short    L9 = (short) Integer.parseInt(mat_9.getText());
                short    L10 = (short) Integer.parseInt(mat_10.getText());
                short    L11 = (short) Integer.parseInt(mat_11.getText());
                short    L12 = (short) Integer.parseInt(mat_12.getText());
                short    L13 = (short) Integer.parseInt(mat_13.getText());
                short    L14 = (short) Integer.parseInt(mat_14.getText());
                short    L15 = (short) Integer.parseInt(mat_15.getText());
                short    L16 = (short) Integer.parseInt(mat_16.getText());
                short    L17 = (short) Integer.parseInt(mat_17.getText());
                short    L18 = (short) Integer.parseInt(mat_18.getText());
                short    L19 = (short) Integer.parseInt(mat_19.getText());
                short    L20 = (short) Integer.parseInt(mat_20.getText());
                short    L21 = (short) Integer.parseInt(mat_21.getText());
                short    L22 = (short) Integer.parseInt(mat_22.getText());
                short    L23 = (short) Integer.parseInt(mat_23.getText());
                short    L24 = (short) Integer.parseInt(mat_24.getText());
                short    L25 = (short) Integer.parseInt(mat_25.getText());
                short    L26 = (short) Integer.parseInt(mat_26.getText());
                short    L27 = (short) Integer.parseInt(mat_27.getText());
                short    L28 = (short) Integer.parseInt(mat_28.getText());
                short    L29 = (short) Integer.parseInt(mat_29.getText());
                short    L30 = (short) Integer.parseInt(mat_30.getText());
                short    L31 = (short) Integer.parseInt(mat_31.getText());
                short    L32 = (short) Integer.parseInt(mat_32.getText());
                short    L33 = (short) Integer.parseInt(mat_33.getText());
                short    L34 = (short) Integer.parseInt(mat_34.getText());
                short    L35 = (short) Integer.parseInt(mat_35.getText());
                short    L36 = (short) Integer.parseInt(mat_36.getText());
                short    L37 = (short) Integer.parseInt(mat_37.getText());
                short    L38 = (short) Integer.parseInt(mat_38.getText());
                short    L39 = (short) Integer.parseInt(mat_39.getText());
                short    L40 = (short) Integer.parseInt(mat_40.getText());
                short    L41 = (short) Integer.parseInt(mat_41.getText());
                short    L42 = (short) Integer.parseInt(mat_42.getText());
                short    L43 = (short) Integer.parseInt(mat_43.getText());
                short    L44 = (short) Integer.parseInt(mat_44.getText());
                short    L45 = (short) Integer.parseInt(mat_45.getText());
                short    L46 = (short) Integer.parseInt(mat_46.getText());
                short    L47 = (short) Integer.parseInt(mat_47.getText());
                short    L48 = (short) Integer.parseInt(mat_48.getText());
                short    L49 = (short) Integer.parseInt(mat_49.getText());
                
                int[][] matriz={{L1,L2,L3, L4,L5,L6,L7},{L8,L9,L10, L11,L12,L13,L14},
                                {L15,L16,L17, L18,L19,L20,L21},{L22,L23,L24, L25,L26,L27,L28},
                                {L29,L30,L31, L32,L33,L34,L35}, {L36,L37,L38, L39,L40,L41,L42}, 
                                {L43,L44,L45, L46,L47,L48,L49}};
                
                metodos.conv(filepath, matriz, "Filto personalizado", 7);
               
            }
            catch(Exception e){}
            }
            
        });
        
        jFrame.setVisible(true);
        
        
        
        }
}
