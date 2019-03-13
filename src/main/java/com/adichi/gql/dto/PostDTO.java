package com.adichi.gql.dto;

import lombok.Data;

@Data
public class PostDTO {

    private Long id;
    private String msg;
    private String category;
    private Long authorId;
}
