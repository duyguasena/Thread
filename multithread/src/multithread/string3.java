package multithread;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class string3 extends Thread{

	
	private String message;
	private List<Character> names;
	
	private static Lock lock=new ReentrantLock();
	
	public string3(String message,List<Character>names)
	{
		this.message=message;
		this.names=names;
		
	}
	
	
	@Override
	public void run()   //start methodu ile çalıştır
	{
		
		
		try 
		{
			lock.lock();	//kilitledim
			System.out.println("names acquired by "+Thread.currentThread().getName());
					for(int i=0;i<message.length();i++)
					{
						
						names.add(message.charAt(i));                 //characterleri tek tek allisteye ekle 
						System.out.print(message.charAt(i)+"-");
						Thread.sleep(1000);
					}
				
				
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
		
		finally 
		{
			System.out.println("lock unloced by "+Thread.currentThread().getName());
			lock.unlock(); //kilidi açtım
		}
	}
		
		

	

}

