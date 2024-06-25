package com.example.Blog_App_Angular_Spring.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String content;

    private String postedBy;

    private String ing;

    private Date date;

    private  int likeCount;

    private  int viewcount;

    private List<String> tags;
}
