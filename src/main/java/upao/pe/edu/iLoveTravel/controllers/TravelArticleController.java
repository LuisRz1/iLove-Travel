package upao.pe.edu.iLoveTravel.controllers;
import org.springframework.web.bind.annotation.*;
import upao.pe.edu.iLoveTravel.models.TravelArticle;
import upao.pe.edu.iLoveTravel.models.User;
import upao.pe.edu.iLoveTravel.services.TravelArticleService;

import java.util.List;
@RestController
@RequestMapping("/api/v1/travelArticles")
public class TravelArticleController {

    private final TravelArticleService travelArticleService;

    public TravelArticleController(TravelArticleService travelArticleService) {
        this.travelArticleService = travelArticleService;
    }
    @GetMapping
    private List<TravelArticle> getAllTravelArticle(){
        return travelArticleService.getAllTravelArticle();
    }

    @PostMapping
    public void addTravelArticle(@RequestBody TravelArticle travelArticle){
        travelArticleService.addTravelArticle(travelArticle);
    }

    @PutMapping
    public void addTravelArticle(@RequestBody TravelArticle travelArticle, @PathVariable Long travelArticleId){
        travelArticleService.updateTravelArticle(travelArticle, travelArticleId);
    }

    @DeleteMapping("/{travelArticleId}")
    public void deleteTravelArticle(@PathVariable Long travelArticleId){
        travelArticleService.deleteTravelArticleById(travelArticleId);
    }
}

