package mypack;

// Generated Jun 11, 2013 10:42:01 AM by Hibernate Tools 3.2.2.GA


//import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.*;

/**
 * Product generated by hbm2java
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY) // for second level
@Table(name = "Product")
public class Product implements java.io.Serializable {

	private int id;
	private String name;
	private int qty;
	private double price;
	public Product() {
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price
				+ "]";
	}

	public Product(int id) {
		this.id = id;
	}

	public Product(int id, String name, int qty, double price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "qty")
	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Column(name = "price")
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
