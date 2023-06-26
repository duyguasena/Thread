package multithread;

import java.util.List;

public class stringreserve extends Thread{                                          //thread oluşturuldu

	private String message;                                                         //kelimemiz tanımlandı
	private List<Character> names;                                                  //character tutan listemiz tanımlandı
	
	public stringreserve(String message,List<Character>names)                       //constructor oluşturuldu
	{
		this.message=message;                                                       //atamalar yapıldı
		this.names=names;
	}
	
	@Override
	public void run()                                                                 //start methodu ile çalıştır
	{
		try 
		{
				synchronized (names)               //join kullanmıyorsak eğer threadler arası ortak olan şey senkronize edilir ,sırayla çalıştırır
				{
					for(int i=0;i<message.length();i++)                               //kelimenin karakterini dolaşıyoruz
					{
						names.add(message.charAt(i));                                //characterleri tek tek al listeye ekle 
						System.out.print(message.charAt(i)+"-");                     //ekranda görelim
						Thread.sleep(1000);
					}
				}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
		
}
