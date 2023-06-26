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
		
		try 
		{
			System.out.println("Deneme");
			Thread.sleep(1000);
			System.out.println(taskName+ "completed by "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
}
