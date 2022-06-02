package com.kunalgupte.MovieBookinSystem.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class showDateTime {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "show_id")
	private Long id;
	@Basic
	private Date showDate;
	@Basic
	private Time showTime;
	@Override
	public String toString() {
		return "showDateTime [id=" + id + ", showDate=" + showDate + ", showTime=" + showTime + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public Time getShowTime() {
		return showTime;
	}
	public void setShowTime(Time showTime) {
		this.showTime = showTime;
	}
	public showDateTime(Long id, Date showDate, Time showTime) {
		super();
		this.id = id;
		this.showDate = showDate;
		this.showTime = showTime;
	}
	public showDateTime() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
		
}

