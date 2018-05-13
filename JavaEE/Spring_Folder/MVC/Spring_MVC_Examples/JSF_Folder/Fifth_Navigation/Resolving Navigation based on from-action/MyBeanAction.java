package mypack;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="myBeanAction")
public class MyBeanAction 
{
	
	private String module;
	
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String perform()
	{
		System.out.println("inside mybeanaction perform");
		if(getModule().equalsIgnoreCase("java"))
		{
			return "java8";
		}
		else if(getModule().equalsIgnoreCase("c++"))
		{
			return "c++";
		}
		else if(getModule().equalsIgnoreCase("database"))
		{
			return "database";
		}
		else
		{
			return "error";
		}
	}
}
