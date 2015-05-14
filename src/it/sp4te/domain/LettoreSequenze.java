package it.sp4te.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LettoreSequenze {

	public Signal segnale;

	public void leggiFile(File file) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(file);
		int i = 0;
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			String[] parts = string.split("-");
			segnale.values[i].pRe = Double.parseDouble(parts[0]);
			segnale.values[i].pImm = Double.parseDouble(parts[1]); 
			i++;
		}
		for (int j=0; j < segnale.getLength(); j++){
			System.out.println(segnale.values[j].pRe);
			System.out.println(segnale.values[j].pImm);
		}
	}
	
	public static void main (String[] args){
		
		Complex[] valori = null;
		Signal prova = new Signal(valori);
		LettoreSequenze l;
		l.leggiFile("/home/marco/Scrivania/ciao.txt");
	}



}
