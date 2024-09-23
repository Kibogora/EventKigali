package com.EventAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventAPI.model.UserAccount;

public interface RepoDao extends JpaRepository<UserAccount, Integer>{

}
