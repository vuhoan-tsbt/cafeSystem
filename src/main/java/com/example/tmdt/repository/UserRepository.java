package com.example.tmdt.repository;


import com.example.tmdt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Integer, User> {

    public User findByEmail(String email);
    public boolean existsByEmail(String email);

}
