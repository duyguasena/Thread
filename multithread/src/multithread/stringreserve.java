package multithread;

import java.util.List;

public class stringreserve extends Thread{

	
	private String message;
	private List<Character> names;
	
	public stringreserve(String message,List<Character>names)
	{
		this.message=message;
		this.names=names;
		
	}
	
	
	@Override
	public void run()   //start methodu ile çalıştır
	{
		
		
		try 
		{
				synchronized (names) 
				{
					for(int i=0;i<message.length();i++)
					{
						
						names.add(message.charAt(i));                 //characterleri tek tek allisteye ekle 
						System.out.print(message.charAt(i)+"-");
						Thread.sleep(1000);
					}
				}
				
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}
		
		

	

}
