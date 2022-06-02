package com.kunalgupte.MovieBookinSystem.service;


import java.util.Collection;
import com.kunalgupte.MovieBookinSystem.entity.showDateTime;
import com.kunalgupte.MovieBookinSystem.entity.shows;
import com.kunalgupte.MovieBookinSystem.entity.theater;

public interface MovieBookingSystemService {

	public Collection<theater> getTheaterByCityId(Long city_id);

	public Collection<showDateTime> getShowDateTimeByTheaterId(Long theater_id);

	public shows addShow(shows show);

	public void deleteShowById(Long showId);

	public shows updateShow(Long showId, shows show);

	
}
