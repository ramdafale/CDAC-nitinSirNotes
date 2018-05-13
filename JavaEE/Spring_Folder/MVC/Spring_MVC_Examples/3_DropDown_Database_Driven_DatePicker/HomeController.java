package mypack;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
@Controller
public class HomeController
{
	@Autowired
	ActorDAO actordao;
	
	
	@RequestMapping(value="/first",method = RequestMethod.GET)
	public ModelAndView before()
	{
		MovieTran movietran=new MovieTran();
		List list=actordao.getActors();
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("mvtran",movietran);
 		mv.addObject("mylist",list);
		return mv;
	}
	
	
	@RequestMapping(value="/second",method=RequestMethod.POST)
	public void afterFirst(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		String actorname=request.getParameter("actorName");
		session.setAttribute("actor",actorname);
		
		System.out.println("actor name " +actorname);
		List list=actordao.getMovies(actorname);
		System.out.println("list in after is\t"+list);
		String json = new Gson().toJson(list);
        response.setContentType("application/json");
        try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/third",method=RequestMethod.POST)
	public void afterSecond(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		String movieName=request.getParameter("movieName");
		session.setAttribute("movie",movieName);
		
		System.out.println("movie name " +movieName);
		List list=actordao.getSongName(movieName);
		System.out.println("list in after is\t"+list);
		String json = new Gson().toJson(list);
        response.setContentType("application/json");
        try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/fourth",method=RequestMethod.POST)
	public String afterThird(HttpServletRequest request,HttpSession session)
	{
		System.out.println("in After third");
		String songName=request.getParameter("songName");
		session.setAttribute("song",songName);
		return "Success";
	}
	@RequestMapping(params="final",method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute ("movietran")MovieTran tran,HttpSession session)
	{
		System.out.println("in After submit");
		tran.setActor((String) session.getAttribute("actor"));
		tran.setMovie((String) session.getAttribute("movie"));
		tran.setSong((String) session.getAttribute("song"));
		System.out.println("MovieTran is\t"+tran);
		return "Success";
	}
}

