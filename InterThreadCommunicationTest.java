public class InterThreadCommunicationTest {
	public static void main(String[] args) {
		Farm food = new Farm("Wheat");
		Sold soldObj = new Sold(food);
		Eater eaterObj = new Eater(food);
		soldObj.start();
		eaterObj.start();
	}
}

interface Selling {	void serve(); }
interface Eating  {	void eat();   }
class Farm implements Selling, Eating
{
	String cereals;
	boolean isServed=false;
	
	Farm (String x)
	{
		cereals = x ; 
	}
	
	public synchronized void serve() {
		if(isServed==false) 
		{
			System.out.println("Sold: selling : "+cereals);
			isServed= true;
			System.out.println("Sold: Selling  : "+cereals);
			notify();
		}
	}
	public synchronized void eat() {
		if(isServed==false)  
		{
			System.out.println("Eater : Awaiting for the Server to serve the food : "+cereals);
			try {
				wait(); 
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		System.out.println("Eater : Thank you for serving the food : "+cereals);
		System.out.println("Eater : Eating  : "+cereals);
		
	}
}
class Sold extends Thread 
{
	Selling cerealsRef;
	
	Sold(Farm x)
	{
		cerealsRef = x;
	}
	
	public void run() {
		
		cerealsRef.serve();
	}
}
class Eater extends Thread 
{
	Eating cerealsRef;
	
	Eater(Farm x) 
	{ 
		cerealsRef = x;
	}
	
	public void run() {
		cerealsRef.eat(); 
		
	}
}