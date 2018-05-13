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
public class CityController {
	
	@Autowired
	CityDAO cdao;
	
	@RequestMapping(value="/City", method = RequestMethod.GET)
	public ModelAndView before()
	{
		Citymaster ct =new Citymaster();
		return new ModelAndView("city.definition","city",ct);
	}
	
	
	@RequestMapping(value="/CityList", method = RequestMethod.POST)
	public void beforeCity(HttpServletRequest request,HttpServletResponse response)
	{
		int state=Integer.parseInt(request.getParameter("state").trim());
		System.out.println("stateid is\t"+state);
		//System.out.println("City GEt called");
		List c = cdao.getAllCities(state); 
		System.out.println("cities are \t"+c);
		/*request.setAttribute("cityList",c);
		Locationmaster lm=new Locationmaster();
		return new ModelAndView("location.definition","loc",lm);*/
		String json = new Gson().toJson(c);
        response.setContentType("application/json");
        try {
			response.getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*@RequestMapping(value="/City", method = RequestMethod.POST)
	public ModelAndView after(@ModelAttribute("city")CityMaster city HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("City post called");
		String cityName = request.getParameter("cityName");
		Integer stateId = Integer.parseInt(request.getParameter("stateId").trim());
		Citymaster city = new Citymaster();
		city.setStateId(stateId);
		city.setCityname(cityName);
		cdao.addCity(city);
		System.out.println("City post call complete");
		return new ModelAndView("redirect:/CityList.do");
	}*/
}
