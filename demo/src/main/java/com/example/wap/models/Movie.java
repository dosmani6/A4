package com.example.wap.models;
import javax.persistence.*;
@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String poster;
    private String imdbID;

    public String getTitle() {
        return title;
    }

    public String getImdbID() {
        return imdbID;
    }

    public Integer getId() {
        return id;
    }

    public String getPoster() {
        return poster;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", poster='" + poster + '\'' +
                ", imdbID='" + imdbID + '\'' +
                '}';
    }
}
