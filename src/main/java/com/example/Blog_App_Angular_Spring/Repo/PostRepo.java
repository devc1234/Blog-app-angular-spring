package com.example.Blog_App_Angular_Spring.Repo;

import com.example.Blog_App_Angular_Spring.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {


}
