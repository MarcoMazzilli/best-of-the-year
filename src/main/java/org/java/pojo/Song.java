package org.java.pojo;

public class Song {
	
	private String name;
	private int id;
	
	public Song(String name,int id) {
		
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
