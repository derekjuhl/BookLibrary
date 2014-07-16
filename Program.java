package com.spconger.MediaCollection;

import java.util.Scanner;

public class Program {

	BookLibrary library = new BookLibrary();
	
	public static void main(String[] args) {
		Program p = new Program();
		p.addBooks();
		p.getBookbyTitle();
	
	}
	
	private void addBooks(){
		Book b = new Book();
		b.setTitle("The Martian Chronicles");
		b.setAuthor("Ray Bradbury");
		b.setGenre("SciFi");
		b.setPublishYear("1950");
		b.setPrice(4.50);
		library.addItem(b);
		
		Book b1 = new Book();
		b1.setTitle("War and Peace");
		b1.setAuthor("Tolstoy");
		b1.setGenre("Classic");
		b1.setPublishYear("1869");
		b1.setPrice(7.50);
		library.addItem(b1);
		
		Book b2 = new Book();
		b2.setTitle("The Alchemist");
		b2.setAuthor("Paulo Coehlo");
		b2.setGenre("Classic");
		b2.setPublishYear("1988");
		b2.setPrice(7.50);
		library.addItem(b2);
	}
	
	private void getBookbyTitle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a book title");
		String title = scan.nextLine();
		Book b = (Book)library.getItem(title);
		System.out.println(b.getTitle() + "\n" + b.getAuthor() + "\n"
				+ b.getGenre() + "\n" + b.getPublishYear() + "\n" 
				+ b.getPrice());
	}

}
