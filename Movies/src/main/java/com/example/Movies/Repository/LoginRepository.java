package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>
{

	Login findByUsername(String username);
}
