package upao.pe.edu.iLoveTravel.models;

public class ApiResponse {

    private String comment;
    private User user;

    public ApiResponse(String comment, User user) {
        this.comment = comment;
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
