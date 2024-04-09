package personnages;

public class Humain {
	private String  nom;
	private String boissonfavorite;
	private int argent;
	protected String[] memoire = new String[30];
	protected int nbConnaissance = 0;
	
	
	public Humain(String nom ,String boissonfavorite , int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	public void listerConnaissance() {
        System.out.println( nom +" :" + "Je connais beacoup de monde dont :");
        for (int i = 0; i < nbConnaissance; i++) {
            System.out.println("- " + memoire[i]);
        }
    }
	
	private void repondre(Humain humain) {
		this.direBonjour();
		memoriser(humain);
		
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance < memoire.length){
            memoire[nbConnaissance] = humain.nom;
            nbConnaissance++;
		}else {
	        
	        for (int i = 0; i < memoire.length - 1; i++) {
	            memoire[i] = memoire[i + 1];
	        }
	       
	        memoire[memoire.length-1] = humain.nom;
	    }
            		
	}

	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+ boissonfavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonfavorite+"! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+ prix+ "sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux pas m'offrir un "+bien+" à "+ prix+ "sous");
		}
	}
}