package mypack;

// Generated 25 Jul, 2016 9:46:09 AM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Actor generated by hbm2java
 */
@Entity
@Table(name = "actor", catalog = "mydb")
public class Actor implements java.io.Serializable {

	private int id;
	private String name;

	public Actor() {
	}

	public Actor(int id) {
		this.id = id;
	}

	public Actor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
