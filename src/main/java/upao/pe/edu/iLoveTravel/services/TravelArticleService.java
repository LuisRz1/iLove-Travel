package upao.pe.edu.iLoveTravel.services;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import upao.pe.edu.iLoveTravel.models.TravelArticle;
import upao.pe.edu.iLoveTravel.repositories.TravelArticleRespository;

import java.util.List;

@Service
@Transactional
public class TravelArticleService {
    private final TravelArticleRespository travelArticleRespository;

    public TravelArticleService(TravelArticleRespository travelArticleRespository) {
        this.travelArticleRespository = travelArticleRespository;
    }

    public List<TravelArticle> getAllTravelArticle(){
        return travelArticleRespository.findAll();
    }

    public void addTravelArticle(TravelArticle travelArticle){
        travelArticleRespository.save(travelArticle);
    }

    public void updateTravelArticle(TravelArticle travelArticle, Long travelArticleId){
        TravelArticle travelArticleExists = travelArticleRespository.findById(travelArticleId)
                .orElse(new TravelArticle());
        travelArticleExists.setTitle(travelArticle.getTitle());
        travelArticleRespository.save(travelArticleExists);
    }

    public void deleteTravelArticleById(Long travelArticleId){
        travelArticleRespository.deleteById(travelArticleId);
    }
}
