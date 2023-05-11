package kata_preproject.pp_crud_spring_boot.service;

import kata_preproject.pp_crud_spring_boot.dao.UserDao;
import kata_preproject.pp_crud_spring_boot.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class UserService{

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById (Long id) {
        return userDao.findById(id).orElse(null);
    }

    public List<User> userList(int maxLimit) {

        List<User> userList = (List<User>) StreamSupport.stream(userDao.findAll().spliterator(), false);

        return  userList.stream().limit(maxLimit>0 ? maxLimit: userList.size()).collect(Collectors.toList());

    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Transactional
    public void update(Long id, User user) {

        User userToBeUpdated = userDao.findById(id).orElse(null);

        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setEmail(user.getEmail());
    }
}
