package com.cg.iter.main;
import com.cg.iter.MediaItem.*;
import com.cg.iter.WrittemItem.*;

public class itemsMain {

	public static void main(String[] args) {
		Book b = new Book(1,"One Piece",3);
		b.print();
		JournalPaper jp = new JournalPaper(2,"Seven deadly sins",7,"aston");
		jp.print();
		Cd c = new Cd(1,"One Piece",3, 10);
		c.print();
		Video v = new Video(1,"One Piece",3, 0);
		v.print();
	}

}
