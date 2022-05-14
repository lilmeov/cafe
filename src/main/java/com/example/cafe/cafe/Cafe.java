package com.example.cafe.cafe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "cafe")
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
//    private byte image;
    private Integer rating;
    private String comment;


    public Cafe(String name, String description, int rating, String comment) {
        this.name = name;
        this.description = description;

        this.rating = rating;
        this.comment = comment;
    }

    public Cafe(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
