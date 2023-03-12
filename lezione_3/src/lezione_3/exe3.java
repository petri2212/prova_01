package lezione_3;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//questa istruzione dichiara due variabili intere di tipo primitivo(nonn sono classi e quindi non offrono metodi), string non è primitivo
		int x =3, y=2;
		if (x==y) {
			System.out.println("le due variabili sono uguali");
		}else {
			System.out.println("le due variabili  sono diverse");
		}
		
		
		
		Integer j,k;
		j=new Integer(2);
		k=new Integer(2);//control e premo sulla classe mi apre la classe
		/*if (j==k) {
			System.out.println("le due variabili j,k sono uguali");
			
		}else {
			System.out.println("le due variabili j,k sono diverse");//esce questo perche sono due classi divere, due puntatori a due classi diverse
		}*/
		if (j.equals(k)) {
			System.out.println("le due variabili j,k sono uguali");
			
		}else {
			System.out.println("le due variabili j,k sono diverse");//esce questo perche sono due classi divere, due puntatori a due classi diverse
		}
		
		Giocatore giocatore1= new Giocatore("Antonia");
		Giocatore giocatore2= new Giocatore("ALbergo");
		//System.out.println(giocatore.toString); quando uso tostring con un metodo allora stampa solo il valore e basta
		System.out.println("stop");
		//array di giocatorei
		Giocatore[] giocatori= new Giocatore[6];
		
		Scanner in=new Scanner(System.in);
		String nextPlayer;
		int index=0;
		do {
			System.out.println("Inserisci nome giocatore");
			String name=in.nextLine();
			giocatori[index]=new Giocatore(name);
			index++;
			
			System.out.println("Vuoi inserire nuovo giocatore");
			nextPlayer=in.nextLine();
			
			
		}while(nextPlayer.equals("true"));

	}

}
