package kata_preproject.pp_crud_spring_boot.dao;

import kata_preproject.pp_crud_spring_boot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
//public interface UserDao extends JpaRepository<User, Long> {

}
