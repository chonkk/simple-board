package com.chonkk.Application.web;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
    private Long id;
    private String author;
    private String title;
    private String content;
}
