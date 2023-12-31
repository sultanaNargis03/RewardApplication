package com.telusko.app.servive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.telusko.app.model.User;
import com.telusko.app.servive.impl.UserServiceInterface;

public class UserService implements UserServiceInterface
{
	List<User> user;
	Map<String, List<String>> rewards;
	public UserService(List<User> user, Map<String, List<String>> rewards) 
	{
		this.user=user;
		this.rewards=rewards;
	}

	@Override
	public User login(int id, String pwd) 
	{
		User currentUser = null;
		for(User u:user)
		{
			if(u.getId().equals(id)&&u.getPassword().equals(pwd))
			{
				
					//System.out.println(u.getName()+" Total credit points : "+u.getPoints());
				 currentUser=u;					
			}
		}
		
		return currentUser;
		
	}

	@Override
	public void showCreditPoints(User currentUser) 
	{
		
		System.out.println("Total credit points earned by "+currentUser.getName()+" : "+currentUser.getPoints());
	}

	@Override
	public void redemRewards(User currentUser,String reward) 
	{
		int productPoints=pointsRequired(reward);
		
			if(currentUser.getPoints()>=productPoints)
			{
				System.out.println(generateRandomCouponId()+" coupon ggenerated for "+currentUser.getName()+" to redeem "+reward);
				currentUser.setPoints(currentUser.getPoints()-productPoints);
				System.out.println("available points after redemption: "+currentUser.getPoints());
				
			}
			else
			{
				System.out.println(currentUser.getName() + " does not have enough points to redeem "+reward);
			}
		
		
	}
	 public String generateRandomCouponId() {
	        // Generate a random alphanumeric coupon ID
	        int length = 8;
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder couponId = new StringBuilder();
	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            couponId.append(characters.charAt(random.nextInt(characters.length())));
	        }

	        return couponId.toString();
	    }
	public int pointsRequired(String product)
	{
		
		switch(product.toLowerCase())
		{
			case "laptop","adventure tour":
					return 100_000;
			case "phone","java":return 150_000;
			case "earbuds","headphone","data structure":return 100_000;
			case "Travel Voucher":return 80_000;
			case "Vacation Package","React":return 50_000;
			case "hibernate":return 10_000;
			case "watch":return 1000;
			default :return 0;	
		}
	}
	
}
