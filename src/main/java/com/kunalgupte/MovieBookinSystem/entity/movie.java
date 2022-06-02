package com.kunalgupte.MovieBookinSystem.entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="movie_id")
	private Long id;
	private String movieTitle;
	private String description;
	@Basic
	private java.sql.Time duration;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_movie_id", referencedColumnName = "movie_id")
	private List<showDateTime> dateTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public java.sql.Time getDuration() {
		return duration;
	}
	public void setDuration(java.sql.Time duration) {
		this.duration = duration;
	}
	public List<showDateTime> getDateTime() {
		return dateTime;
	}
	public void setDateTime(List<showDateTime> dateTime) {
		this.dateTime = dateTime;
	}
	public movie(Long id, String movieTitle, String description, Time duration, List<showDateTime> dateTime) {
		super();
		this.id = id;
		this.movieTitle = movieTitle;
		this.description = description;
		this.duration = duration;
		this.dateTime = dateTime;
	}
	public movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "movie [id=" + id + ", movieTitle=" + movieTitle + ", description=" + description + ", duration="
				+ duration + ", dateTime=" + dateTime + "]";
	}
	
	
	

}

