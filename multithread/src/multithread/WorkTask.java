package multithread;

public class WorkTask implements Runnable{   //interface

	private String taskName;
	private int createdTime;
	
	public WorkTask(String taskName)
	{
		this.taskName=taskName;
	}
	
	
	
	
	
	@Override
	public void run() {
		
		long waitedTime=System.currentTimeMillis();
		
		try 
		{
			System.out.println("deneme");
			Thread.sleep(1000);
			System.out.println(taskName+ "completed by "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}

}
