/**
 * Classe che modella i segnali nel discreto
 * @author Antonio Tedeschi
 *
 */

package it.sp4te.domain;

public class Signal {
	
	public Complex[] values;

	public Signal(Complex[] values) {
		super();
		this.values = values;
	}

	public Complex[] getValues() {
		return values;
	}
	
	public int getLength(){
		return this.values.length;
	}

	public void setValues(Complex[] values) {
		this.values = values;
	}

	public double getEnergia(){
		double e=0;
			for(int i=0; i<this.getLength(); i++){
				e = e+ Math.pow((this.values[i]).abs(), 2);
			}
		return e/this.getLength();
	}
	
}