package main;

import java.util.Scanner;   //import importa classi che ha scritto qualcunaltro

public class Walecome {
		public static void main(String[] args) { //posso aggiungerlo senza scriverlo spuntando la spunta quando creo la class
			
			int z=0;
			
			System.out.println("Benvenuti sasso sesso");
			//System.out.println(args[0]); ti da errore di di esecuzione 
			Scanner scanner = new Scanner(System.in);  
			
			System.out.println("Inserisci il tuo cane: ");
			
			String nome=scanner.nextLine();
			
			scanner.close();
			
			System.out.println("Benvenuto vecchio, il tuo cane si chiamo: "+nome);
			
			Bike bike1= new Bike();//creo variabile di tipo bike e gli assegno un puntatore che punta al tipo di variabile 
			
			Bike bike2= new Bike();
			
			bike2=bike1;
			bike1.changeGear(100);
			//bike1.setCadence(200);
			//System.out.println(bike1.getGear);
			int valoreRitornato = bike1.changeGear(100);
			bike1.printCurrent();
			String nuovoMessaggio= new String("CIao sas; ");
			String messaggioBenvenuto= new String("CIao sas anto benvenuto; ");
			String stringConcatenata= nuovoMessaggio+messaggioBenvenuto;
			bike1.changeCadence(2000);
			bike1.printCurrent();
			System.out.println(stringConcatenata);
			System.out.println("fine ");
		}

}
