package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mypack.Employee;

@Controller
public class PdfController {

 @RequestMapping(value = "/generate/pdf", method = RequestMethod.GET)
 ModelAndView generatePdf(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  System.out.println("Calling generatePdf()...");
  
  Employee employee1 = new Employee();
  employee1.setFirstName("Sachin");
  employee1.setLastName("Tendulkar");
  Employee employee2 = new Employee();
  employee2.setFirstName("Rahul");
  employee2.setLastName("Dravid");
  Employee employee3 = new Employee();
  employee3.setFirstName("Anil");
  employee3.setLastName("Kumble");
  Employee employee4 = new Employee();
  employee4.setFirstName("VVS");
  employee4.setLastName("Laxman");
  
  List<Employee> mylist=new ArrayList<Employee>();
  mylist.add(employee1);
  mylist.add(employee2);
  mylist.add(employee3);
  mylist.add(employee4);
  ModelAndView modelAndView = new ModelAndView("pdfView", "mylist",mylist);
  
  return modelAndView;
 }

}