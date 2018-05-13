package mypack;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

	  
	  
	@RestController  
	@RequestMapping("/hello")  
	public class SpringRestController {  
	 @RequestMapping(value = "/{name}/{age}", method = RequestMethod.GET)  
	 public String hello(@PathVariable String name,@PathVariable int age) {
		 System.out.println("inside hello method");
	  String result="Hello "+name; 
	  String resp=null;
	  if(age>=18)
	  {
		  resp="You are allowed to vote";
	  }
	  else
	  {
		  resp="You are not allowed to vote";
	  }
	  result+=resp;
	  return result;  
	 }  
	}  






