package com.jojoldu.boot.springboot.doamin.posts;

public class Posts {

    private Long id;

    private String title;

    private String content;

    private String author;

    public Posts( String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
