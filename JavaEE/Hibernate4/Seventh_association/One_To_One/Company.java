package mypack;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="company")
public class Company 
{
	private int id;
	private Account acc;
	private String name;
	private String location;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne(cascade = CascadeType.ALL)
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
