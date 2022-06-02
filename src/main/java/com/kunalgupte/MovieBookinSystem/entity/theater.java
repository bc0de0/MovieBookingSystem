package com.kunalgupte.MovieBookinSystem.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;



@Entity
@Transactional

public class theater {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="theater_id")
	private Long id;
	private String theaterName;	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_theater_id", referencedColumnName = "theater_id")
	private List<showDateTime> datetime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public theater(Long id, String theaterName, String movie) {
		super();
		this.id = id;
		this.theaterName = theaterName;
		
	}
	public theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "theater [id=" + id + ", theaterName=" + theaterName +  "]";
	}
	
}

