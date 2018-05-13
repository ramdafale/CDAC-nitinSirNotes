package mypack;

import java.sql.*;

public class EmployeeDAODatabaseImpl implements EmployeeDAO 
{
	Connection con;
	public EmployeeDAODatabaseImpl()
	{
		try
		{
Class.forName("com.mysql.jdbc.Driver");
String ss="jdbc:mysql://localhost:3306/mydb";
		 con=DriverManager.getConnection(ss,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}
	public void insertEmployee(Employee ref) 
	{
		try
		{
PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
pst.setString(1,ref.getName());
pst.setString(2,ref.getDesig());
pst.setDouble(3,ref.getSalary());
int k=pst.executeUpdate();
if(k>0)
{
	System.out.println("record added");
}
else
{
	System.out.println("record not added");
}	

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}

	
	public Employee getEmployee() 
	{
		Employee ref=new Employee();
		try
		{
		PreparedStatement pst=con.prepareStatement("select * from employee");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			ref.setName(rs.getString(1));
			ref.setDesig(rs.getString(2));
			ref.setSalary(rs.getDouble(3));
			break;
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return ref;
	}

}
