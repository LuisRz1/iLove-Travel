package upao.pe.edu.iLoveTravel.controllers;

import org.springframework.web.bind.annotation.*;
import upao.pe.edu.iLoveTravel.models.ArticleBlock;
import upao.pe.edu.iLoveTravel.models.TravelArticle;
import upao.pe.edu.iLoveTravel.services.ArticleBlockService;
import upao.pe.edu.iLoveTravel.services.TravelArticleService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articleblocks")
public class ArticleBlockController {
    private final ArticleBlockService articleBlockService;

    public ArticleBlockController(ArticleBlockService articleBlockService) {
        this.articleBlockService = articleBlockService;
    }
    @GetMapping
    private List<ArticleBlock> getAllArticleBlock(){
        return articleBlockService.getAllArticleBlock();
    }

    @PostMapping
    public void addArticleBlock(@RequestBody ArticleBlock articleBlock){
        articleBlockService.addArticleBlock(articleBlock);
    }

    @PutMapping
    public void addArticleBlock(@RequestBody ArticleBlock articleBlock, @PathVariable Long articleBlockId){
        articleBlockService.updateArticleBlock(articleBlock, articleBlockId);
    }

    @DeleteMapping("/{articleBlockId}")
    public void deleteArticleBlockById(@PathVariable Long articleBlockId){
        articleBlockService.deleteArticleBlockById(articleBlockId);
    }
}
