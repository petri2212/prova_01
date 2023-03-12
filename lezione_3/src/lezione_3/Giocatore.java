package lezione_3;

public class Giocatore {
	//questo è il nome del giocatore
	private String nome;
	//questo è il cognome
	private String Cognome;
	
	private int numerogiocatore;
	
	private final int id; //final, una volta che è stato assegnato un valore a id resta cosi fino alla fine
	private static int COUNTER=0;//static è un contatore della classe non è un attriburo, variabili statiche di solito sono uppercase
	public Giocatore(String n) {//costruttore
		
		nome=n;
		this.id=COUNTER;
		COUNTER++;
	}//da solo il programma ti ritorna il valore e non l'indirizzo di memoria
	
	
	
	public boolean equals(Giocatore other) {
		
		if(this.nome == other.nome) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
