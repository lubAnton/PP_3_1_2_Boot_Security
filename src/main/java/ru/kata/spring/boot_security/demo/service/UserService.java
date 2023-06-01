package ru.kata.spring.boot_security.demo.service;





import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    void save(User user);
    User getUserInfo(int id);
    void editUser(User user);
    void deleteUser(int id);

}