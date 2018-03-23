package com.example.spring5webapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Neag
 */

/**
 * Movie Pojo annotated with entity for use by Java persistence API
 */
@Entity
public class Movie {

    //Auto generated Unique Identifier
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int budget;
    @OneToOne
    private Studio studio;

    //creates a single relational table to define the many to many relationship between actor and movie
    @ManyToMany
    @JoinTable(name ="actor_movie", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actors = new HashSet<>();

    /**
     * Empty constructor
     */
    public Movie() {
    }

    /**
     * Full constructor
     * @param title
     * @param budget
     * @param studio
     */
    public Movie(String title, int budget, Studio studio) {
        this.title = title;
        this.budget = budget;
        this.studio = studio;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    /**
     * Equals and hasCode method for generating a unique Id for working with the movie set
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return id != null ? id.equals(movie.id) : movie.id == null;
    }



    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    /**
     * To String Method
     * @return
     */
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", budget=" + budget +
                ", studio='" + studio + '\'' +
                ", actors=" + actors +
                '}';
    }
}
