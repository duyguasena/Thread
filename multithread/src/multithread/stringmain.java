package multithread;

import java.util.ArrayList;
import java.util.List;

public class stringmain {

	public static void main(String[] args) throws InterruptedException {
		
		List<Character> list=new ArrayList<>();
//		System.out.println("old list:"+list.toString());
//		
//		
//		stringreserve obj1=new stringreserve("hello java ",list );   //nesne ürettik
//		obj1.start();
//		//obj1.join();                           //sıralı yazılmasını sağlar
//		
//		stringreserve obj2=new stringreserve("world", list);
//		obj2.start();
//		//obj2.join();
//		
//		
//		stringreserve obj3=new stringreserve("linux", list);
//		obj3.start();
//		
//		
//		//System.out.println("new list:"+list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
//		stringreserve obj1=new stringreserve("data mining", list);
//		obj1.start();
//		
//		stringreserve obj2=new stringreserve("weka", list);
//		obj2.start();
		
		
		string3 objfirst=new string3("machine learning", list);
		objfirst.setName("my thread");
		objfirst.start();
		//burda kilitlendi
		
		string3 objsecond=new string3("math", list);
		objsecond.setName("your thread");
		objsecond.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
