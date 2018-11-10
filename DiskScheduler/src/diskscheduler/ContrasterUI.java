/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskscheduler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author aleandro
 */
public class ContrasterUI extends javax.swing.JFrame {
    Controller controlador;
    CSVHandler csvHandler;
    Algorithms algorithmsResolver;
    /**
     * Creates new form ContrasterUI
     */
    public ContrasterUI() {
        controlador = Controller.getInstance(); 
        JOptionPane.showMessageDialog(null, "Process registered: " + String.valueOf(controlador.getProcesses().size()), "INFO", 1);
        csvHandler = new CSVHandler();
        algorithmsResolver = new Algorithms();
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

        panelListAlgorithms = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkbtnRSS = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkbtnPRI = new javax.swing.JCheckBox();
        chkbtnFIFO = new javax.swing.JCheckBox();
        chkbtnLIFO = new javax.swing.JCheckBox();
        chkbtnCSCAN = new javax.swing.JCheckBox();
        chkbtnSCAN = new javax.swing.JCheckBox();
        chkbtnSSTF = new javax.swing.JCheckBox();
        chkbtnFIFO2 = new javax.swing.JCheckBox();
        chkbtnFSCAN = new javax.swing.JCheckBox();
        chkbtnNSTEPSCAN = new javax.swing.JCheckBox();
        btnShowContrastPlot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelListAlgorithms.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Select the algorithms you want to contrast");

        chkbtnRSS.setText("RSS");
        chkbtnRSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnRSSActionPerformed(evt);
            }
        });

        jLabel2.setText("Based on the requesting Process");

        jLabel3.setText("Based on the requested ");

        chkbtnPRI.setText("PRI");
        chkbtnPRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnPRIActionPerformed(evt);
            }
        });

        chkbtnFIFO.setText("FIFO");
        chkbtnFIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnFIFOActionPerformed(evt);
            }
        });

        chkbtnLIFO.setText("LIFO");
        chkbtnLIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnLIFOActionPerformed(evt);
            }
        });

        chkbtnCSCAN.setText("C-SCAN");
        chkbtnCSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnCSCANActionPerformed(evt);
            }
        });

        chkbtnSCAN.setText("SCAN");
        chkbtnSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnSCANActionPerformed(evt);
            }
        });

        chkbtnSSTF.setText("SSTF");
        chkbtnSSTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnSSTFActionPerformed(evt);
            }
        });

        chkbtnFIFO2.setText("FIFO");
        chkbtnFIFO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnFIFO2ActionPerformed(evt);
            }
        });

        chkbtnFSCAN.setText("FSCAN");
        chkbtnFSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnFSCANActionPerformed(evt);
            }
        });

        chkbtnNSTEPSCAN.setText("N-Step Scan");
        chkbtnNSTEPSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbtnNSTEPSCANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListAlgorithmsLayout = new javax.swing.GroupLayout(panelListAlgorithms);
        panelListAlgorithms.setLayout(panelListAlgorithmsLayout);
        panelListAlgorithmsLayout.setHorizontalGroup(
            panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                .addGroup(panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbtnPRI)
                                    .addComponent(chkbtnRSS)
                                    .addComponent(chkbtnFIFO)
                                    .addComponent(chkbtnLIFO)))
                            .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbtnSSTF)
                                    .addComponent(chkbtnFIFO2)
                                    .addComponent(chkbtnSCAN)
                                    .addComponent(chkbtnCSCAN)
                                    .addComponent(chkbtnFSCAN)
                                    .addComponent(chkbtnNSTEPSCAN)))))
                    .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelListAlgorithmsLayout.setVerticalGroup(
            panelListAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAlgorithmsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(chkbtnRSS)
                .addGap(18, 18, 18)
                .addComponent(chkbtnPRI)
                .addGap(18, 18, 18)
                .addComponent(chkbtnFIFO)
                .addGap(18, 18, 18)
                .addComponent(chkbtnLIFO)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(chkbtnFIFO2)
                .addGap(18, 18, 18)
                .addComponent(chkbtnSSTF)
                .addGap(18, 18, 18)
                .addComponent(chkbtnSCAN)
                .addGap(18, 18, 18)
                .addComponent(chkbtnCSCAN)
                .addGap(18, 18, 18)
                .addComponent(chkbtnNSTEPSCAN)
                .addGap(18, 18, 18)
                .addComponent(chkbtnFSCAN)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnShowContrastPlot.setText("Show");
        btnShowContrastPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowContrastPlotActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Algorithm", "Total Distance", "Average Distance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelListAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowContrastPlot)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(btnShowContrastPlot))
                    .addComponent(panelListAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkbtnRSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnRSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnRSSActionPerformed

    private void chkbtnPRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnPRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnPRIActionPerformed

    private void chkbtnFIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnFIFOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnFIFOActionPerformed

    private void chkbtnLIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnLIFOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnLIFOActionPerformed

    private void chkbtnCSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnCSCANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnCSCANActionPerformed

    private void chkbtnSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnSCANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnSCANActionPerformed

    private void chkbtnSSTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnSSTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnSSTFActionPerformed

    private void chkbtnFIFO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnFIFO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnFIFO2ActionPerformed

    private void chkbtnFSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnFSCANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnFSCANActionPerformed

    private void chkbtnNSTEPSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbtnNSTEPSCANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbtnNSTEPSCANActionPerformed

    private void btnShowContrastPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowContrastPlotActionPerformed
        
        try {
            // TODO add your handling code here:
            if(chkbtnRSS.isSelected()){
                csvHandler.createCSV(algorithmsResolver.algorithmRSS(Controller.PETITIONS), controlador.getConfiguration().getInitialPosition(), "RSS");
            }
            
            csvHandler.createCSV(algorithmsResolver.getSequenceByFIFO2(Controller.PETITIONS), controlador.getConfiguration().getInitialPosition(), "FIFO2");
            
            
            //csvHandler.generatePlot();
            
        } catch (IOException ex) {
            Logger.getLogger(ContrasterUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ContrasterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnShowContrastPlotActionPerformed

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
            java.util.logging.Logger.getLogger(ContrasterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContrasterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContrasterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContrasterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContrasterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowContrastPlot;
    private javax.swing.JCheckBox chkbtnCSCAN;
    private javax.swing.JCheckBox chkbtnFIFO;
    private javax.swing.JCheckBox chkbtnFIFO2;
    private javax.swing.JCheckBox chkbtnFSCAN;
    private javax.swing.JCheckBox chkbtnLIFO;
    private javax.swing.JCheckBox chkbtnNSTEPSCAN;
    private javax.swing.JCheckBox chkbtnPRI;
    private javax.swing.JCheckBox chkbtnRSS;
    private javax.swing.JCheckBox chkbtnSCAN;
    private javax.swing.JCheckBox chkbtnSSTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelListAlgorithms;
    // End of variables declaration//GEN-END:variables
}
