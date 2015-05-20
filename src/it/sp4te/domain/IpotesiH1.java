package it.sp4te.domain;

import java.util.Arrays;


public class IpotesiH1 {
	
	public double getProbabilitaDetection(Signal s, double soglia) {
		double numeroSuccessi = 0;		
		Signal blocco;
		
		for(int i=0; i<1000000; i=i+1000){
			blocco = new Signal(Arrays.copyOfRange(s.values, i, i+999));

			System.out.println("i " + i + " energia : " + blocco.getEnergia());
			if (blocco.getEnergia() > soglia){

			System.out.println("energia "+ blocco.getEnergia());
			if (blocco.getEnergia() > soglia)

				numeroSuccessi ++;
				System.out.println("i " + i + " energia : " + blocco.getEnergia());
				System.out.println("successi " + numeroSuccessi);

			}
		}
		return (numeroSuccessi/1000.0);
	}
}
