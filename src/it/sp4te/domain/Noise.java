package it.sp4te.domain;
import java.util.Random;

public class Noise {
	private int length;
	private Signal n = new Signal(new Complex[1000000]);
	private double pot_rumore;

	public Noise(double snr, int length) {
		Random c1 = null;
		Random c2 = null;
		double snr_linearizzato = Math.pow(10, (snr/10));
		this.pot_rumore = (1/snr_linearizzato);
		this.length = length;
		this.n=new Signal(new Complex[length]);
		for (int i = 0; i < this.length; i++) {
			c1 = new Random();
			c2 = new Random();
			n.values[i] = new Complex( c1.nextGaussian() * Math.sqrt(pot_rumore/2),c2.nextGaussian() * Math.sqrt(pot_rumore/2));
		}
	}
	
	public Signal getSegnale(){
		return this.n;
	}
}