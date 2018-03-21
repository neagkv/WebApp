package com.example.spring5webapp.controller;

import com.example.spring5webapp.repository.MovieRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin Neag
 */

@Controller
public class MovieController {

    private MovieRepo movieRepo;

    public  MovieController(MovieRepo movieRepo){
        this.movieRepo = movieRepo;
    }

    @RequestMapping("/movie")
    public String getMovie(Model model) {

        model.addAttribute("movie", movieRepo);

        return "movie";
    }
}
