package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ActorDAOImpl implements ActorDAO 
{
@Autowired
HibernateTemplate template;
	@Override
	public List getActors() {
		// TODO Auto-generated method stub
		List list=template.find("select k.name from Actor k");
		return list;
	}
	@Override
	public List getMovies(String actor) {
		String query="select k.mvName from Movie k where k.actorName = ?";
		Object[] prm={actor};
		List list=template.find(query,prm);
		System.out.println("list of movies is \t"+list);
		return list;
	}
	@Override
	public List getSongName(String movieName) {
		String query="select k.songName from Moviesong k where k.movieName = ?";
		Object[] prm={movieName};
		List list=template.find(query,prm);
		System.out.println("list of movies is \t"+list);
		return list;
	}
	

}
