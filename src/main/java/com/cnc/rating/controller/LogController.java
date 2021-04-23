package com.cnc.rating.controller;

import com.cnc.rating.repository.DatabaseContextHolder;
import com.cnc.rating.repository.DatabaseType;
import com.cnc.rating.repository.Post;
import com.cnc.rating.repository.PostRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LogController {

    private final PostRepository postRepository;

    @GetMapping("/")
    public void test() throws InterruptedException {
        log.info("test");
        long beforeTime = System.currentTimeMillis();

        Thread.sleep(3000);
        long afterTime = System.currentTimeMillis();

        log.info(String.valueOf(afterTime-beforeTime));
    }

    @GetMapping("/test/{type}")
    public Iterable<Post> getTest(@PathVariable String type) {
        switch (type) {
            case "a":
                DatabaseContextHolder.setCurrentDb(DatabaseType.A);
                break;
            case "b":
                DatabaseContextHolder.setCurrentDb(DatabaseType.B);
                break;
        }
        return postRepository.findAll();
    }
//    @GetMapping("/init-data")
//    @ResponseBody
//    public String initialData() {
//        String name = "main - " + (new Random()).nextInt();
//        postRepository.save(new Post("Main DB"));
//        DBContextHolder.setCurrentDb(DBTypeEnum.CLIENT_A);
//        postRepository.save(new Post("Client A DB"));
//        DBContextHolder.setCurrentDb(DBTypeEnum.CLIENT_B);
//        postRepository.save(new Post("Client B DB"));
//        return "Success!";
//    }

}
