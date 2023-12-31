package com.telusko.app.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor	
public class User
{
	 private Integer id;
	 private String name;
	 private String password;
	 private long points;
	 private long amount;
	 private String giftCards[];
	
	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getPoints() {
		return points;
	}


	public void setPoints(long points) {
		this.points = points;
	}


	public String[] getGiftCards() {
		return giftCards;
	}


	public void setGiftCards(String[] giftCards) {
		this.giftCards = giftCards;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", amount=" + amount + ", giftCards="
				+ Arrays.toString(giftCards) + "]";
	}

	
}
