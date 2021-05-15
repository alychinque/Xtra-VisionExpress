/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alych
 */
/**
 * 
 * @author Maicon
 * This class creates the genre and there`s a number assigned to each movie in the database and its specific genre

 * 
 */
public class Genre {
    private int idGenre;
    private String genre;

    public Genre(int idGenre, String genre) {
        this.idGenre = idGenre;
        this.genre = genre;
    }
}
