package web.service;

import web.model.User;

import java.util.List;


public interface UserService {
    void saveNewUser(User user);

    List<User> getUsersList();

    User findById(long id);

    User updateUser(User user,long id);

    void deleteUser(long id);




}
