package it.sp4te.domain;

public class ipotesiH0 {

	public double calcolaSoglie(Signal s) throws Exception{
		
		double snr = 1/(1-s.getEnergia());
		int q = s.getLength();
		int prove = 1000;
		Noise[] rumori = new Noise[q];
		double[] z = new double[q];
		Soglia soglia;
	
			for(int i=0; i<prove; i++)
				rumori[i] = new Noise(snr,q);
			for(int i=0; i<prove; i++)
				z[i]=rumori[i].getSegnale().getEnergia();
			soglia = new Soglia(1/prove);
			return soglia.calcolaSoglia(z);
	}
}
