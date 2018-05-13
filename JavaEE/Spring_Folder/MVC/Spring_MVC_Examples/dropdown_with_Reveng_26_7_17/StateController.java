package mypack;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StateController {
	
	@Autowired
	StateDAO sdao;
	
	@RequestMapping(value="/State", method = RequestMethod.GET)
	public ModelAndView before()
	{
		Statemaster st =new Statemaster();
		return new ModelAndView("state.definition","state",st);
	}
	
	
	@RequestMapping(value="/StateList",method = RequestMethod.GET)
	public ModelAndView beforeState(HttpServletRequest request)
	{
		List<Statemaster> st = sdao.getAllStates();
		request.setAttribute("stateList",st);
		Citymaster c=new Citymaster();
		return new ModelAndView("city.definition","city",c);
	}
	
	@RequestMapping(value="/State",method = RequestMethod.POST)
	public ModelAndView after(@ModelAttribute("state") Statemaster state)
	{
		 sdao.insert(state);
		return new ModelAndView("redirect:/StateList.do");
		
	}


}
