package multithread;

import java.util.ArrayList;
import java.util.List;

public class stringmain {

	public static void main(String[] args) throws InterruptedException {
		
		List<Character> list=new ArrayList<>();                                      //liste oluşturuldu
		System.out.println("Old list:"+list.toString());                             //eski liste yazıldı
		
		
		stringreserve obj1=new stringreserve("hello java ",list );                  //nesne ürettik parametreleri verdik
		obj1.start();                                                               //çalıştırdık
		obj1.join();                                                                //önce thread işini bitirsin sonra alt işleme geç
		
		System.out.println("new list:"+list.toString());                            //yeni listeyi ekrana bas                     
		
		
		stringreserve obj2=new stringreserve("world", list);
		obj2.start();
		obj2.join();
		
		
		stringreserve obj3=new stringreserve("linux", list);
		obj3.start();
		//Yöntem1=yukarıda join kullanıp sırayla çalıştırdık
		
		
		
		
		
		
		
		
		
		
		
		
	 //YÖNTEM2=aşağıda senkronize ettiğimiz için sırayla çalıştı	
	stringreserve obj4=new stringreserve("data mining", list);	
	obj4.start();
	
	stringreserve obj5=new stringreserve("weka", list);
	obj5.start();
	
	
	
	
	
	
	
	
	
	//YÖNTEM 3=Lockla kilitleyip açmak
	string3 obj6=new string3("machine learning", list);	
	obj6.setName("My Thread");
	obj6.start();
	
	string3 obj7=new string3("math", list);
	obj7.setName("Your Thread");
	obj7.start();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
