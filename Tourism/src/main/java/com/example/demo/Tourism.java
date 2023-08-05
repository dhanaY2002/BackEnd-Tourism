package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourism {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	private String importance;
	
	@Column(length=1000000)
	private byte[] image;
	
	
	public Tourism() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tourism(int id,String name,String location,String importance,
			byte[] image)
	{
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.importance = importance;
		this.image = image;
	}
	public Tourism( String name, String location, String importance,byte[] image) 
	{
		super();
		this.name = name;
		this.location = location;
		this.importance = importance;
		this.image = image;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
}