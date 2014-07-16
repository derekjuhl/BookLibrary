package com.spconger.MediaCollection;

import java.util.ArrayList;

public class BookLibrary implements Manage{

	private ArrayList<Item> books;
	
	public BookLibrary(){
		books = new ArrayList<Item>();
	}
	
	@Override
	public void addItem(Item i) {
		books.add(i);
		
	}

	@Override
	public void editItem(Item i) {
		for(Item b: books){
			if (b.getTitle().equals(i.getTitle())){
				books.remove(b);
				books.add(i);
			}
		}
		
	}

	@Override
	public void deleteItem(Item i) {
		for(Item b: books){
			if (b.getTitle().equals(i.getTitle())){
				books.remove(b);
				
			}
		}
		
	}

	@Override
	public Item getItem(String name) {
		Item it = null;
		for(Item b: books){
			if (b.getTitle().equals(name)){
				it=b;
			}
		}
		return it;
	}

	@Override
	public ArrayList<Item> getItems() {
		
		return books;
	}

}
