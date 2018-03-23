package com.example.spring5webapp.controller;

import com.example.spring5webapp.repository.MovieRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin Neag
 */

/**
 * Controller class
 */
@Controller
public class MovieController {

    private MovieRepo movieRepo;

    /**
     * constructor
     * @param movieRepo
     */
    public MovieController(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    //return a string of the view name
    //return a list of movies out of the h2 database
    @RequestMapping("/movies")
    public String getMovies(Model model){
        model.addAttribute("movies",movieRepo.findAll());
        return "movies";

    }
}
