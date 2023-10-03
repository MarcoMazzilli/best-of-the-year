package org.java.pojo;

public class Movie {
	
	private String name;
	private int id;
	
	public Movie(String name,int id) {
		
		setName(name);
		setId(id);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {

		return getName();
	}

}
