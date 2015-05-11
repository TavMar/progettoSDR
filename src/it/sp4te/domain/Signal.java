/**
 * Classe che modella i segnali nel discreto
 * @author Antonio Tedeschi
 *
 */

package it.sp4te.domain;

public class Signal {

	public int length;
	public double[] reale;
	public double[] immaginaria;

	public Signal(int length) {
		this.length = length;
		this.reale = new double[length];
		this.immaginaria = new double[length];
		for (int i = 0; i < this.length; i++) {
			double v = Math.random();
			if (v < 0.5)
				this.reale[i] = 1/Math.sqrt(2);
			else
				this.reale[i] = -1/Math.sqrt(2);
			double p = Math.random();
			if (p < 0.5)
				this.immaginaria[i] = 1/Math.sqrt(2);
			else
				this.immaginaria[i] = -1/Math.sqrt(2);
		}
	}

}
