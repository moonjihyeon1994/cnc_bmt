package com.cnc.rating.controller;

import com.cnc.rating.mybatis.Post;
import com.cnc.rating.repository.PostRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final PostRepo postRepo;

    @GetMapping("/1")
    public List<Post> getPost1() {
        return postRepo.getAllPost_Client1();
    }

    @GetMapping("/2")
    public List<Post> getPost2() {
        return postRepo.getAllPost_Client2();
    }
}
