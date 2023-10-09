package upao.pe.edu.iLoveTravel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "article_blocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleBlock {
    @Id
    @Column(name = "articleblock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleBlockId;
    @Column(name = "blocktype")
    private String blocktype;
    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "travel_article_id")
    private TravelArticle travelArticle;

    public Long getArticleBlockId() {
        return articleBlockId;
    }

    public void setArticleBlockId(Long articlBlockId) {
        this.articleBlockId = articlBlockId;
    }

    public String getBlocktype() {
        return blocktype;
    }

    public void setBlocktype(String blocktype) {
        this.blocktype = blocktype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TravelArticle getTravelArticle() {
        return travelArticle;
    }

    public void setTravelArticle(TravelArticle travelArticle) {
        this.travelArticle = travelArticle;
    }
}
