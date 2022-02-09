
public class ConstructCanards  {

	public static void main(String[] args) {
		Ivole aile= new VoleB();
		Ikwak coin = new KwakF();
		Iaffiche ecriture = new AfficheDeDos();
		Canard mon_premier_canard = new Canard(aile,coin,ecriture);
		
		Ivole aile2 = new VolHaut();
		Iaffiche ecriture2 = new AfficheDeFace();
		Ikwak coin2 = new KwakB();
		Canard mon_second_canard = new Canard(aile2,coin,ecriture2);
		Canard mon_troisiem_canard = new Canard(aile2,coin2,ecriture2);
		mon_premier_canard.vol();

	}

}
