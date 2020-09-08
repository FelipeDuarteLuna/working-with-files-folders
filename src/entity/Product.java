package entity;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String name;
	double price;
	Integer quantidade;
	
	//Constructor
	public Product () {
		
	}
	
	public Product (String nome, double preco, Integer quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantidade = quantidade;
	}
	
	//Getter's and Setter's
	public void setName(String nome) {
		this.name = nome;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	//Method's
	public double Total() {
		return this.price * this.quantidade;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantidade=" + quantidade + "]";
	}
	
	

}
