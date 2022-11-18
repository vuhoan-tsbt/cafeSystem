package com.example.tmdt.repository;

import com.example.tmdt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Integer, Role> {

    public Set<Role> findByName(String name);
}
