package it.sp4te.domain;

import java.io.File;

public class Main {

	public static void main (String[] args) throws Exception{
		double pDetection;
		
		File file = new File("C:\\Users\\Stampa Etichette\\Desktop\\Sequenza_1\\"
				+ "output_1.dat");
		LettoreSequenze l = new LettoreSequenze();
		Signal s = l.leggiFile(file);
		
		IpotesiH0 h0 = new IpotesiH0();
		double soglia = h0.calcolaSoglie(s);
		System.out.print("soglia " + soglia);
		
		IpotesiH1 h1=new IpotesiH1();
		pDetection= h1.getProbabilitaDetection(s, soglia);
		System.out.println("Probabilita'  di Detection " + pDetection);		
		
	}
}
