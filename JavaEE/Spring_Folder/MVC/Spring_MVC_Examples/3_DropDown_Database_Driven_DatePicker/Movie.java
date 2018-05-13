package mypack;

// Generated 25 Jul, 2016 10:33:57 AM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Movie generated by hbm2java
 */
@Entity
@Table(name = "movie", catalog = "mydb")
public class Movie implements java.io.Serializable {

	private int id;
	private String actorName;
	private String mvName;

	public Movie() {
	}

	public Movie(int id) {
		this.id = id;
	}

	public Movie(int id, String actorName, String mvName) {
		this.id = id;
		this.actorName = actorName;
		this.mvName = mvName;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "actorName", length = 30)
	public String getActorName() {
		return this.actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	@Column(name = "mvName", length = 30)
	public String getMvName() {
		return this.mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

}
