/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MovieDescriptionController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Movie;
import model.MoviesCart;

/**
 *
 * @author alych
 */
public class MovieDescription extends javax.swing.JFrame {
    
    private final MovieDescriptionController controller;
    private ArrayList<Movie> movieDescription = new ArrayList<>();
    private ArrayList<MoviesCart> moviesCart = new ArrayList<>();
    int session;
    /**
     * Creates new form MovieDescription
     */

    /**
     * Creates new form MovieDescription
     * @param moviesDescriotion
     */
    public MovieDescription(int session, ArrayList<Movie> moviesDescription) {
        this.session = session;
        initComponents();
        controller = new MovieDescriptionController(this);
        this.movieDescription = moviesDescription;
        imageMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/"+ movieDescription.get(0).getIdMovie() +".jpg")));
        titleMovie.setText(moviesDescription.get(0).getTitle());
        subTitle.setText(moviesDescription.get(0).getSubTitle());
        category.setText("ACTION");
        duration.setText("110");
        descriptionMovie.setText(moviesDescription.get(0).getDescription());
        
    }

    private MovieDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        titleMovie = new javax.swing.JLabel();
        imageMovie = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionMovie = new javax.swing.JTextArea();
        duration = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        rentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setMaximumSize(new java.awt.Dimension(1200, 800));
        background.setMinimumSize(new java.awt.Dimension(1200, 800));
        background.setPreferredSize(new java.awt.Dimension(1200, 800));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_400.jpg"))); // NOI18N

        panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.setPreferredSize(new java.awt.Dimension(1100, 650));

        titleMovie.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        titleMovie.setText("title");
        titleMovie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titleMovie.setMaximumSize(new java.awt.Dimension(510, 30));
        titleMovie.setMinimumSize(new java.awt.Dimension(510, 30));
        titleMovie.setName(""); // NOI18N
        titleMovie.setPreferredSize(new java.awt.Dimension(510, 30));

        imageMovie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageMovie.setPreferredSize(new java.awt.Dimension(170, 255));

        subTitle.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        subTitle.setText("subTitle");
        subTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        subTitle.setMaximumSize(new java.awt.Dimension(510, 20));
        subTitle.setMinimumSize(new java.awt.Dimension(510, 20));
        subTitle.setPreferredSize(new java.awt.Dimension(510, 20));

        descriptionLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        descriptionLabel.setText("Description");

        descriptionMovie.setEditable(false);
        descriptionMovie.setColumns(10);
        descriptionMovie.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        descriptionMovie.setLineWrap(true);
        descriptionMovie.setRows(15);
        descriptionMovie.setText("asdSFsfSASDSAAASAS");
        descriptionMovie.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionMovie);

        duration.setText("Duration");

        category.setText("Category");

        separator.setText("/");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(imageMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(descriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(category)
                                .addGap(83, 83, 83)
                                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(duration)
                                .addGap(13, 13, 13))
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration)
                            .addComponent(category)
                            .addComponent(separator))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        rentButton.setText("RENT");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
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
                        .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jScrollPane2.setViewportView(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        // TODO add your handling code here:
        try {
            controller.addCart(session, movieDescription.get(0).getIdMovie());
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You can not add more than 4 movies"
                        + "\nFor add more please exclud one of the movies in the Cart");
        }
        
        
    }//GEN-LAST:event_rentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        controller.backMain(session);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MovieDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieDescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JLabel category;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionMovie;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel imageMovie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JButton rentButton;
    private javax.swing.JLabel separator;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel titleMovie;
    // End of variables declaration//GEN-END:variables
}
