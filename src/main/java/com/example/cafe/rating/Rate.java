package com.example.cafe.rating;

import com.example.cafe.cafe.Cafe;
import com.example.cafe.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer rate;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    Cafe cafe;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public Rate(Integer rate, Cafe cafe, User user) {
        this.rate = rate;
        this.cafe = cafe;
        this.user = user;
    }
}
