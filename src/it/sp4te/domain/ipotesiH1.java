package it.sp4te.domain;

import java.io.File;
import java.util.Arrays;


public class ipotesiH1 {

	public static void main (String[] args) throws Exception{
		int numeroSuccessi = 0;
		double pDetection = 0;
		File file = new File("/home/marco/Scrivania/output_1.dat");
		LettoreSequenze l = new LettoreSequenze();
		Signal s = l.leggiFile(file);
		ipotesiH0 ciao = new ipotesiH0();
		double soglia = ciao.calcolaSoglie(s);
		Signal blocco;
		double[] energie = new double[1000];
		for(int i=0; i<1000; i++){
			blocco = new Signal(Arrays.copyOfRange(s.values, i*1000, (i*1000)+999));
			energie[i] = blocco.getEnergia();
			if(energie[i] < soglia)
				numeroSuccessi ++;
			}
		pDetection = numeroSuccessi/1000D;
		System.out.println("Soglia " + soglia);
		System.out.println("Probabilità di Detection " + pDetection);
	}
}
