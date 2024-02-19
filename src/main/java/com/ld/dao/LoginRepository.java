package com.ld.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ld.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

	LoginEntity findByEmail(String email);

}
