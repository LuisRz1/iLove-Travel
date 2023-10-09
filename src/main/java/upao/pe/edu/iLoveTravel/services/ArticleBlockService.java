package upao.pe.edu.iLoveTravel.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import upao.pe.edu.iLoveTravel.models.ArticleBlock;
import upao.pe.edu.iLoveTravel.models.TravelArticle;
import upao.pe.edu.iLoveTravel.repositories.ArticleBlockRespository;

import java.util.List;

@Service
@Transactional
public class ArticleBlockService {
    private final ArticleBlockRespository articleBlockRespository;

    public ArticleBlockService(ArticleBlockRespository articleBlockRespository) {
        this.articleBlockRespository = articleBlockRespository;
    }


    public List<ArticleBlock> getAllArticleBlock(){
        return articleBlockRespository.findAll();
    }

    public void addArticleBlock(ArticleBlock articleBlock){
        articleBlockRespository.save(articleBlock);
    }

    public void updateArticleBlock(ArticleBlock articleBlock, Long articleBlockId){
        ArticleBlock articleBlockExists = articleBlockRespository.findById(articleBlockId)
                .orElse(new ArticleBlock());
    }

    public void deleteArticleBlockById(Long articleBlockId){
        articleBlockRespository.deleteById(articleBlockId);
    }
}
