package com.example.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Neag
 */

/**
 * Actor pojo annotated with entity for use by java peristence API
 */
@Entity
public class Actor {

    // Auto generated unique Identifier
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    //many movies to actors
    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

    /**
     * Empty Constructor
     */
    public Actor() {
    }

    /**
     * Constructor with everything except movies set
     * @param id
     * @param firstName
     * @param lastName
     */
    public Actor(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Constructor first and last name
     * @param firstName
     * @param lastName
     */
    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Fully Qualified Constructor
     * @param id
     * @param firstName
     * @param lastName
     * @param movies
     */
    public Actor(Long id, String firstName, String lastName, Set<Movie> movies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = movies;
    }

    //Getters and setters

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

    /**
     * Equals method that creates a unique Id for working with the set
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return id != null ? id.equals(actor.id) : actor.id == null;
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
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
