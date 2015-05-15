package it.sp4te.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LettoreSequenze {

	public Signal segnale = new Signal(new Complex[1000000]);

	public void leggiFile(File file) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(file);
		int i = 0;
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			String[] parts = string.split("\\t");
			segnale.values[i] = new Complex(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]));
			i++;
		}
		for (int j=0; j < segnale.getLength() && segnale.values[j] != null; j++){
			System.out.println(segnale.values[j].pRe);
			System.out.println(segnale.values[j].pImm);
		}
		scanner.close();
	}
	
	public static void main (String[] args) throws FileNotFoundException, IOException{
		
		File file = new File("/home/marco/Scrivania/ciao");
		LettoreSequenze l = new LettoreSequenze();
		l.leggiFile(file);
	}



}
