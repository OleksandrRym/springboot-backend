package net.olerym.springbootbackend.repository;

import net.olerym.springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    Optional<User> findByUsername(String username);
}
