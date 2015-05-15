package it.sp4te.domain;

import java.io.File;

public class ipotesiH0 {

	public double calcolaSoglie(Signal s) throws Exception{
		double snr = 10*Math.log10(1/(s.getEnergia()-1.0));
		int q = s.getLength();
		int prove = 1000;
		double[] z = new double[q];
		Soglia soglia;
		Noise rumore;

		for(int i=0; i<prove; i++){
			rumore= new Noise(snr,q);
			z[i]=rumore.getSegnale().getEnergia();
//			System.out.println(z[i]);
		}
		soglia = new Soglia(1.0/(double)prove);
		return soglia.calcolaSoglia(z);
	}

	public static void main (String[] args) throws Exception{
		File file = new File("/home/marco/Scrivania/output_1.dat");
		LettoreSequenze l = new LettoreSequenze();
		Signal s = l.leggiFile(file);
		ipotesiH0 ciao = new ipotesiH0();
		double soglia = ciao.calcolaSoglie(s);
		System.out.print("soglia " + soglia);
	}
}
