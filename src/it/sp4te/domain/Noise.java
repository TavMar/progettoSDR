package it.sp4te.domain;
import java.util.Random;

public class Noise {
	private int length;
	private Signal n;
	private double pot_rumore;

	public Noise(double snr, int length) {
		Random campione = null;
		double snr_linearizzato = Math.pow(10, (snr/10));
		this.pot_rumore = (1/snr_linearizzato);
		this.length = length;
		this.n=new Signal(new Complex[length]);
		for (int i = 0; i < this.length; i++) {
			campione = new Random();
			n.values[i].pRe = campione.nextGaussian() * Math.sqrt(pot_rumore/2);
			campione = new Random();
			n.values[i].pImm=campione.nextGaussian() * Math.sqrt(pot_rumore/2);
		}
	}
	
	public Signal getSegnale(){
		return this.n;
	}
}