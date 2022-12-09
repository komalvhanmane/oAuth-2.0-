package com.linkcode.userregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcode.userregister.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{

}
