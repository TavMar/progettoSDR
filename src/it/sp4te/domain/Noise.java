package it.sp4te.domain;
import java.util.Random;

public class Noise {
	private double varianza;
	private int length;
	private double[] parteReale;
	private double[]parteImmaginaria;
	private double pot_rumore;
	
	public Noise(double snr, int length) {
	Random campione = null;
	double snr_linearizzato = Math.pow(10, (snr/10));
	this.pot_rumore = (1/snr_linearizzato);
	this.length = length;
	this.parteReale = new double[length];
	for (int i = 0; i < this.length; i++) {
	campione = new Random();
	parteReale[i] = campione.nextGaussian() *
	Math.sqrt(pot_rumore/2);
	}
	this.parteImmaginaria = new double[length];
	for (int i = 0; i < this.length; i++) {
	campione = new Random();
	parteImmaginaria[i] = campione.nextGaussian() *
	Math.sqrt(pot_rumore/2);
	}
	}
	
}
