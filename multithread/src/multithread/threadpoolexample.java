package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpoolexample {

	public static void main(String[] args) {
		
		threadpoolexample e=new threadpoolexample();
		e.startthreadpoolexample();

	}

	
	public void startthreadpoolexample()
	{
		ExecutorService executorService=Executors.newFixedThreadPool(3);
	                   //3 ü aynı anda çalışıyor
		WorkTask workobj1=new WorkTask("task1");
		WorkTask workobj2=new WorkTask("task2");
		WorkTask workobj3=new WorkTask("task3");
		WorkTask workobj4=new WorkTask("task4");
		WorkTask workobj5=new WorkTask("task5");
		
		executorService.submit(workobj1);
		executorService.submit(workobj2);
		executorService.submit(workobj3);
		executorService.submit(workobj4);
		executorService.submit(workobj5);
		
		executorService.shutdown();
	}
}
