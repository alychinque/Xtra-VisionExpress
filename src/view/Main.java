/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MainController;
import java.util.ArrayList;
import model.Movie;

/**
 *
 * @author Maicon
 */
public class Main extends javax.swing.JFrame {

    private final MainController controller;
    private ArrayList<Movie> moviesArray = new ArrayList<>();
    public static ArrayList<Movie> moviesShowed = new ArrayList<>();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.controller = new MainController(this);
//        int test = moviesArray.get(0).getIdMovie();
//        String title1 = moviesArray.get(0).getTitle();
//        String subTitle1 = moviesArray.get(0).getSubTitle();
//        imageMovie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/"+test+"test170255.jpg")));
//        titleMovie10.setText(title1);
//        subTitleMovie10.setText(subTitle1);
    }

    public Main(ArrayList<Movie> moviesArray) {
        this.moviesArray = moviesArray;
        moviesShowed = moviesArray;
        initComponents();
        this.controller = new MainController(this);

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                this.imageMovie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie1.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie1.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 1) {
                this.imageMovie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie2.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie2.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 2) {
                this.imageMovie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie3.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie3.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 3) {
                this.imageMovie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie4.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie4.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 4) {
                this.imageMovie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie5.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie5.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 5) {
                this.imageMovie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie6.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie6.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 6) {
                this.imageMovie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie7.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie7.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 7) {
                this.imageMovie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie8.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie8.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 8) {
                this.imageMovie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie9.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie9.setText(moviesArray.get(i).getSubTitle());
            } else if (i == 9) {
                this.imageMovie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(i).getIdMovie() + ".jpg")));
                this.titleMovie10.setText(moviesArray.get(i).getTitle());
                this.subTitleMovie10.setText(moviesArray.get(i).getSubTitle());
            }
        }

//        int test = moviesArray.get(0).getIdMovie();
//        String title1 = moviesArray.get(0).getTitle();
//        String subTitle1 = moviesArray.get(0).getSubTitle();
//        this.imageMovie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/" + test + ".jpg")));
//        this.titleMovie10.setText(title1);
//        this.subTitleMovie10.setText(subTitle1);
//        JLabel[] image = new JLabel[10];
//        JLabel[] title = new JLabel[10];
//        JLabel[] subTitle = new JLabel[10];
//        image[0] = new JLabel();
//        image[0].setBounds(45, 53, 170, 255);
//        image[0].setBackground(Color.red);
//        title[0] = new JLabel();
//        title[0].setBounds(45, 260, 170, 16);
//        title[0].setBackground(Color.green);
//        subTitle[0] = new JLabel();
//        subTitle[0].setBounds(45, 280, 170, 16);
//        subTitle[0].setBackground(Color.blue);
//        panel.add(image[0]);
//        panel.add(title[0]);
//        panel.add(subTitle[0]);
//        background.add(panel);
//        this.add(background);
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
        searchLabel = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        genreLabel = new javax.swing.JLabel();
        genreComboBox = new javax.swing.JComboBox();
        moviePanel1 = new javax.swing.JPanel();
        imageMovie1 = new javax.swing.JLabel();
        titleMovie1 = new javax.swing.JLabel();
        subTitleMovie1 = new javax.swing.JLabel();
        moviePanel2 = new javax.swing.JPanel();
        imageMovie2 = new javax.swing.JLabel();
        titleMovie2 = new javax.swing.JLabel();
        subTitleMovie2 = new javax.swing.JLabel();
        moviePanel3 = new javax.swing.JPanel();
        imageMovie3 = new javax.swing.JLabel();
        titleMovie3 = new javax.swing.JLabel();
        subTitleMovie3 = new javax.swing.JLabel();
        moviePanel4 = new javax.swing.JPanel();
        imageMovie4 = new javax.swing.JLabel();
        titleMovie4 = new javax.swing.JLabel();
        subTitleMovie4 = new javax.swing.JLabel();
        moviePanel5 = new javax.swing.JPanel();
        titleMovie5 = new javax.swing.JLabel();
        subTitleMovie5 = new javax.swing.JLabel();
        imageMovie5 = new javax.swing.JLabel();
        moviePanel6 = new javax.swing.JPanel();
        imageMovie6 = new javax.swing.JLabel();
        titleMovie6 = new javax.swing.JLabel();
        subTitleMovie6 = new javax.swing.JLabel();
        moviePanel7 = new javax.swing.JPanel();
        imageMovie7 = new javax.swing.JLabel();
        titleMovie7 = new javax.swing.JLabel();
        subTitleMovie7 = new javax.swing.JLabel();
        moviePanel8 = new javax.swing.JPanel();
        imageMovie8 = new javax.swing.JLabel();
        titleMovie8 = new javax.swing.JLabel();
        subTitleMovie8 = new javax.swing.JLabel();
        moviePanel9 = new javax.swing.JPanel();
        imageMovie9 = new javax.swing.JLabel();
        titleMovie9 = new javax.swing.JLabel();
        subTitleMovie9 = new javax.swing.JLabel();
        moviePanel10 = new javax.swing.JPanel();
        imageMovie10 = new javax.swing.JLabel();
        titleMovie10 = new javax.swing.JLabel();
        subTitleMovie10 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setMaximumSize(new java.awt.Dimension(1200, 840));
        background.setMinimumSize(new java.awt.Dimension(1200, 840));
        background.setPreferredSize(new java.awt.Dimension(1200, 840));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/xtra-vision_400.jpg"))); // NOI18N

        panel.setMaximumSize(new java.awt.Dimension(1100, 665));
        panel.setMinimumSize(new java.awt.Dimension(1100, 665));
        panel.setPreferredSize(new java.awt.Dimension(1100, 665));

        searchLabel.setText("SEARCH");

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        genreLabel.setText("GENRE");

        moviePanel1.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel1.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel1.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel1.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/test170255.jpg"))); // NOI18N
        imageMovie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie1MouseClicked(evt);
            }
        });

        titleMovie1.setText("Star Wars: Episode VI");
        titleMovie1.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie1.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie1.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie1.setText("The Return of the Jedi");
        subTitleMovie1.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie1.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie1.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel1Layout = new javax.swing.GroupLayout(moviePanel1);
        moviePanel1.setLayout(moviePanel1Layout);
        moviePanel1Layout.setHorizontalGroup(
            moviePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel1Layout.createSequentialGroup()
                .addComponent(imageMovie1)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviePanel1Layout.createSequentialGroup()
                .addGroup(moviePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        moviePanel1Layout.setVerticalGroup(
            moviePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel1Layout.createSequentialGroup()
                .addComponent(imageMovie1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        moviePanel2.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel2.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel2.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel2.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/mortalkombat-2021-newposter-blue.jpeg"))); // NOI18N
        imageMovie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie2MouseClicked(evt);
            }
        });

        titleMovie2.setText("Star Wars: Episode VI");
        titleMovie2.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie2.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie2.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie2.setText("The Return of the Jedi");
        subTitleMovie2.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie2.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie2.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel2Layout = new javax.swing.GroupLayout(moviePanel2);
        moviePanel2.setLayout(moviePanel2Layout);
        moviePanel2Layout.setHorizontalGroup(
            moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel2Layout.createSequentialGroup()
                .addComponent(imageMovie2)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviePanel2Layout.createSequentialGroup()
                .addGroup(moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        moviePanel2Layout.setVerticalGroup(
            moviePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel2Layout.createSequentialGroup()
                .addComponent(imageMovie2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        moviePanel3.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel3.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel3.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel3.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/return-of-the-jedi-poster-big.jpg"))); // NOI18N
        imageMovie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie3MouseClicked(evt);
            }
        });

        titleMovie3.setText("Star Wars: Episode VI");
        titleMovie3.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie3.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie3.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie3.setText("The Return of the Jedi");
        subTitleMovie3.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie3.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie3.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel3Layout = new javax.swing.GroupLayout(moviePanel3);
        moviePanel3.setLayout(moviePanel3Layout);
        moviePanel3Layout.setHorizontalGroup(
            moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel3Layout.createSequentialGroup()
                .addComponent(imageMovie3)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviePanel3Layout.createSequentialGroup()
                .addGroup(moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        moviePanel3Layout.setVerticalGroup(
            moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel3Layout.createSequentialGroup()
                .addComponent(imageMovie3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        moviePanel4.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel4.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel4.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel4.setName(""); // NOI18N
        moviePanel4.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie4MouseClicked(evt);
            }
        });

        titleMovie4.setText("Star Wars: Episode VI");
        titleMovie4.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie4.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie4.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie4.setText("The Return of the Jedi");
        subTitleMovie4.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie4.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie4.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel4Layout = new javax.swing.GroupLayout(moviePanel4);
        moviePanel4.setLayout(moviePanel4Layout);
        moviePanel4Layout.setHorizontalGroup(
            moviePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageMovie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(moviePanel4Layout.createSequentialGroup()
                .addGroup(moviePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        moviePanel4Layout.setVerticalGroup(
            moviePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel4Layout.createSequentialGroup()
                .addComponent(imageMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        moviePanel5.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel5.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel5.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel5.setPreferredSize(new java.awt.Dimension(170, 303));

        titleMovie5.setText("Star Wars: Episode VI");
        titleMovie5.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie5.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie5.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie5.setText("The Return of the Jedi");
        subTitleMovie5.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie5.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie5.setPreferredSize(new java.awt.Dimension(170, 16));

        imageMovie5.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie5.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie5.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout moviePanel5Layout = new javax.swing.GroupLayout(moviePanel5);
        moviePanel5.setLayout(moviePanel5Layout);
        moviePanel5Layout.setHorizontalGroup(
            moviePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel5Layout.createSequentialGroup()
                .addGroup(moviePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleMovie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTitleMovie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageMovie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        moviePanel5Layout.setVerticalGroup(
            moviePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviePanel5Layout.createSequentialGroup()
                .addComponent(imageMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(titleMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        moviePanel6.setBackground(new java.awt.Color(100, 240, 240));

        imageMovie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/2.jpg"))); // NOI18N
        imageMovie6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie6MouseClicked(evt);
            }
        });

        titleMovie6.setText("Star Wars: Episode VI");
        titleMovie6.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie6.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie6.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie6.setText("The Return of the Jedi");
        subTitleMovie6.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie6.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie6.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel6Layout = new javax.swing.GroupLayout(moviePanel6);
        moviePanel6.setLayout(moviePanel6Layout);
        moviePanel6Layout.setHorizontalGroup(
            moviePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageMovie6)
            .addComponent(titleMovie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(subTitleMovie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        moviePanel6Layout.setVerticalGroup(
            moviePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel6Layout.createSequentialGroup()
                .addComponent(imageMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        moviePanel7.setBackground(new java.awt.Color(100, 240, 240));

        imageMovie7.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie7.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie7.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie7MouseClicked(evt);
            }
        });

        titleMovie7.setText("Star Wars: Episode VI");
        titleMovie7.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie7.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie7.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie7.setText("The Return of the Jedi");
        subTitleMovie7.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie7.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie7.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel7Layout = new javax.swing.GroupLayout(moviePanel7);
        moviePanel7.setLayout(moviePanel7Layout);
        moviePanel7Layout.setHorizontalGroup(
            moviePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageMovie7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(titleMovie7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(subTitleMovie7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        moviePanel7Layout.setVerticalGroup(
            moviePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel7Layout.createSequentialGroup()
                .addComponent(imageMovie7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        moviePanel8.setBackground(new java.awt.Color(100, 240, 240));

        imageMovie8.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie8.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie8.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie8MouseClicked(evt);
            }
        });

        titleMovie8.setText("Star Wars: Episode VI");
        titleMovie8.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie8.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie8.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie8.setText("The Return of the Jedi");
        subTitleMovie8.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie8.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie8.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel8Layout = new javax.swing.GroupLayout(moviePanel8);
        moviePanel8.setLayout(moviePanel8Layout);
        moviePanel8Layout.setHorizontalGroup(
            moviePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageMovie8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(titleMovie8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(subTitleMovie8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        moviePanel8Layout.setVerticalGroup(
            moviePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel8Layout.createSequentialGroup()
                .addComponent(imageMovie8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        moviePanel9.setBackground(new java.awt.Color(100, 240, 240));
        moviePanel9.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel9.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel9.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie9.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie9.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie9.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie9MouseClicked(evt);
            }
        });

        titleMovie9.setText("Star Wars: Episode VI");
        titleMovie9.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie9.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie9.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie9.setText("The Return of the Jedi");
        subTitleMovie9.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie9.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie9.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel9Layout = new javax.swing.GroupLayout(moviePanel9);
        moviePanel9.setLayout(moviePanel9Layout);
        moviePanel9Layout.setHorizontalGroup(
            moviePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel9Layout.createSequentialGroup()
                .addGroup(moviePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageMovie9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );
        moviePanel9Layout.setVerticalGroup(
            moviePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel9Layout.createSequentialGroup()
                .addComponent(imageMovie9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        moviePanel10.setBackground(new java.awt.Color(100, 240, 240));

        imageMovie10.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie10.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie10.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie10MouseClicked(evt);
            }
        });

        titleMovie10.setText("Star Wars: Episode VI");
        titleMovie10.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie10.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie10.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie10.setText("The Return of the Jedi");
        subTitleMovie10.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie10.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie10.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel10Layout = new javax.swing.GroupLayout(moviePanel10);
        moviePanel10.setLayout(moviePanel10Layout);
        moviePanel10Layout.setHorizontalGroup(
            moviePanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageMovie10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(titleMovie10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(subTitleMovie10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        moviePanel10Layout.setVerticalGroup(
            moviePanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel10Layout.createSequentialGroup()
                .addComponent(imageMovie10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(subTitleMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(searchLabel)
                        .addGap(72, 72, 72)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(genreLabel)
                        .addGap(30, 30, 30)
                        .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moviePanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moviePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moviePanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moviePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(searchLabel))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(moviePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(moviePanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(moviePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(moviePanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(moviePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(moviePanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(moviePanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setToolTipText("");
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
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(logo))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logo)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        controller.backMain();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void imageMovie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie1MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(0).getIdMovie());
    }//GEN-LAST:event_imageMovie1MouseClicked

    private void imageMovie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie2MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(1).getIdMovie());
    }//GEN-LAST:event_imageMovie2MouseClicked

    private void imageMovie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie3MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(2).getIdMovie());
    }//GEN-LAST:event_imageMovie3MouseClicked

    private void imageMovie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie4MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(3).getIdMovie());
    }//GEN-LAST:event_imageMovie4MouseClicked

    private void imageMovie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie5MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(4).getIdMovie());
    }//GEN-LAST:event_imageMovie5MouseClicked

    private void imageMovie6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie6MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(5).getIdMovie());
    }//GEN-LAST:event_imageMovie6MouseClicked

    private void imageMovie7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie7MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(6).getIdMovie());
    }//GEN-LAST:event_imageMovie7MouseClicked

    private void imageMovie8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie8MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(7).getIdMovie());
    }//GEN-LAST:event_imageMovie8MouseClicked

    private void imageMovie9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie9MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(8).getIdMovie());
    }//GEN-LAST:event_imageMovie9MouseClicked

    private void imageMovie10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie10MouseClicked
        // TODO add your handling code here:
        controller.goMovieDescription(moviesArray.get(9).getIdMovie());
    }//GEN-LAST:event_imageMovie10MouseClicked

    

   

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox genreComboBox;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel imageMovie1;
    private javax.swing.JLabel imageMovie10;
    private javax.swing.JLabel imageMovie2;
    private javax.swing.JLabel imageMovie3;
    private javax.swing.JLabel imageMovie4;
    private javax.swing.JLabel imageMovie5;
    private javax.swing.JLabel imageMovie6;
    private javax.swing.JLabel imageMovie7;
    private javax.swing.JLabel imageMovie8;
    private javax.swing.JLabel imageMovie9;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JPanel moviePanel10;
    private javax.swing.JPanel moviePanel2;
    private javax.swing.JPanel moviePanel3;
    private javax.swing.JPanel moviePanel4;
    private javax.swing.JPanel moviePanel5;
    private javax.swing.JPanel moviePanel6;
    private javax.swing.JPanel moviePanel7;
    private javax.swing.JPanel moviePanel8;
    private javax.swing.JPanel moviePanel9;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel subTitleMovie1;
    private javax.swing.JLabel subTitleMovie10;
    private javax.swing.JLabel subTitleMovie2;
    private javax.swing.JLabel subTitleMovie3;
    private javax.swing.JLabel subTitleMovie4;
    private javax.swing.JLabel subTitleMovie5;
    private javax.swing.JLabel subTitleMovie6;
    private javax.swing.JLabel subTitleMovie7;
    private javax.swing.JLabel subTitleMovie8;
    private javax.swing.JLabel subTitleMovie9;
    private javax.swing.JLabel titleMovie1;
    private javax.swing.JLabel titleMovie10;
    private javax.swing.JLabel titleMovie2;
    private javax.swing.JLabel titleMovie3;
    private javax.swing.JLabel titleMovie4;
    private javax.swing.JLabel titleMovie5;
    private javax.swing.JLabel titleMovie6;
    private javax.swing.JLabel titleMovie7;
    private javax.swing.JLabel titleMovie8;
    private javax.swing.JLabel titleMovie9;
    // End of variables declaration//GEN-END:variables
}
