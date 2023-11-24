package com.telusko.app.servive.impl;

import java.util.List;

import com.telusko.app.model.User;

public interface UserServiceInterface 
{
	User login(int id, String pwd);
	void showCreditPoints(User currentUser);
	void redemRewards(User currentUser, String category);	
}
