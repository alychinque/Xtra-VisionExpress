
package view;

import controller.HomeController;
import java.awt.Cursor;

/**
 *
 * @author Alysson Chinque
 */
public class Home extends javax.swing.JFrame {
    // 
    
    private final HomeController controller;

    /**
     * Constructor of the class creating a new controller and set cursor 
     */
    public Home() {
        initComponents();
        controller = new HomeController(this);
        rentLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        returnLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        messageLabel5 = new javax.swing.JLabel();
        messageLabel2 = new javax.swing.JLabel();
        messageLabel1 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        rentPanel = new javax.swing.JPanel();
        rentLabel = new javax.swing.JLabel();
        retutnPanel = new javax.swing.JPanel();
        returnLabel = new javax.swing.JLabel();
        messageLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 800));

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setPreferredSize(new java.awt.Dimension(1200, 800));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_700.jpg"))); // NOI18N

        messageLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        messageLabel5.setForeground(new java.awt.Color(255, 255, 0));
        messageLabel5.setText("Your first rental is free");

        messageLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        messageLabel2.setForeground(new java.awt.Color(255, 255, 0));
        messageLabel2.setText("Use coupon code: FREEMOVIE");

        messageLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        messageLabel1.setForeground(new java.awt.Color(255, 255, 0));
        messageLabel1.setText("NO Xtra-vision membership or signup is required!");

        messageLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 0));
        messageLabel.setText("Credit and Debit Cards accepted");

        rentPanel.setBackground(new java.awt.Color(238, 27, 46));
        rentPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 10, true));
        rentPanel.setForeground(new java.awt.Color(255, 255, 255));
        rentPanel.setMaximumSize(new java.awt.Dimension(390, 200));
        rentPanel.setMinimumSize(new java.awt.Dimension(390, 200));

        rentLabel.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        rentLabel.setForeground(new java.awt.Color(255, 255, 0));
        rentLabel.setText("<html>\nCLICK<br>\nTO RENT\n<html>");
        rentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rentPanelLayout = new javax.swing.GroupLayout(rentPanel);
        rentPanel.setLayout(rentPanelLayout);
        rentPanelLayout.setHorizontalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addComponent(rentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rentPanelLayout.setVerticalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addComponent(rentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        retutnPanel.setBackground(new java.awt.Color(238, 27, 46));
        retutnPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 10, true));
        retutnPanel.setForeground(new java.awt.Color(255, 255, 255));
        retutnPanel.setMaximumSize(new java.awt.Dimension(390, 200));
        retutnPanel.setMinimumSize(new java.awt.Dimension(390, 200));

        returnLabel.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(255, 255, 0));
        returnLabel.setText("<html> CLICK<br> TO RETURN <html>");
        returnLabel.setAlignmentX(0.5F);
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout retutnPanelLayout = new javax.swing.GroupLayout(retutnPanel);
        retutnPanel.setLayout(retutnPanelLayout);
        retutnPanelLayout.setHorizontalGroup(
            retutnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        retutnPanelLayout.setVerticalGroup(
            retutnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retutnPanelLayout.createSequentialGroup()
                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        messageLabel3.setFont(new java.awt.Font("Arial Black", 0, 90)); // NOI18N
        messageLabel3.setForeground(new java.awt.Color(255, 255, 0));
        messageLabel3.setText("Free");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(messageLabel3)
                        .addGap(61, 61, 61)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLabel5)
                            .addComponent(messageLabel2)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(messageLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(messageLabel1)
                        .addGap(108, 108, 108))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(rentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retutnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(250, 250, 250))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(messageLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(messageLabel2))
                    .addComponent(messageLabel3))
                .addGap(50, 50, 50)
                .addComponent(messageLabel1)
                .addGap(38, 38, 38)
                .addComponent(messageLabel)
                .addGap(39, 39, 39)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retutnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(background);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**  
     * This method will call goMain once the mouse is clicked 
     */
    private void rentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentLabelMouseClicked
        // TODO add your handling code here:
        this.controller.goMain();
    }//GEN-LAST:event_rentLabelMouseClicked
    /**  
     * This method will call goReturn once the mouse is clicked 
     */
    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        // TODO add your handling code here:
        this.controller.goReturn();
    }//GEN-LAST:event_returnLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel messageLabel1;
    private javax.swing.JLabel messageLabel2;
    private javax.swing.JLabel messageLabel3;
    private javax.swing.JLabel messageLabel5;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JPanel rentPanel;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JPanel retutnPanel;
    // End of variables declaration//GEN-END:variables
}
