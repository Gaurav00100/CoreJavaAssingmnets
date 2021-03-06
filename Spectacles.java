import java.util.Scanner;

abstract class Spectacles
{
	private String material;
	private String shape;
	private double price;
	
		Spectacles(){
		System.out.println("user defined spectacles constructor  ");
		}
	
		Spectacles(String mt, String sh, double pr){
		material = mt;
		shape = sh;
		price = pr;
		}
	
		void showSpectaclesDetails() { 
	    System.out.println("Spectacles Material  : "+material);
	   	System.out.println("SPectacles Shape  : "+shape);
	   	System.out.println("Spectacles : "+price);
	   	}
	
		public void wearable() { 
		System.out.println("wide selection of Smart Glasses");
		}
}

		interface PayPrice     //-------------- Interface -------------------
		{
			double payAmount();
			void Pay(double amtTOPay);
		}
		interface refundPrice     //-------------- Interface -------------------
		{
			double refundAmount();
			void Refund(double amtToRefunf);
		}
		

class PowerGlass extends Spectacles implements PayPrice , refundPrice
{
		private float powerRange;
	
		public void wearable() { 
		System.out.println("");
		}
		public void visionCorrection() { 
		System.out.println("helpful in avoiding Computer Vision Syndrome");
		}
	
		PowerGlass(float pg) {
		super(); 
		powerRange = pg;
		}
	
		PowerGlass(String mt, String sh, double pr, float pg) {
		super(mt , sh , pr); 
		powerRange = pg;
		}
	
		void showSpectaclesDetails() { 
		super.showSpectaclesDetails();
    	System.out.println("Spectacles power Range:" +powerRange);
		}
		@Override
		public double payAmount() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public void Pay(double amt) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public double refundAmount() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public void Refund(double amtToRefunf) {
			// TODO Auto-generated method stub
			
		}
	
}

class ReadingGlass extends PowerGlass 
{
	private float glassStrength;
	
		ReadingGlass(String mt, String sh, double pr, float pg, float gs) {
		super(mt , sh , pr , pg);
		glassStrength = gs;
		}
	
		public void VisionCorrection() {
		System.out.println("");
		}
		public void farsightedness() { 
		System.out.println(" helpful in clearing nearby blurred objects");
		}
		
		void showSpectaclesDetails() { 
		super.showSpectaclesDetails(); 
    	System.out.println("Glass Strenth of Spectacles: "+glassStrength);
		}
}

class BifocalGlass extends ReadingGlass{
	
		private float dualLensStrength;
	
		BifocalGlass(String mt, String sh, double pr, float pg, float gs, float duolens) {
		super(mt , sh , pr , pg , gs);
		dualLensStrength = duolens;
		}
		
		public void TwoLensGlass() {
		System.out.println("distance vision half of the lens and near vision at half lens ");
		}
		
		void showSpectaclesDetails() { 
		super.showSpectaclesDetails(); 
	    System.out.println("Strength of dual lens: "+dualLensStrength);
			}
}

/*
class SpectaclesShop
{
		static Spectacles getSpectacles() {
		1
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Choice of Spectacles");
		System.out.println("1. Spectacles ");
		System.out.println("2. Power Glass ");
		System.out.println("3. Reading Glass");
		System.out.println("4. Bifocal Glass");
		
		int choice = scan.nextInt();
		Spectacles s = null;
		switch(choice) { 
			case 1: s = new Spectacles(); 
			break;
			case 2: s = new PowerGlass(); 
			break;
			case 3: s = new ReadingGlass();
			break;
			case 4: s = new BifocalGlass();
			}
		return s;
	}
}          */

 /* class SpectaclesTest {
	 public static void main(String[] args) {
		Spectacles s = SpectaclesShop.getSpectacles(); 
		
		if(s instanceof ReadingGlass) { 
			System.out.println("D is calling Reading Glass");
		}
		else if(s instanceof PowerGlass) { 
			System.out.println("D is calling Power Glass");
		}
		else if (s instanceof Spectacles) {
			System.out.println("D is calling Spectacles");
		}
		
	}
}  */

	class SpectaclesTest{
		public static void main(String arg[]) {
				
			PowerGlass powerglass = new PowerGlass("plastic","oval",800,1.2f);
			powerglass.showSpectaclesDetails();
			powerglass.Pay(800);
		}
		
	}

 	