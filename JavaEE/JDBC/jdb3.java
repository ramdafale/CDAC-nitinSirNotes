import java.sql.*;
public class jdb3
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
Statement st=con.createStatement();
int val=st.executeUpdate("update dept set loc='bombay'");
if(val>0)
{
	System.out.println("Records updated");
}
else
{
	System.out.println("can not update records");
}	
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}








						