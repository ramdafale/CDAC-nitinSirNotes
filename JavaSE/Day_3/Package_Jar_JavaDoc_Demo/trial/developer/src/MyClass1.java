package mypack;
import java.io.*;
/**
This is the first class
@author Nitin 
@version 1.8
**/
public class MyClass1
{
	private int num;
	/**
	this method will accept a number and return its square.
	@return the square of number passed
	@param  k number to be passed
	@throws IOException if number passed is less than or equal to zero
	**/
	public int sqr(int k)throws IOException
	{
		if(k<=0)
		{
			throw new IOException("negative or zero not allowed");
		}
		return k*k;
	}

	/**
	this method will accept two numbers and return the result.
	@param a first number to be passed
	@param b first number to be passed
	@return 1 if first number is greater, -1 if vice-versa, 0 if both are same.
	**/
	public int compare(int a,int b)
	{
		if(a>b)
		{
			return 1;
		}
		else if(a<b)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public class inner
	{
		public void dispin()
		{
		}
	}
}




