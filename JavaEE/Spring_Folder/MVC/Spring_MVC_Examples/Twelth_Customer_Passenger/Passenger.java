/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
@Entity
public class Passenger implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   	private String name;
    private int age;
	public String getName() 
	{
		return name;
	}

	@Column
	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	@Column
	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getGender() 
	{
		return gender;
	}

	@Column
	public void setGender(String gender) 
	{
		this.gender = gender;
	}



	private String gender;

    
    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return name+"\t"+age+"\t"+gender;
    }

}
