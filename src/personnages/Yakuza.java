package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan, int reputation ) {
		super(nom, boissonfavorite, argent);
		this.clan = clan;
		this.reputation=reputation=0;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		parler("J�ai piqu� les "+ victime.getArgent()+" sous de "+ victime.getArgent()+", ce qui me fait "+getArgent()+"sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		reputation-=1;
		parler("J�ai perdu mon duel et mes "+getArgent()+" sous, snif... J'ai d�shonor� le clan de "+clan);
		return getArgent();
	}
	
	public void gagner (int gain) {
		reputation+=1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+clan +"?");
	}
}