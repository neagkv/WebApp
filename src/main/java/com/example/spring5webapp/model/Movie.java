package com.example.spring5webapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Neag
 */

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private BigDecimal budget;
    private String studio;

    @ManyToMany
    @JoinTable(name = "actor_movie", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actorSet = new HashSet<>();


    public Movie() {
    }

    public Movie(String title, BigDecimal budget, String studio) {
        this.title = title;
        this.budget = budget;
        this.studio = studio;
    }

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

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Set<Actor> getActorSet() {
        return actorSet;
    }

    public void setActorSet(Set<Actor> actorSet) {
        this.actorSet = actorSet;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Movie movie = (Movie) object;

        return id != null ? id.equals(movie.id) : movie.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", budget=" + budget +
                ", studio='" + studio + '\'' +
                ", actorSet=" + actorSet +
                '}';
    }
}
