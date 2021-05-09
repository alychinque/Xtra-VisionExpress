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
public class Movie {
    private int idMovie;
    private String title;
    private String subTitle;
    private String genre;
    private String description;
    private int duration;

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

    public int getIdMovie() {
        return idMovie;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
    
}
