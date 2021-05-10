/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CheckoutController;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alysson Chinque
 */
public class Checkout extends javax.swing.JFrame {

    private CheckoutController controller;
    private int session;
    private int sizeArray;

    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
    }

    public Checkout(int session, int sizeArray) {
        controller = new CheckoutController(this);
        initComponents();
        totalValue(sizeArray);
        this.session = session;
        this.sizeArray = sizeArray;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        cardDetails = new javax.swing.JLabel();
        nameCardLabel = new javax.swing.JLabel();
        inputNameCard = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        inputCardNumber = new javax.swing.JTextField();
        validLabel = new javax.swing.JLabel();
        inputValid = new javax.swing.JTextField();
        cvcLabel = new javax.swing.JLabel();
        inputCVC = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        inputCode = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        checkCode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        responseCode = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setMaximumSize(new java.awt.Dimension(1200, 800));
        background.setMinimumSize(new java.awt.Dimension(1200, 800));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_400.jpg"))); // NOI18N

        panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.setPreferredSize(new java.awt.Dimension(1100, 650));

        Label.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Label.setText("IF YOU WANT TO RECEIVE YOUR INVOICE ADD AN EMAIL BELOW");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailLabel.setText("EMAIL");

        inputEmail.setPreferredSize(new java.awt.Dimension(700, 30));

        cardDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cardDetails.setText("CARD DETAILS");

        nameCardLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameCardLabel.setText("NAME IN THE CARD");

        inputNameCard.setPreferredSize(new java.awt.Dimension(700, 30));
        inputNameCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameCardActionPerformed(evt);
            }
        });

        cardNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardNumberLabel.setText("CARD NUMBER");

        inputCardNumber.setPreferredSize(new java.awt.Dimension(700, 30));

        validLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        validLabel.setText("VALID THRU");

        inputValid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValid.setPreferredSize(new java.awt.Dimension(700, 30));

        cvcLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cvcLabel.setText("CVC");

        inputCVC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCVC.setPreferredSize(new java.awt.Dimension(700, 30));

        codeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codeLabel.setText("COUPON CODE:");

        inputCode.setPreferredSize(new java.awt.Dimension(700, 30));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 0, 0));
        priceLabel.setText("YOU WILL BE CHARGED: €");

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 0, 0));
        price.setMaximumSize(new java.awt.Dimension(40, 20));
        price.setMinimumSize(new java.awt.Dimension(40, 20));
        price.setPreferredSize(new java.awt.Dimension(50, 20));

        checkCode.setText("Ckeck code");
        checkCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCodeActionPerformed(evt);
            }
        });

        jLabel1.setText("*Add the 16 numbers of the card ");

        jLabel2.setText("Month/Year: MM/YY");

        jLabel3.setText("* Code - XXX");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputNameCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(inputValid, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(31, 31, 31)))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(inputCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(validLabel)
                            .addGap(59, 59, 59)
                            .addComponent(cvcLabel))))
                .addGap(36, 36, 36)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameCardLabel)
                                .addComponent(cardNumberLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cardDetails, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(codeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(responseCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputCode, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priceLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(emailLabel)
                    .addContainerGap(878, Short.MAX_VALUE)))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardDetails)
                .addGap(37, 37, 37)
                .addComponent(nameCardLabel)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputNameCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberLabel)
                    .addComponent(validLabel)
                    .addComponent(cvcLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(inputCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addGap(10, 10, 10)
                .addComponent(responseCode, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(emailLabel)
                    .addContainerGap(426, Short.MAX_VALUE)))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );

        payButton.setText("PAY");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(logo))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        controller.backCart(session);
    }//GEN-LAST:event_backButtonActionPerformed

    private void inputNameCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameCardActionPerformed

    private void checkCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCodeActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JLabel cardDetails;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JButton checkCode;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField inputCVC;
    private javax.swing.JTextField inputCardNumber;
    private javax.swing.JTextField inputCode;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNameCard;
    private javax.swing.JTextField inputValid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameCardLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel responseCode;
    private javax.swing.JLabel validLabel;
    // End of variables declaration//GEN-END:variables

    private void totalValue(int sizeArray) {
        price = new JLabel();
        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 0, 0));
        price.setBounds(800, 500, 40, 20);
        switch (sizeArray) {
            case 1:
                price.setText("2.99");
                break;
            case 2:
                price.setText("5.98");
                break;
            case 3:
                price.setText("8.97");
                break;
            case 4:
                price.setText("11.96");
                break;
        }
        panel.add(price);
    }

    public JTextField getInputCVC() {
        return inputCVC;
    }

    public JTextField getInputCardNumber() {
        return inputCardNumber;
    }

    public JTextField getInputCode() {
        return inputCode;
    }

    public JTextField getInputEmail() {
        return inputEmail;
    }

    public JTextField getInputNameCard() {
        return inputNameCard;
    }

    public JTextField getInputValid() {
        return inputValid;
    }
}
