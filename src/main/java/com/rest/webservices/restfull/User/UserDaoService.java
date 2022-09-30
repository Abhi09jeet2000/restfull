package com.rest.webservices.restfull.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int countUser = 0;

    static{
        users.add(new User(++countUser,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(++countUser,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++countUser,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++countUser);
        users.add(user);
        return user;
    }

    public void deleteByID(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
        // return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
