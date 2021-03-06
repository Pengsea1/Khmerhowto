package khmerhowto.Repository.Model;


import javax.persistence.*;

@Entity
public class Interested {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Content content;

    public Interested() {
    }

    public Interested(int id, User user, Content content) {
        this.id=id;
        this.user=user;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Interested{" +
                "id=" + id +
                ", user=" + user +
                ", content=" + content +
                '}';
    }
}
