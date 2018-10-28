package yong.lin.service;


import yong.lin.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll() throws Exception;
    User findById(Integer id) throws Exception;
    void updateUser(User user) throws Exception;
}
