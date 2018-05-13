package mypack;

import java.util.Date;

public class MovieTran 
{
	private Date dob;
	
	private String actor;
	private String movie;
	private String song;
	@Override
	public String toString() {
		return "MovieTran [dob=" + dob + ", actor=" + actor + ", movie="
				+ movie + ", song=" + song + "]";
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
