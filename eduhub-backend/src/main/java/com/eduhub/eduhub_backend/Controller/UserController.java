package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    static List<User>users =new ArrayList<User>();
    static{
        users.add(new User(1,"John","john"));
        users.add(new User(2,"Mary","mary"));
        users.add(new User(3,"Jane","jane"));
        users.add(new User(4,"Joe","joe"));
        users.add(new User(5,"Doe","doe"));
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(users);
    }
    @
}
