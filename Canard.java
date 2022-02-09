
public class Canard implements Ivole,Ikwak,Iaffiche
{
	private Ivole first_at;// a faire dans le main = new VoleB();
	private Ikwak second_at;// = new KwakF();
	private Iaffiche third_at;// = new AfficheDeDos();
	
	public Canard(Ivole vole, Ikwak kwak, Iaffiche affiche) {
		this.first_at = vole;
		this.second_at = kwak;
		this.third_at = affiche;
	}
	public void vol() {
		this.first_at.vol();
	}
	public void kwak() {
		this.second_at.kwak();
	}
	public void affiche() {
		this.third_at.affiche();
	}
}
