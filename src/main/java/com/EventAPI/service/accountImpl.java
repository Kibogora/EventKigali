package com.EventAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventAPI.Dao.RepoDao;
import com.EventAPI.model.UserAccount;

@Service
public class accountImpl implements saveDataApi {

	@Autowired
	public RepoDao daodata;
	
	
	@Override
	public UserAccount createUser(UserAccount useraccount) {
		return daodata.save(useraccount);
	}

}
