package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import 

org.springframework.web.bind.annotation.ModelAttribute;
import 

org.springframework.web.bind.annotation.RequestMapping;
import 

org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/new_customer")
public class AddCustomerController
{
	@Autowired
	CustomerDAO customerdao;

	int totalcost;
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processSubmit(@ModelAttribute("mycustomer")Customer customer)
		{
		
		customerdao.add(customer);
			//return form success view
		totalcost=CalculateCost.calc(customer);
		return new ModelAndView("bill","totalcost",totalcost);
 
	}

	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Customer customer=new Customer();
		return new ModelAndView("Add","mycustomer",customer);
	}
}
