package com.cnc.rating.service;

import com.cnc.rating.mybatis.Post;
import com.cnc.rating.repository.PostRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QueryService {

    private final PostRepo postRepo;

    public List<Post> select(String id) {
        switch (getShardDatabase(id)) {
//            case 0 : return postRepo.getAllPost_Client0();
            case 1 : return postRepo.getAllPost_Client1();
            case 2 : return postRepo.getAllPost_Client2();
//            case 3 : return postRepo.getAllPost_Client3();
//            case 4 : return postRepo.getAllPost_Client4();
//            case 5 : return postRepo.getAllPost_Client5();
//            case 6 : return postRepo.getAllPost_Client6();
//            case 7 : return postRepo.getAllPost_Client7();
//            case 8 : return postRepo.getAllPost_Client8();
//            case 9 : return postRepo.getAllPost_Client9();
            default: throw new RuntimeException();
        }
    }

    private int getShardDatabase(String key) {
        return key.charAt(key.length()-1) - '0';
    }
}
