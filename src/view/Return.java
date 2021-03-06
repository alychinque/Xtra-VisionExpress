/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ReturnController;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 * @author Alysson Chinque 
 * @author Maicon
 * 
 */
public class Return extends javax.swing.JFrame {

    private final ReturnController controller;
    private ArrayList<String> moviesTitle = new ArrayList<>();
    private ArrayList<Integer> rentNumber =  new ArrayList<>();
    private String[] moviesRented;
    private String[] rentNum;

    /**
     * Constructor of the class initiating the components, get movie`s title
     * and set JComboBox
     */
    public Return() {
        initComponents();
        controller = new ReturnController(this);
        moviesTitle = controller.getMoviesRented();
        setJComboBoxes();
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
        movieLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        retutnPanel = new javax.swing.JPanel();
        returnLabel = new javax.swing.JLabel();
        movieComboBox = new javax.swing.JComboBox();
        numberComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 750));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 750));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 750));

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setMaximumSize(new java.awt.Dimension(1200, 800));
        background.setMinimumSize(new java.awt.Dimension(1200, 800));
        background.setPreferredSize(new java.awt.Dimension(1200, 800));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_700.jpg"))); // NOI18N

        movieLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        movieLabel.setForeground(new java.awt.Color(255, 255, 0));
        movieLabel.setText("Choose the Movie ");

        numberLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(255, 255, 0));
        numberLabel.setText("Choose the Rent Number");

        retutnPanel.setBackground(new java.awt.Color(238, 27, 46));
        retutnPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 10, true));
        retutnPanel.setForeground(new java.awt.Color(255, 255, 255));
        retutnPanel.setMaximumSize(new java.awt.Dimension(390, 200));
        retutnPanel.setMinimumSize(new java.awt.Dimension(390, 200));

        returnLabel.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(255, 255, 0));
        returnLabel.setText("RETURN");
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
            .addGroup(retutnPanelLayout.createSequentialGroup()
                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        retutnPanelLayout.setVerticalGroup(
            retutnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retutnPanelLayout.createSequentialGroup()
                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        movieComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        numberComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(250, 250, 250))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(movieLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(numberLabel)
                .addGap(45, 45, 45))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(retutnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberLabel)
                            .addComponent(movieLabel)))
                    .addComponent(logo))
                .addGap(40, 40, 40)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retutnPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
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

    /**
     * This method calls back to the home screen.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         controller.backHome();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * This method checks if the movie and the rent number matches.
     */
    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
         controller.checkReturn();
    }//GEN-LAST:event_returnLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox movieComboBox;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JComboBox numberComboBox;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JPanel retutnPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * This method is setting the JComboBox. 
     */
    private void setJComboBoxes() {
        convertArray(moviesTitle);
        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel(moviesRented));
        rentNumber = controller.getRentNumbers();
        
        convertRentNumber(rentNumber);
        numberComboBox.setModel(new DefaultComboBoxModel(rentNum));
        returnLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        movieComboBox.addActionListener(controller);
        movieComboBox.setActionCommand("movie");
        
        numberComboBox.addActionListener(controller);
        numberComboBox.setActionCommand("rentNumber");
    }
    
    /**
     * This method converts array list into an array.
     */
    private void convertArray(ArrayList<String> moviesTitle) {
        moviesRented = new String[moviesTitle.size()];
        for (int i = 0; i < moviesTitle.size(); i++) {
            moviesRented[i] = moviesTitle.get(i);
        }
    }

    /**
     * This method converts array list into an array.
     */
    private void convertRentNumber(ArrayList<Integer> rentNumber) {
        rentNum = new String[rentNumber.size()];
        for (int i = 0; i < rentNumber.size(); i++) {
            rentNum[i] = Integer.toString(rentNumber.get(i));
        }
    }

}
