package com.telusko.app.servive.impl;

import com.telusko.app.model.User;

public interface TransactionInterface 
{
	void generateRandomTransaction();
	//void calculateCreditPoints();
	//void generateRandomTransaction(User u);
	//void calculateCreditPoints(int id, int randomAmount);
	void calculateCreditPoints(User user, int randomAmount);
}
