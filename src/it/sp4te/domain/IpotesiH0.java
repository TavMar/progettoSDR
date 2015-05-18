package it.sp4te.domain;


public class IpotesiH0 {

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
		}
		soglia = new Soglia(1.0/(double)prove);
		return soglia.calcolaSoglia(z);
	}

}
