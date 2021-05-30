package org.main;


import org.base.BaseClass;
import org.locator.LoginPage;
import org.locator.SearchHotel;

public class MainClass extends BaseClass{
	public static void main(String[] args) {
		
		BaseClass base = new BaseClass();
		base.getDriver();
		base.launchUrl("http://adactinhotelapp.com/index.php ");
		LoginPage lp = new LoginPage();
		base.enterText(lp.getTxtUserName(), "thoma717");
		base.enterText(lp.getTxtPassword(), "aeZioZuZ");
		base.btnClick(lp.getBtnLogin());

		SearchHotel searchHotel = new SearchHotel();
		base.selectByVisibleText(searchHotel.getSelectHotel(), "Melbourne");
		base.selectByVisibleText(searchHotel.getSelectHotel(), "Hotel Hervey");
		base.selectByVisibleText(searchHotel.getSelectRoomType(), "Deluxe");
		base.selectByVisibleText(searchHotel.getSelectRoomNos(), "5 - Five");
		base.enterText(searchHotel.getSelectCheckInDate(), "17/05/2021");
		base.enterText(searchHotel.getSelectCheckOutDate(), "19/05/2021");
		base.selectByVisibleText(searchHotel.getSelectAdultNos(), "2 - Two");
		base.selectByVisibleText(searchHotel.getSelectChildNos(), "0 - None");
		//base.btnClick(searchHotel.getBtnSubmit());
		
		System.out.println("Sample update");
	
	
	}
	
}