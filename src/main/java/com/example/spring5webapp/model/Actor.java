package com.example.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Neag
 */

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

    public Actor() {
    }

    public Actor(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(Long id, String firstName, String lastName, Set<Movie> movies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        Actor actor = (Actor) object;

        return id != null ? id.equals(actor.id) : actor.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
