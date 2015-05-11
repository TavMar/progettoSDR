/**
 * Classe che modella i segnali nel discreto
 * @author Antonio Tedeschi
 *
 */

package it.sp4te.domain;

import java.util.Arrays;

public class Signal {

	@Override
	public String toString() {
		return "Signal [length=" + length + ", reale=" + Arrays.toString(reale) + ", immaginaria="
				+ Arrays.toString(immaginaria) + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double[] getReale() {
		return reale;
	}

	public void setReale(double[] reale) {
		this.reale = reale;
	}

	public double[] getImmaginaria() {
		return immaginaria;
	}

	public void setImmaginaria(double[] immaginaria) {
		this.immaginaria = immaginaria;
	}

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
