package main;

public class Bike {
	private static Bike bike;//variabile statica esiste sempre
	
	private int gear;
	private int cadence;
	private int speed;
	
	public Bike() {
		speed=150;
	}
	
	/*public getCadence() {
		return cadence;
	}*/  
	//posso usarlo per prendere i valori correnti di un qualcoa 
	
	/*public void setCadence(int cadence) {
	this.cadence= cadence;
}*/  
//setto i valori e basta  
	
	
	public int changeGear(int gear) {//tasto destro su un nome , refactor e ti modifica il nome dappertutt
		if(gear>6) {
			this.gear=6;
		}
		if(gear<0) {
			this.gear=1;
		}
		//this.gear=gear; //attributo di questa classe this.gear è dentro public
		return this.gear;
		
	}
	public void printCurrent() {
		System.out.println("Gear: "+this.gear);
		System.out.println("Cadence: "+this.cadence);
		System.out.println("Speed: "+this.speed);
	}
	public int changeCadence(int cadence) {
		if(cadence>50) {
			this.cadence=6;
		}
		if(cadence<0) {
			this.cadence=1;
		}
		
		return this.cadence;
		
	}
	//solo per uso didattico
	public static Bike createInstance() {//voglio assicurami che ci sia solo una bicicletta, posso cosi rendere privata la classe Bike sopra e cosi posso creare biciclette pubblicamente 
		
		if(bike==null) {
			bike=new Bike();
		}
		return bike;
		
	}
}
