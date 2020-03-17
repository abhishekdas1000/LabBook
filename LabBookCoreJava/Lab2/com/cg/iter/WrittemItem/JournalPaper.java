package com.cg.iter.WrittemItem;

public class JournalPaper extends WrittenItem{
	private int publishYear;

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public JournalPaper() {
		super();
	}

	public JournalPaper(int id, String title, int numberofcopies,String author) {
		super(id, title, numberofcopies,author);
	}
	public JournalPaper(int id, String title, int numberofcopies,String author,int publishYear) {
		super(id, title, numberofcopies,author);
		this.publishYear=publishYear;
	}
	
	public String toString(){
		return super.toString()+" Year published: "+ publishYear;
	}
	
	public int getId(){
		return super.getId();
	}
	
	public String title(){
		return super.getTitle();
	}
	
	public int getNumberofcopies(){
		return super.getNumberofcopies();
	}
	
	public String getAuthor(){
		return super.getAuthor();
	}
	
	public void print(){
		System.out.println("Information about the journal paper: ");
		System.out.println("Year published: "+ publishYear);
		super.print();
		
	}
	
	public void checkIn(){
		  super.checkIn();
	}
	
	public void checkOut(){
		  super.checkOut();
	}
	
	public void addItem(){
		super.addItem();
	}
	
	
}
