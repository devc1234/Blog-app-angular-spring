package com.example.Blog_App_Angular_Spring.Servises;

import com.example.Blog_App_Angular_Spring.Entity.Post;
import com.example.Blog_App_Angular_Spring.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class postServiseImpl implements PostServises {

    @Autowired
    private PostRepo postRepo;

    public Post savePost(Post post){
        post.setLikeCount(0);
        post.setViewcount(0);
        post.setDate(new Date());

        return postRepo.save(post);
    }
}
