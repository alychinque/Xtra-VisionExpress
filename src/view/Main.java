package view;

import controller.MainController;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Movie;

/**
 *
 * @author Maicon
 */
public class Main extends javax.swing.JFrame {

    private final MainController controller = new MainController(this);
    private JButton goCart;
    private ArrayList<Movie> moviesArrayTotal = new ArrayList<>();
    public static ArrayList<Movie> moviesShowed = new ArrayList<>();
    private String[] genre;
    private int session;
    private int currentPage = 1;
    private int pages;
    private double quantityOfMovies;
    private int first;
    private int movie1Id;
    private int movie2Id;
    private int movie3Id;
    private int movie4Id;
    private int movie5Id;
    private int movie6Id;
    private int movie7Id;
    private int movie8Id;
    private int movie9Id;
    private int movie10Id;

    /**
     * Creates new form Main and the last 10 movies will be shown on the
     * MainController
     *
     * @param session
     */
    public Main(int session) {
        initComponents();
        this.currentPage = 1;
        moviesArrayTotal = controller.getMoviesTotal();
        quantityOfMovies = moviesArrayTotal.size();
        pages = getPages(quantityOfMovies);
        lastPageLabel.setText(Integer.toString(pages));
        setPagination();
        first = (int) quantityOfMovies - 1;
        fillMovies(moviesArrayTotal, first);
        this.session = session;
        creteButton();
    }

    public Main() {
        this.session = 0;
        initComponents();
        this.currentPage = 1;
        moviesArrayTotal = controller.getMoviesTotal();
        quantityOfMovies = moviesArrayTotal.size();
        pages = getPages(quantityOfMovies);
        lastPageLabel.setText(Integer.toString(pages));
        setPagination();
        first = (int) quantityOfMovies - 1;
        fillMovies(moviesArrayTotal, first);
        genre = setComboBox();
        setGenre();
    }

    /**
     * Creating a method with an array that will be populated with the last 10
     * movies from the DataBase
     */
    public void fillMovies(ArrayList<Movie> moviesArray, int first) {
        this.first = first;

        this.movie1Id = first;
        this.moviePanel1.setVisible(true);
        this.imageMovie1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.imageMovie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first).getIdMovie() + ".jpg")));
        this.titleMovie1.setText(moviesArray.get(first).getTitle());
        this.subTitleMovie1.setText(moviesArray.get(first).getSubTitle());

        if ((first / 1) > 0) {
            this.moviePanel2.setVisible(true);
            this.movie2Id = first - 1;
            this.imageMovie2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 1).getIdMovie() + ".jpg")));
            this.titleMovie2.setText(moviesArray.get(first - 1).getTitle());
            this.subTitleMovie2.setText(moviesArray.get(first - 1).getSubTitle());
        }

        if ((first / 2) > 0) {
            this.moviePanel3.setVisible(true);
            this.movie3Id = first - 2;
            this.imageMovie3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 2).getIdMovie() + ".jpg")));
            this.titleMovie3.setText(moviesArray.get(first - 2).getTitle());
            this.subTitleMovie3.setText(moviesArray.get(first - 2).getSubTitle());
        }

        if ((first / 3) > 0) {
            this.moviePanel4.setVisible(true);
            this.movie4Id = first - 3;
            this.imageMovie4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 3).getIdMovie() + ".jpg")));
            this.titleMovie4.setText(moviesArray.get(first - 3).getTitle());
            this.subTitleMovie4.setText(moviesArray.get(first - 3).getSubTitle());
        }

        if ((first / 4) > 0) {
            this.moviePanel5.setVisible(true);
            this.movie5Id = first - 4;
            this.imageMovie5.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 4).getIdMovie() + ".jpg")));
            this.titleMovie5.setText(moviesArray.get(first - 4).getTitle());
            this.subTitleMovie5.setText(moviesArray.get(first - 4).getSubTitle());
        }

        if ((first / 5) > 0) {
            this.moviePanel6.setVisible(true);
            this.movie6Id = first - 5;
            this.imageMovie6.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 5).getIdMovie() + ".jpg")));
            this.titleMovie6.setText(moviesArray.get(first - 5).getTitle());
            this.subTitleMovie6.setText(moviesArray.get(first - 5).getSubTitle());
        }

        if ((first / 6) > 0) {
            this.moviePanel7.setVisible(true);
            this.movie7Id = first - 6;
            this.imageMovie7.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 6).getIdMovie() + ".jpg")));
            this.titleMovie7.setText(moviesArray.get(first - 6).getTitle());
            this.subTitleMovie7.setText(moviesArray.get(first - 6).getSubTitle());
        }

        if ((first / 7) > 0) {
            this.moviePanel8.setVisible(true);
            this.movie8Id = first - 7;
            this.imageMovie8.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 7).getIdMovie() + ".jpg")));
            this.titleMovie8.setText(moviesArray.get(first - 7).getTitle());
            this.subTitleMovie8.setText(moviesArray.get(first - 7).getSubTitle());
        }

        if ((first / 8) > 0) {
            this.moviePanel9.setVisible(true);
            this.movie9Id = first - 8;
            this.imageMovie9.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 8).getIdMovie() + ".jpg")));
            this.titleMovie9.setText(moviesArray.get(first - 8).getTitle());
            this.subTitleMovie9.setText(moviesArray.get(first - 8).getSubTitle());
        }

        if ((first / 9) > 0) {
            this.moviePanel10.setVisible(true);
            this.movie10Id = first - 9;
            this.imageMovie10.setCursor(new Cursor(Cursor.HAND_CURSOR));
            this.imageMovie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/movies/" + moviesArray.get(first - 9).getIdMovie() + ".jpg")));
            this.titleMovie10.setText(moviesArray.get(first - 9).getTitle());
            this.subTitleMovie10.setText(moviesArray.get(first - 9).getSubTitle());
        }

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        currentPageLabel = new javax.swing.JLabel();
        lastPageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 840));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 840));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 840));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 840));

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

        moviePanel1.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel1.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel1.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie1MouseClicked(evt);
            }
        });

        titleMovie1.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie1.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie1.setPreferredSize(new java.awt.Dimension(170, 16));

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

        moviePanel2.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel2.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel2.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie2MouseClicked(evt);
            }
        });

        titleMovie2.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie2.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie2.setPreferredSize(new java.awt.Dimension(170, 16));

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

        moviePanel3.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel3.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel3.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie3MouseClicked(evt);
            }
        });

        titleMovie3.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie3.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie3.setPreferredSize(new java.awt.Dimension(170, 16));

        subTitleMovie3.setMaximumSize(new java.awt.Dimension(170, 16));
        subTitleMovie3.setMinimumSize(new java.awt.Dimension(170, 16));
        subTitleMovie3.setPreferredSize(new java.awt.Dimension(170, 16));

        javax.swing.GroupLayout moviePanel3Layout = new javax.swing.GroupLayout(moviePanel3);
        moviePanel3.setLayout(moviePanel3Layout);
        moviePanel3Layout.setHorizontalGroup(
            moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moviePanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMovie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitleMovie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(moviePanel3Layout.createSequentialGroup()
                .addComponent(imageMovie3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        moviePanel3Layout.setVerticalGroup(
            moviePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moviePanel3Layout.createSequentialGroup()
                .addComponent(imageMovie3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        moviePanel4.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel4.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel4.setName(""); // NOI18N
        moviePanel4.setPreferredSize(new java.awt.Dimension(170, 303));

        imageMovie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie4MouseClicked(evt);
            }
        });

        titleMovie4.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie4.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie4.setPreferredSize(new java.awt.Dimension(170, 16));

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
                .addGap(0, 5, Short.MAX_VALUE))
        );

        moviePanel5.setMaximumSize(new java.awt.Dimension(170, 303));
        moviePanel5.setMinimumSize(new java.awt.Dimension(170, 303));
        moviePanel5.setPreferredSize(new java.awt.Dimension(170, 303));

        titleMovie5.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie5.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie5.setPreferredSize(new java.awt.Dimension(170, 16));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subTitleMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        imageMovie6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie6MouseClicked(evt);
            }
        });

        titleMovie6.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie6.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie6.setPreferredSize(new java.awt.Dimension(170, 16));

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

        imageMovie7.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie7.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie7.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie7MouseClicked(evt);
            }
        });

        titleMovie7.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie7.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie7.setPreferredSize(new java.awt.Dimension(170, 16));

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

        imageMovie8.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie8.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie8.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie8MouseClicked(evt);
            }
        });

        titleMovie8.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie8.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie8.setPreferredSize(new java.awt.Dimension(170, 16));

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

        titleMovie9.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie9.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie9.setPreferredSize(new java.awt.Dimension(170, 16));

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

        imageMovie10.setMaximumSize(new java.awt.Dimension(170, 255));
        imageMovie10.setMinimumSize(new java.awt.Dimension(170, 255));
        imageMovie10.setPreferredSize(new java.awt.Dimension(170, 255));
        imageMovie10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMovie10MouseClicked(evt);
            }
        });

        titleMovie10.setMaximumSize(new java.awt.Dimension(170, 16));
        titleMovie10.setMinimumSize(new java.awt.Dimension(170, 16));
        titleMovie10.setPreferredSize(new java.awt.Dimension(170, 16));

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
                            .addComponent(moviePanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(moviePanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setToolTipText("");
        backButton.setPreferredSize(new java.awt.Dimension(140, 40));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("/");

        currentPageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currentPageLabel.setForeground(new java.awt.Color(255, 255, 0));
        currentPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentPageLabel.setMaximumSize(new java.awt.Dimension(40, 22));
        currentPageLabel.setMinimumSize(new java.awt.Dimension(40, 22));
        currentPageLabel.setPreferredSize(new java.awt.Dimension(40, 22));

        lastPageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastPageLabel.setForeground(new java.awt.Color(255, 255, 0));
        lastPageLabel.setMaximumSize(new java.awt.Dimension(40, 22));
        lastPageLabel.setMinimumSize(new java.awt.Dimension(40, 22));
        lastPageLabel.setPreferredSize(new java.awt.Dimension(40, 22));

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
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(79, 79, 79)
                                .addComponent(currentPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(340, 340, 340)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logo)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(currentPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(background);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed

    }//GEN-LAST:event_searchInputActionPerformed
    // Method that will return the information of the movies
    private void imageMovie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie1MouseClicked

        controller.goMovieDescription(session, moviesArrayTotal.get(movie1Id).getIdMovie());
    }//GEN-LAST:event_imageMovie1MouseClicked

    private void imageMovie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie2MouseClicked
        if ((first / 1) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie2Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie2MouseClicked

    private void imageMovie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie3MouseClicked
        if ((first / 2) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie3Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie3MouseClicked

    private void imageMovie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie4MouseClicked
        if ((first / 3) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie4Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie4MouseClicked

    private void imageMovie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie5MouseClicked
        if ((first / 4) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie5Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie5MouseClicked

    private void imageMovie6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie6MouseClicked
        if ((first / 5) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie6Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie6MouseClicked

    private void imageMovie7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie7MouseClicked
        if ((first / 6) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie7Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie7MouseClicked

    private void imageMovie8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie8MouseClicked
        if ((first / 7) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie8Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie8MouseClicked

    private void imageMovie9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie9MouseClicked
        if ((first / 8) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie9Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie9MouseClicked

    private void imageMovie10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMovie10MouseClicked
        if ((first / 9) > 0) {
            controller.goMovieDescription(session, moviesArrayTotal.get(movie10Id).getIdMovie());
        }
    }//GEN-LAST:event_imageMovie10MouseClicked


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        controller.backHome();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        goPreviousPage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        goNextPage();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JLabel currentPageLabel;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastPageLabel;
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

    private void creteButton() {
        goCart = new JButton();
        goCart.setBounds(1010, 780, 140, 40);
        goCart.setFont(new java.awt.Font("Tahoma", 0, 18));
        goCart.setText("GO CART");
        background.add(goCart);
        goCart.addActionListener(controller);
        goCart.setActionCommand(Integer.toString(session));

    }

    private int getPages(double size) {
        double res = size / 10;
        return (int) Math.ceil(size / 10);
    }

    private void goNextPage() {
        currentPage++;
        if (currentPage > pages) {
            JOptionPane.showMessageDialog(null, "Last page.");
            currentPage--;
        } else {
            this.first -= 10;
            setPagination();
            cleanPanels();
            fillMovies(moviesArrayTotal, first);
        }
    }

    private void goPreviousPage() {
        currentPage--;
        if (currentPage < 1) {
            JOptionPane.showMessageDialog(null, "First page.");
            currentPage++;
        } else {
            this.first += 10;
            setPagination();

            fillMovies(moviesArrayTotal, first);
        }
    }

    private void setPagination() {
        currentPageLabel.setText(Integer.toString(currentPage));
    }

    private void cleanPanels() {
        moviePanel1.setVisible(false);
        moviePanel2.setVisible(false);
        moviePanel3.setVisible(false);
        moviePanel4.setVisible(false);
        moviePanel5.setVisible(false);
        moviePanel6.setVisible(false);
        moviePanel7.setVisible(false);
        moviePanel8.setVisible(false);
        moviePanel9.setVisible(false);
        moviePanel10.setVisible(false);
    }

    private String[] setComboBox() {
        String[] genre = null;
        try {
            genre = controller.getGenre();
            return genre;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getting genre");
            return genre;
        }
    }

    private void setGenre() {
        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel(genre));
    }

}
