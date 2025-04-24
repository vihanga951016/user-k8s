package com.example.user.program;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserById(Integer id);

    boolean existsByName(String name);
}
