/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskscheduler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import diskscheduler.Algorithms;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FranM
 */
public class Interface extends javax.swing.JFrame {
    Controller controller;
    Algorithms sort;
    static ArrayList<Requirements> PETITIONS = new ArrayList<Requirements>();
    /**
     * Creates new form Interfaz
     */
    public Interface() {
        controller = Controller.getInstance();
        sort = new Algorithms();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoadFile = new javax.swing.JButton();
        btnFIFO = new javax.swing.JButton();
        btnConfiguration = new javax.swing.JButton();
        btnLIFO = new javax.swing.JButton();
        btnPRI = new javax.swing.JButton();
        btnRSS = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoadFile.setText("Load File");
        btnLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFileActionPerformed(evt);
            }
        });

        btnFIFO.setText("FIFO");
        btnFIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIFOActionPerformed(evt);
            }
        });

        btnConfiguration.setText("Configuration");
        btnConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurationActionPerformed(evt);
            }
        });

        btnLIFO.setText("LIFO");
        btnLIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIFOActionPerformed(evt);
            }
        });

        btnPRI.setText("PRI");
        btnPRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIActionPerformed(evt);
            }
        });

        btnRSS.setText("RSS");
        btnRSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRSSActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(btnLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFIFO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLIFO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPRI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRSS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfiguration)
                    .addComponent(btnLoadFile)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnFIFO)
                .addGap(18, 18, 18)
                .addComponent(btnLIFO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPRI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRSS)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFileActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String file = chooser.getSelectedFile().getPath();
                String line;
                String[] arrOfStr = null;
                FileReader f = new FileReader(file);
                BufferedReader buffer = new BufferedReader(f);
                while((line = buffer.readLine()) != null){                    
                    arrOfStr = line.split(":");
                    Requirements requirement = new Requirements(arrOfStr[0], Integer.parseInt(arrOfStr[1]));
                    PETITIONS.add(requirement);
                }
            }
            System.out.println("Archivo .txt cargado correctamente");
        } catch (Exception e) {
            System.out.println("Error: no se pudo cargar el archivo");
        }
    }//GEN-LAST:event_btnLoadFileActionPerformed

    private void btnFIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIFOActionPerformed
        ArrayList<Requirements> listFIFO = new ArrayList<>(PETITIONS);
        System.out.println(sort.algorithmFIFO(listFIFO).toString()); //Retorna un ArrayList ordenado
        // Llamar graficador con el ArrayList que se devuelve con el sort
    }//GEN-LAST:event_btnFIFOActionPerformed

    private void BatchAddProcess(String processName,Integer priority, Integer timestamp) {                                              
        if(!(processName == null)){                
                Process nuevoProceso  = new Process(processName, priority, timestamp);  
                controller.addProcess(nuevoProceso);
        }else{
            JOptionPane.showMessageDialog(null,  "Process ID can't be empty", "Null PID Error", 0);
        }
    }
    
    private void btnConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurationActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                Integer lineCounter = 1;
                ArrayList<String> config = new ArrayList<String>();
                String file = chooser.getSelectedFile().getPath();
                String line;
                FileReader f = new FileReader(file);
                BufferedReader buffer = new BufferedReader(f);
                
                while((line = buffer.readLine()) != null){
                    //Las primeras 2 lineas del txt son de configuracion
                    if(lineCounter <= 2){
                        config.add(line);
                        lineCounter++;
                    }
                    else
                        break;
                }
                    
                String[] arrOfStr = null;
                arrOfStr = config.get(0).split(":");
                Integer totalTracks = Integer.parseInt(arrOfStr[1]);
                arrOfStr = config.get(1).split(":");
                Integer initialPoint = Integer.parseInt(arrOfStr[1]);
                JOptionPane.showMessageDialog(null, "Total Tracks: " + totalTracks + "\n Initial Point: " + initialPoint, "Configuration", 1);
                
                controller.setConfiguration(totalTracks, initialPoint);
                
                while((line = buffer.readLine()) != null){
                    //Las primeras 2 lineas del txt son de configuracion
                    if(lineCounter > 2){
                        if(line.contains("CreateProcess")){
                            arrOfStr = line.split(":",4);
                            BatchAddProcess(arrOfStr[1],Integer.parseInt(arrOfStr[2]),Integer.parseInt(arrOfStr[3]));
                            System.out.println("Process created: " + arrOfStr[1]);
                        }
                    }
                    else
                        break;
                }                
            }
            System.out.println("Archivo .txt cargado correctamente");
        } catch (Exception e) {
            System.out.println("Error: no se pudo cargar el archivo");
        }
    }//GEN-LAST:event_btnConfigurationActionPerformed

    private void btnLIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIFOActionPerformed
        ArrayList<Requirements> listLIFO = new ArrayList<>(PETITIONS);
        System.out.println(sort.algorithmLIFO(listLIFO).toString()); //Retorna un ArrayList ordenado
        // Llamar graficador con el ArrayList que se devuelve con el sort
    }//GEN-LAST:event_btnLIFOActionPerformed

    private void btnPRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIActionPerformed
        ArrayList<Requirements> listPRI = new ArrayList<>(PETITIONS);
        System.out.println(sort.algorithmPRI(listPRI).toString()); //Retorna un ArrayList ordenado
        // Llamar graficador con el ArrayList que se devuelve con el sort
    }//GEN-LAST:event_btnPRIActionPerformed

    private void btnRSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSSActionPerformed
        ArrayList<Requirements> listRSS = new ArrayList<>(PETITIONS);
        System.out.println(sort.algorithmRSS(listRSS).toString()); //Retorna un ArrayList ordenado
        // Llamar graficador con el ArrayList que se devuelve con el sort
    }//GEN-LAST:event_btnRSSActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Controller.getInstance().resetSystem();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguration;
    private javax.swing.JButton btnContrast;
    private javax.swing.JButton btnFIFO;
    private javax.swing.JButton btnLIFO;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnPRI;
    private javax.swing.JButton btnRSS;
    private javax.swing.JButton btnReset;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
