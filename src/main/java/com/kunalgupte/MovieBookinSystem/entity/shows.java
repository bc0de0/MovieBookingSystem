package com.kunalgupte.MovieBookinSystem.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

;

@Entity
public class shows {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "show_id")
	private Long id;
	private String movie_title;
	private String dateTime;
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public shows(Long id, String movie_title, String dateTime) {
		this.id = id;
		this.movie_title = movie_title;
		this.dateTime = dateTime;
	}
	public shows() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "shows [id=" + id + ", movie_title=" + movie_title + ", dateTime=" + dateTime + "]";
	}
	

}
