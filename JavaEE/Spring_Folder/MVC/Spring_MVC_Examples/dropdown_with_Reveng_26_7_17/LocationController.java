package mypack;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class LocationController {
	
	@Autowired
	LocationDAO ldao;
	
	
	@RequestMapping(value="/loc", method = RequestMethod.GET)
	public ModelAndView before()
	{
		Locationmaster l =new Locationmaster();
		return new ModelAndView("location.definition","loc",l);
	}
	
	@RequestMapping(value="/LocList", method = RequestMethod.POST)
	public void beforeLocation(HttpServletRequest request,HttpServletResponse response)
	{
		String name=request.getParameter("cityid");
		List l = ldao.getAllLocations(name); 
		System.out.println("locations are \t"+l);
		
		String json = new Gson().toJson(l);
        response.setContentType("application/json");
        try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/loc", method = RequestMethod.POST)
	public ModelAndView after(@ModelAttribute("loc")Locationmaster Location)
	{
		ldao.addLocation(Location);
		return new ModelAndView("redirect/LocList.do");
	}
}
