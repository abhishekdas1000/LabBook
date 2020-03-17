package com.cg.iter.WrittemItem;

public class Book extends WrittenItem{
	
	public Book(){
		super();
	}
	
	public Book(int id, String title, int Numberofcopies){
		super(id,title, Numberofcopies);
	}
	
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		Book otherBook = (Book) obj;
		return super.equals(otherBook);
	}
	
	public String toString(){
		return super.toString();
	}
	
	public int getId(){
		return super.getId();
	}
	
	public String getTitle(){
		return super.getTitle();
	}
	
	public int getNumberofcopies(){
		return super.getNumberofcopies();
	}
	
	public String getAuthor(){
		return super.getAuthor();
	}
	
	public void print(){
		System.out.println("Information about the book: ");
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
