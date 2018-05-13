package mypack;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/new_book")
public class BookNewController
{
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
 		Book defaultBook=new Book();
		return new ModelAndView("book.definition","mybook",defaultBook);
	}
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@Valid 	@ModelAttribute("mybook")Book book,BindingResult result) 
	{
		if(result.hasErrors())
		{
			return "book.definition";
		}
		else
		{
			return "book.success.definition";
		}
	}
}


