package com.example.spring5webapp.bootstrap;

/**
 * @author Kevin Neag
 */

import com.example.spring5webapp.model.Actor;
import com.example.spring5webapp.model.Movie;
import com.example.spring5webapp.repository.ActorRepo;
import com.example.spring5webapp.repository.MovieRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Bootstrap class to plug in known data
 */
@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent>{

    private MovieRepo movieRepo;
    private ActorRepo actorRepo;

    /**
     * Constructor with both repos injected
     * @param movieRepo
     * @param actorRepo
     */
    public BootStrap(MovieRepo movieRepo, ActorRepo actorRepo) {
        this.movieRepo = movieRepo;
        this.actorRepo = actorRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();

    }

    /**
     * InitiData method to add data into h2 database
     */
    private void initData(){

        Actor freeman = new Actor("Morgan","Freeman");
        Movie ssr = new Movie("Shawshank Redemption",25000000,"Castle Rock");
        Movie ddk = new Movie("Dark Kinght",185000000,"Warner Bros");
        freeman.getMovies().add(ssr);
        freeman.getMovies().add(ddk);
        actorRepo.save(freeman);
        movieRepo.save(ssr);
        movieRepo.save(ddk);

        Actor robbins = new Actor("Tim", "Robbins");
        Movie myr = new Movie("Mystic River",25000000,"Warner Bros");
        robbins.getMovies().add(ssr);
        robbins.getMovies().add(myr);
        actorRepo.save(robbins);
        movieRepo.save(myr);


    }
}
