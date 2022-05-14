package com.example.cafe.comment;

import com.example.cafe.cafe.Cafe;
import com.example.cafe.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    Cafe cafe;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public Comment(String comment, Cafe cafe, User user) {
        this.comment = comment;
        this.cafe = cafe;
        this.user = user;
    }
}