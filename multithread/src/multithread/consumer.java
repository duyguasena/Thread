package multithread;

public class consumer extends Thread{
	
	producer producer;
	
	public consumer(producer producer)
	{
		this.producer=producer;
	}

	public void run()
	{
		try 
		{
			while(true)               //sürekli consume etmeye çalış
			{
				String data=producer.yarışmacı();
				System.out.println(Thread.currentThread().getName()+"consume data \n"+data);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception:"+e.getMessage());
		}
	}
}
