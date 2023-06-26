package multithread;

import java.util.ArrayList;
import java.util.Random;



public class producer extends Thread{
	
	private int maxSize=3;                                                             //max 3 veri üretsin
	private ArrayList<String> message=new ArrayList<>();                              //veriyi arrayliste koyalım
	
	private String[] sentences= {"İsmin nedir? What is your name? İsmi şuma chiest?","Naılsın? How are you? Hali şuma çitori?","Nerelisin? Where are you from? Şuma ehli koca hesti?","Yürümek insanı mutlu eder Walking makes people happy Piyadeyi ruyi merdum hoşhali mikoned","Öğretmen Teacher Muallim"};

	
	@Override
	public void run() 
	{
		try
		{
			while(true)                                                                 //sürekli data üretiyor
			{
			     sunucu();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
	}


	public synchronized void  sunucu() throws InterruptedException                       //sıralı çalışması için senkronize edilidi
	{
		Random r=new Random();                                                           //random veri seç
		String data=sentences[r.nextInt(5)];
		
		System.out.println("------------------------------------");
		System.out.println(currentThread().getName()+" producer data \n"+data);
		System.out.println("------------------------------------");
	
		message.add(data);                                                              //üretilen datayı listeye ekledik
		
		while(message.size()==maxSize)                                                     //ürettiğin veri sayısı maxsize ise bekle
		{
			System.out.println("Queue is full");
			wait();                                                                 //wait methodu çağrıldı
		}
		notify();                                                                    //ben bekliyorum sen çalış diyor
	}
	
	public synchronized  String consume() throws InterruptedException
	{
		notify();                                                                   //haber veren anahtar sözcük
		while(message.isEmpty())                                                       //veri yoksa bekle
		{
			wait();
		}
		
		String data=message.get(0);                                                     //ilk datayı al
		message.remove(data);                                                            //kuyruktan kaldır
		System.out.println(Thread.currentThread().getName()+"consume "+data);
	
		return data;
	}
}
