package mypack;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

	  
	  
	@RestController  
	@RequestMapping("/GetAllEmps")  
	public class EmpRestController 
	{  
		@Autowired
		EmpDAO empdao;
	
	 @RequestMapping(method = RequestMethod.GET)  
	 public String disp(HttpServletRequest request,HttpServletResponse response) 
	{
		 System.out.println("inside disp method");
	      List<Employee> list=empdao.getAllEmployees();
	      String json = new Gson().toJson(list);
	       return json;
	 }  
	}  










