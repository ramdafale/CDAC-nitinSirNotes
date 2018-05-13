package mypack;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Book 
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+bookName+"   "+price+"]";
	}
	private String bookName;
	private long price;
	


	@NotEmpty(message="book name can not be empty")
	@Length(min=4,max=20,message="book name must be between {min} and {max} characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Range(min=100,max=400,message="price should be in the range ${min} and ${max}") 
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
