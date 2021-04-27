package com.cnc.rating.repository;

import com.cnc.rating.mybatis.Post;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepo {

    private final SqlSessionTemplate client1SqlSessionTemplate;
    private final SqlSessionTemplate client2SqlSessionTemplate;


    public PostRepo(
            @Qualifier("client1SqlSessionTemplate") SqlSessionTemplate client1SqlSessionTemplate,
            @Qualifier("client2SqlSessionTemplate") SqlSessionTemplate client2SqlSessionTemplate) {
        this.client1SqlSessionTemplate = client1SqlSessionTemplate;
        this.client2SqlSessionTemplate = client2SqlSessionTemplate;
    }

    private final String namespace = "com.cnc.rating.mybatis.PostMapper.";

    public List<Post> getAllPost_Client1() {
        return client1SqlSessionTemplate.selectList(namespace + "selectAll");
    }

    public List<Post> getAllPost_Client2() {
        return client2SqlSessionTemplate.selectList(namespace + "selectAll");
    }

    public List<Post> addPost_Client1(Post post) {
        return client1SqlSessionTemplate.selectList(namespace + "selectAll", post);
    }

}
