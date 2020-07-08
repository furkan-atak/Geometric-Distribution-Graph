/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometric_Distribution;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Geometric_Distr_Graph extends javax.swing.JFrame {

    DefaultComboBoxModel comboBox = new DefaultComboBoxModel();

    public Geometric_Distr_Graph() {
        initComponents();
        warn_label.setVisible(false);
        comboBox.addElement("Functions:");
        comboBox.addElement("P(X=x)");
        comboBox.addElement("P(X<x)");
        comboBox.addElement("P(X>x)");
        cdf_Combo.setModel(comboBox);
        this.setLocationRelativeTo(null);
        setTitle("Geometric Distribution Graph");
        panel.setLayout(new java.awt.BorderLayout());
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        double p = Double.parseDouble(probability_txt.getText());
        double n = Double.parseDouble(nth_txt.getText());
        double q = 1 - p;
        double eX, varX, stdX = 0;
        eX = 1 / p;
        varX = (q) / Math.pow(p, 2);
        stdX = Math.sqrt(varX);
        ex_txt.setText(String.valueOf(eX));
        var_txt.setText(String.valueOf(varX));
        std_txt.setText(String.valueOf(stdX));
        String greaterCdf, lessCdf;
        greaterCdf = "P(X>x)";
        lessCdf = "P(X<x)";

        if (comboBox.getSelectedItem().equals(lessCdf)) {
            for (double t = 0; t <= n; t++) {
                dataset.addValue(1 - Math.pow(q, t + 1), "Lower CDF", String.valueOf(t+1));
            }

        } else if (comboBox.getSelectedItem().equals(greaterCdf)) {
          // dataset.addValue(1, "Probability", String.valueOf(0)); 
            for (double t = 1; t <= n; t++) {
                dataset.addValue(Math.pow(q, t), "Upper CDF", String.valueOf(t));
            }

        } else {
            for (int t = 1; t <= n; t++) {
                dataset.addValue(Math.pow(q, t - 1) * p, "PDF", String.valueOf(t));
            }

        }
        return dataset;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nth_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        probability_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cdf_Combo = new javax.swing.JComboBox<>();
        warn_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ex_txt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        var_txt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        std_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("(N) In which try");

        nth_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nth_txtActionPerformed(evt);
            }
        });

        jLabel3.setText("(P):Probability Of Success");

        jButton1.setText("Show The Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("0≤p≤1");

        cdf_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cdf_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdf_ComboActionPerformed(evt);
            }
        });

        warn_label.setText("jLabel1");

        jLabel1.setText("μ : Expectation");

        jLabel5.setText("σ2 : Variance");

        jLabel6.setText("σ : Standart Deviation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(probability_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(ex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(var_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nth_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cdf_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(206, 206, 206))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(std_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(warn_label))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(warn_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nth_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(probability_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdf_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(std_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(ex_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(var_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nth_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nth_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nth_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (comboBox.getSelectedItem().equals("Functions:")) {
            warn_label.setText("Please Choose A Function Type!!!");    
            warn_label.setVisible(true);
        } else {
            String headTitle = "Geometric Distribution Graph";
            warn_label.setVisible(false);
            if (comboBox.getSelectedItem().equals("P(X=x)")) {
                headTitle += " (PDF)";
            } else if (comboBox.getSelectedItem().equals("P(X<x)")) {
                headTitle += " Lower (CDF)";

            } else {
                headTitle += " Upper (CDF)";
            }
            String xTitle = "Trials needed to get for the first success";
            String yTitle = "Probability";
            JFreeChart barChart = ChartFactory.createBarChart(headTitle, xTitle, yTitle, createDataset());

            CategoryPlot plot = (CategoryPlot) barChart.getPlot();
            plot.getRenderer().setSeriesPaint(0, Color.CYAN);

            ChartPanel chartPanel = new ChartPanel(barChart);
            panel.removeAll();
            panel.add(chartPanel, BorderLayout.CENTER);
            panel.validate();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cdf_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdf_ComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cdf_ComboActionPerformed

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
            java.util.logging.Logger.getLogger(Geometric_Distr_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Geometric_Distr_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Geometric_Distr_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Geometric_Distr_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Geometric_Distr_Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cdf_Combo;
    private javax.swing.JLabel ex_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nth_txt;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField probability_txt;
    private javax.swing.JLabel std_txt;
    private javax.swing.JLabel var_txt;
    private javax.swing.JLabel warn_label;
    // End of variables declaration//GEN-END:variables
}
