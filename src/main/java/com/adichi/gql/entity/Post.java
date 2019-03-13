package com.adichi.gql.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String msg;
    private String category;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
