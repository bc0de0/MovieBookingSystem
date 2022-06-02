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


@Entity
public class city { 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "city_id")
	private Long CityId;
	private String cityName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_CityId", referencedColumnName = "city_id")
	private List<theater> theater;
	
	public Long getCityId() {
		return CityId;
	}
	public void setCityId(Long cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public city(Long cityId, String cityName, com.kunalgupte.MovieBookinSystem.entity.theater theater) {
		super();
		CityId = cityId;
		this.cityName = cityName;
		
	}
	public city() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "city [CityId=" + CityId + ", cityName=" + cityName + ", theater=" + theater + "]";
	}
	

}

