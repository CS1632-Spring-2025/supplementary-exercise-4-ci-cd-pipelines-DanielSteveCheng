package edu.pitt.cs;

import java.io.PrintStream;

public class CatImpl implements Cat {

	int id;
	String name;
	boolean rented = false;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		this.rented = true;

	}

	public void returnCat() {
		this.rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}

}