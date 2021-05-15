/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alysson Chinque
 */
/**
 * This class will hold some variables that will be associated to the movies
 */
public class Movie {
    private int idMovie;
    private String title;
    private String subTitle;
    private String genre;
    private String description;
    private int duration;
    /**
     * 
     * Every movie will have an ID number, number and subtitle (when applicable)
     */
    public Movie(int idMovie, String title, String subTitle) {
        this.idMovie = idMovie;
        this.title = title;
        this.subTitle = subTitle;
    }

    public Movie(int idMovie, String title, String subTitle, String genre, String description, int duration) {
        this.idMovie = idMovie;
        this.title = title;
        this.subTitle = subTitle;
        this.genre = genre;
        this.description = description;
        this.duration = duration;
    }
    /**
     * A movie will have an ID number
     */
    public int getIdMovie() {
        return idMovie;
    }
    /**
     * A title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Subtitle 
     */
    public String getSubTitle() {
        return subTitle;
    }
    /**
     * Genre
     */
    public String getGenre() {
        return genre;
    }
    /**
     * Description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Duration
     */
    public int getDuration() {
        return duration;
    }
    
}
