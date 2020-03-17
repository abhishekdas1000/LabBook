package com.cg.bbsr;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		try {
			fr = new FileReader("source.txt");
			fw = new FileWriter("target.txt");
			CopyDataThread copyDataThread=new CopyDataThread(fr,fw);
			copyDataThread.start();
		} catch (IOException e) {}

		
	}

}
