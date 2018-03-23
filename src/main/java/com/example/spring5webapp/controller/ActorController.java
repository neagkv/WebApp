package com.example.spring5webapp.controller;

import com.example.spring5webapp.repository.ActorRepo;
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
public class ActorController{

    private ActorRepo actorRepo;

    /**
     * constructor
     * @param actorRepo
     */
    public ActorController(ActorRepo actorRepo) {
        this.actorRepo = actorRepo;
    }

    //return a string of the view name
    //return a list of actors out of the h2 database
    @RequestMapping("/actors")
    public String getMovies(Model model){
        model.addAttribute("actors",actorRepo.findAll());
        return "actors";

    }

}