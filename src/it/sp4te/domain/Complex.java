package it.sp4te.domain;

public class Complex {
	
	public double pRe;
	public double pImm;
	
	public Complex(double pRe, double pImm) {
		super();
		this.pRe = pRe;
		this.pImm = pImm;
	}

	public double getpRe() {
		return pRe;
	}

	public void setpRe(double pRe) {
		this.pRe = pRe;
	}

	public double getpImm() {
		return pImm;
	}

	public void setpImm(double pImm) {
		this.pImm = pImm;
	}
	
	//Metodi Complessi
	
	public void complessoCon() {
		this.pImm= -this.pImm;	
	}
	
	public static Complex sum(Complex c1, Complex c2){
		double paRe = c1.getpRe() + c2.getpRe();
		double paImm= c1.getpImm() + c2.getpImm();
		return new Complex (paRe, paImm);
	}
	
	public static Complex product(Complex c1, Complex c2){
		double paRe = (c1.getpRe() * c2.getpRe()) - (c1.getpImm() * c2.getpImm());
		double paImm= (c2.getpRe() * c1.getpImm()) + (c1.getpRe() * c2.getpImm());
		return new Complex (paRe, paImm);
	}
	
	public double phase() {
		return Math.atan2(this.pImm, this.pRe);
	}
	
	public double abs(){
		return Math.hypot(this.pRe, this.pImm);
	}
	

}