package it.sp4te.domain;

import java.io.File;
import java.util.Arrays;


public class IpotesiH1 {

	public static void main (String[] args) throws Exception{
		int numeroSuccessi = 0;
		double pDetection = 0;
		File file = new File("/home/marco/Scrivania/output_1.dat");
		LettoreSequenze l = new LettoreSequenze();
		Signal s = l.leggiFile(file);
		IpotesiH0 ciao = new IpotesiH0();
		double soglia = ciao.calcolaSoglie(s);
		Signal blocco;
		for(int i=0; i<1000000; i=i+1000){
			blocco = new Signal(Arrays.copyOfRange(s.values, i, i+999));
			if (blocco.getEnergia() < soglia)
				numeroSuccessi ++;
			}
		pDetection = numeroSuccessi/1000D;
		System.out.println("Soglia " + soglia);
		System.out.println("Probabilità di Detection " + pDetection);
	}
}
