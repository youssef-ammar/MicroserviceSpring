package com.example.demo.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>(20);

    private static Integer idC = 1;
    static {
        users.add(new User(idC, "userN1", LocalDate.now().minusYears(30)));
        users.add(new User(++idC, "userN2", LocalDate.now().minusYears(30)));
        users.add(new User(++idC, "userN3", LocalDate.now().minusYears(30)));

    }

    public List<User> findAll() {

        return users;
    }

    public User findById(Integer id) {

        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
        /*
         * TODO: LEARN MORE ABOUT PREDICATE
         * 
         */
    }

    public User save(User user) {
        user.setId(++idC);
        users.add(user);
        return user;

    }

}
