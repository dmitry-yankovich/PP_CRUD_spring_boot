package kata_preproject.pp_crud_spring_boot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kata_preproject.pp_crud_spring_boot.dao.UserDao;
import kata_preproject.pp_crud_spring_boot.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById (Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> userList(int number) {

        return userDao.userList(number);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
        userDao.update(id, user);
    }
}
