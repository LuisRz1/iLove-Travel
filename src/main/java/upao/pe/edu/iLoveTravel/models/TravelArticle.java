package upao.pe.edu.iLoveTravel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "travel_articles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelArticle {
    @Id
    @Column(name = "travel_article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long travelArticleId;
    @Column(name = "title")
    private String title;
    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getTravelArticleId() {
        return travelArticleId;
    }

    public void setTravelArticleId(Long travelArticleId) {
        this.travelArticleId = travelArticleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
