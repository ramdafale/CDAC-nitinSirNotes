package mypack;

import java.util.List;

public interface ActorDAO 
{
	List getActors();
	List getMovies(String actor);
	List getSongName(String movieName);
}
