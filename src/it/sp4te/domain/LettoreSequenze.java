package it.sp4te.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LettoreSequenze {
	
	public Signal segnale;

	public Signal leggiFile(File file) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\t");
			while (scanner.hasNextLine()) {
				
        }
        return null;
    }

	

}
