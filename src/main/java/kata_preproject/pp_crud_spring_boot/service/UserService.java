package kata_preproject.pp_crud_spring_boot.service;

import kata_preproject.pp_crud_spring_boot.models.User;

import java.util.List;

public interface UserService {

    User findById (Long id);
    List<User> userList(int number);

    void save(User user);

    void delete(Long id);

    void update(Long id, User user);
}
