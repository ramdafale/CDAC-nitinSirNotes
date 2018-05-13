package mypack;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/contact")
public class ContactController
{
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
 		Person person=new Person();
		return new ModelAndView("contact.definition","person",person);
	}
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@Valid	@ModelAttribute("person")Person person,BindingResult result) 
	{
		if(result.hasErrors())
		{
			return "contact.definition";
		}
		else
		{
			return "contact.success.definition";
		}
	}
}









