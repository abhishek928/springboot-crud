package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class product {
	
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private int quantity;
	private double price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public product(int id, String name, int quantity, double price) {
		super();
		this.Id  = Id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [Id=" + Id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
