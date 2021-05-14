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

    public int getSession() {
        return session;
    }
    private int sizeArray;
    private boolean codeValid;

    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
    }

    public Checkout(int session, int sizeArray) {
        this.session = session;
        controller = new CheckoutController(this);
        initComponents();
        totalValue(sizeArray);
        this.sizeArray = sizeArray;
        Integer[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        monthBox.setModel(new javax.swing.DefaultComboBoxModel(months));
        monthBox.addActionListener(controller);
        monthBox.setSelectedItem(0);
        monthBox.setActionCommand("month");
        
        Integer[] years = {2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};
        yearBox.setModel(new javax.swing.DefaultComboBoxModel(years));
        yearBox.addActionListener(controller);
        yearBox.setSelectedItem(0);
        yearBox.setActionCommand("year");
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
        panel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        cardDetails = new javax.swing.JLabel();
        cardNameLabel = new javax.swing.JLabel();
        inputCardName = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        inputCardNumber = new javax.swing.JTextField();
        validLabel = new javax.swing.JLabel();
        cvcLabel = new javax.swing.JLabel();
        inputCVC = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        inputCode = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        checkCode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox();
        yearBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        responseCode = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        priceTotal = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 800));

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setMaximumSize(new java.awt.Dimension(1200, 800));
        background.setMinimumSize(new java.awt.Dimension(1200, 800));
        background.setPreferredSize(new java.awt.Dimension(1200, 800));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_400.jpg"))); // NOI18N

        panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.setPreferredSize(new java.awt.Dimension(1100, 650));

        Label.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Label.setText("IF YOU WANT TO RECEIVE YOUR INVOICE ADD AN EMAIL BELOW");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailLabel.setText("EMAIL");

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        inputEmail.setPreferredSize(new java.awt.Dimension(700, 35));
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        cardDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cardDetails.setText("CARD DETAILS");

        cardNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardNameLabel.setText("NAME IN THE CARD");

        inputCardName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        inputCardName.setPreferredSize(new java.awt.Dimension(700, 35));
        inputCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCardNameActionPerformed(evt);
            }
        });

        cardNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardNumberLabel.setText("CARD NUMBER");

        inputCardNumber.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        inputCardNumber.setPreferredSize(new java.awt.Dimension(700, 30));

        validLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        validLabel.setText("VALID THRU");

        cvcLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cvcLabel.setText("CVC");

        inputCVC.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        inputCVC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCVC.setPreferredSize(new java.awt.Dimension(700, 30));

        codeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codeLabel.setText("COUPON CODE:");

        inputCode.setPreferredSize(new java.awt.Dimension(700, 30));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 0, 0));
        priceLabel.setText("YOU WILL BE CHARGED: €");

        checkCode.setText("Ckeck code");
        checkCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCodeActionPerformed(evt);
            }
        });

        jLabel1.setText("*Add the 16 numbers of the card ");

        jLabel2.setText("Month/Year: MM/YY");

        jLabel3.setText("* Code - XXX");

        monthBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        yearBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("/");

        responseCode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        responseCode.setPreferredSize(new java.awt.Dimension(200, 40));

        priceTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceTotal.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNameLabel)
                            .addComponent(cardDetails)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(cardNumberLabel)
                                        .addGap(205, 205, 205)
                                        .addComponent(validLabel))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(42, 42, 42)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel2))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(111, 111, 111)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cvcLabel)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(codeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(responseCode, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(inputCode, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(cardDetails)
                .addGap(18, 18, 18)
                .addComponent(cardNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberLabel)
                    .addComponent(validLabel)
                    .addComponent(cvcLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codeLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(priceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(responseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
                .addGap(7, 7, 7)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jScrollPane1.setViewportView(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        controller.payMovie(session);
    }//GEN-LAST:event_payButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        controller.backCart(session);
    }//GEN-LAST:event_backButtonActionPerformed

    private void inputCardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCardNameActionPerformed

    private void checkCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCodeActionPerformed
        // TODO add your handling code here:
        boolean promoCode = controller.checkPromoCode();
        setResponseCode(promoCode);
    }//GEN-LAST:event_checkCodeActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearBoxActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

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
    private javax.swing.JLabel cardNameLabel;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JButton checkCode;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField inputCVC;
    private javax.swing.JTextField inputCardName;
    private javax.swing.JTextField inputCardNumber;
    private javax.swing.JTextField inputCode;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JPanel panel;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceTotal;
    private javax.swing.JLabel responseCode;
    private javax.swing.JLabel validLabel;
    private javax.swing.JComboBox yearBox;
    // End of variables declaration//GEN-END:variables

    private void totalValue(int sizeArray) {
        priceTotal = new JLabel();
        priceTotal.setFont(new java.awt.Font("Tahoma", 0, 14));
        priceTotal.setForeground(new java.awt.Color(255, 0, 0));
        priceTotal.setBounds(800, 500, 40, 20);
        switch (sizeArray) {
            case 1:
                priceTotal.setText("2.99");
                break;
            case 2:
                priceTotal.setText("5.98");
                break;
            case 3:
                priceTotal.setText("8.97");
                break;
            case 4:
                priceTotal.setText("11.96");
                break;
        }
        panel.add(priceTotal);
    }

    public int getSizeArray() {
        return sizeArray;
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

    public JTextField getInputCardName() {
        return inputCardName;
    }

    public void setResponseCode(boolean responseCode) {
        if(responseCode){
            this.responseCode.setText(" *-* VALID CODE *-* ");
            this.responseCode.setFont(new java.awt.Font("Tahoma", 0, 20));
            this.responseCode.setForeground(new java.awt.Color(0, 200, 0));
        }else{
            this.responseCode.setText(" *-* INVALID CODE *-* ");
            this.responseCode.setFont(new java.awt.Font("Tahoma", 0, 20));
            this.responseCode.setForeground(new java.awt.Color(255, 0, 0));
        }
        
    }
}
