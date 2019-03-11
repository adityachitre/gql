package com.adichi.gql.dto;

import lombok.Data;

@Data
public class PostDTO {

    private Long id;
    private String title;
    private String category;
    private Long authorId;
}
