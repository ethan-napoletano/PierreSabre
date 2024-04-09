package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur , String nom, String boissonfavorite, int argent, int honneur) {
		super(nom, boissonfavorite, argent, honneur);
		this.seigneur = seigneur;
		
	}
	
	public String getSeigneur() {
        return seigneur;
    }
	
	@Override
    public void direBonjour() {
        super.direBonjour(); 
        parler("Je suis le samouraï de " + seigneur); 
    }
	
	public void boire(String boisson) {
        parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
        
    }

}
