package org.selenium;

public class Main extends Base {

	public static void main(String[] args) throws InterruptedException {
		getDriver();
		
		loadUrl("http://www.adactin.com/HotelApp/");
		
		winmax();
		Login log=new Login();
		
		type(log.getTxtUserName(), "rubysherly");
		type(log.getTxtPassword(), "Ruby@1993");
		loginbutton(log.getBtnLogin()); 
		
		SearchBox sbox=new SearchBox();
		
		type(sbox.getLocation(),"Landon");
		type(sbox.getHotels(),"Hotel Sunshine");
		type(sbox.getRoomType(),"Super Deluxe");
		type(sbox.getNoofRooms(),"3 - Three");
		type(sbox.getCheckinDate(),"18/06/2019");
		type(sbox.getCheckoutDate(),"25/06/2019");
		type(sbox.getAdults(),"2 - Two");
		type(sbox.getChidRoom(),"1 - One");
		loginbutton(sbox.getSubmit());
		Thread.sleep(2000);
		loginbutton(sbox.getSelectradio());
		loginbutton(sbox.getContinue());
		
		Thread.sleep(2000);
		SubClass sub=new SubClass();
		
		type(sub.getFirstname(), "Ramjayakumar");
		type(sub.getLastname(),"Venkatachalam");
		type(sub.getAddress(),"2/169");
		type(sub.getCardno(),"1234567891234567");
		type(sub.getCardType(),"VISA");
		type(sub.getExpMonth(),"May");
		type(sub.getExpDate(),"2019");
		type(sub.getCvv(),"123");
		loginbutton(sub.getBook());
		
		Thread.sleep(4000);
		
		Attri(sub.getOrderno(),"value");
		System.out.println(sub);
		
	}
}
