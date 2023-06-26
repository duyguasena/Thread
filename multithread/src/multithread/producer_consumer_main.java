package multithread;



public class producer_consumer_main {
	
	public static void main(String[] args) {
		producer producerobj=new producer();
		producerobj.setName("producer");
		producerobj.start();
		
		consumer consumerobj=new consumer(producerobj);
		consumerobj.setName("consumer");
		consumerobj.start();
	}
}
