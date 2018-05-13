/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    
    @Column
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

    public Collection<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Collection<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getName() {
        return name;
    }

    @Column
    public void setName(String name) {
        this.name = name;
    }
  
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "cid")
    private Collection <Passenger> passengers=new ArrayList<Passenger>(10);
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

  

    @Override
    public String toString() {
        return name+"\t"+passengers;
    }

}
