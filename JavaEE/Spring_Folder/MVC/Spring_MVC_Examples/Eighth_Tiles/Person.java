package mypack;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Person 
{
	private String name;
	private int age;
	
	@NotEmpty(message="name can not be empty")
	@Length(min=4,max=20,message="name must be between ${min} and ${max} characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Range(min=18,max=58,message="age should be in the range ${min} and ${max}") 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
