package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.eban.*;

//Product Entity managed by the ORM
@Entity
public class Product extends Model {

	// Properties
	//Primary key
	@Id
	private Long id;
	private String name;
	private String description;
	private int stock;
	private double price;

	//Default constructor
	public Products(){
	
	}

	//Constructor to initialise object
	public Product(Long id, String name, String description, int stock, double price) {
	this.id = id;
	this.name = name;
	this.description = description;
	this.stock = stock;
	this.price = price;
	}

	public Long getId(){
	return id;
}

	public void setId(Long id){
	this.id = id;
}

	public String getName(){
	return name;
}

	public void setName(){
	return this.name;
}

	public String getDescription(){
	return description;
}

	public void setDescription(){
	return this.description;
}

	public int getStock(){
	return stock;
}

	public void setStock(){
	this.stock = stock;
}

	public double getPrice(){
	return price;
}

	public void setPrice(){
	this.price = price;
}





