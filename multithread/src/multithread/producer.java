package multithread;

import java.util.ArrayList;
import java.util.Random;



public class producer extends Thread{
	
	private int maxSize=3;
	private ArrayList<String> message=new ArrayList<>();
	
	private String[] sentences= {"sizi tanıyabilir miyiz","ismim a öğrenciyim","hazır mısınız başlayalım mı","başlayalım","öğretmen teacher muallim"};

	
	@Override
	public void run() 
	{
		
	try
	{
		while(true) //sürekli data üretiyor
		{
		     sunucu();
		}
	}
	catch(Exception e)
	{
		System.out.println("exception:"+e.getMessage());
	}
	}


	public synchronized void  sunucu() throws InterruptedException 
	{
		Random r=new Random();
		String data=sentences[r.nextInt(5)];
		
		System.out.println("------------------------------------");
		System.out.println(currentThread().getName()+" producer data \n"+data);
		System.out.println("------------------------------------");
	
		message.add(data);
		
		while(message.size()==maxSize)          //ürettiğin veri sayısı maxsize ise bekle
		{
			
			wait();                              //wait methodu çağrıldı
		}
		
		notify();                                 //ben bekliyorum sen çalış diyor
	
		
	}
	
	public synchronized  String yarışmacı() throws InterruptedException
	{
		notify();                                 //haber veren anahtar sözcük
		while(message.isEmpty())                  //veri yoksa bekle
		{
			wait();
		}
		
		String data=message.get(0);
		message.remove(data);                      //kuyruktan kaldır
		System.out.println(Thread.currentThread().getName()+"consume "+data);
	
		return data;
	}
	
	
	
	
	
}
