package histoire;
import personnages.*;
public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "the", 20);
		Commercant chonin = new Commercant("Chonin", "the", 20);
		Commercant kumi = new Commercant("Kumi", "the", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong",0);
		Ronin roro = new Ronin("Roro", "shochu", 60,1);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80,1);
		
		marco.faireConnaissanceAvec(roro);
        marco.faireConnaissanceAvec(yaku);
        marco.faireConnaissanceAvec(chonin);
        marco.faireConnaissanceAvec(kumi);
        
        marco.listerConnaissance();
        roro.listerConnaissance();
        yaku.listerConnaissance();
        
        
        akimoto.faireConnaissanceAvec(marco);
        akimoto.listerConnaissance();
        akimoto.boire("thé");



		}

}