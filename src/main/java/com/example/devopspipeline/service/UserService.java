package com.example.devopspipeline.service;

import com.example.devopspipeline.api.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"user1", 30, "user1@mail.com");
        User user2 = new User(2,"user2", 21, "user2@mail.com");
        User user3 = new User(3,"user3", 45, "user3@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
