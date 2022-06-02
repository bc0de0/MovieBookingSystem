package com.kunalgupte.MovieBookinSystem.service;


import java.util.Collection;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunalgupte.MovieBookinSystem.entity.showDateTime;
import com.kunalgupte.MovieBookinSystem.entity.shows;
import com.kunalgupte.MovieBookinSystem.entity.theater;
import com.kunalgupte.MovieBookinSystem.repository.movieBookingShowRepository;
import com.kunalgupte.MovieBookinSystem.repository.movieBookingSystemTheaterRepository;
import com.kunalgupte.MovieBookinSystem.repository.movieBookingSystemshowDateTimeRepository;


@Service
public class movieBookingSystemServiceImpl implements MovieBookingSystemService {
	
		@Autowired
		private movieBookingSystemTheaterRepository theaterRepo;
		@Autowired
		private movieBookingSystemshowDateTimeRepository dateTimeRepo;
		@Autowired
		private movieBookingShowRepository showRepo;

		@Override
		public Collection<theater> getTheaterByCityId(Long city_id) {
			// TODO Auto-generated method stub
			return theaterRepo.findTheaterByCityId(city_id);
		}

		@Override
		public Collection<showDateTime> getShowDateTimeByTheaterId(Long theater_id) {
			// TODO Auto-generated method stub
			return dateTimeRepo.findShowDateTimeByTheaterId(theater_id);
		}

		@Override
		public shows addShow(shows show) {
			// TODO Auto-generated method stub
			return showRepo.save(show);
		}

		@Override
		public void deleteShowById(Long showId) {
			// TODO Auto-generated method stub
			showRepo.deleteById(showId);			
		}

		@Override
		public shows updateShow(Long showId, shows show) {
			shows showdb = showRepo.findById(showId).get();
			if(Objects.nonNull(show.getMovie_title()) && !"".equalsIgnoreCase(show.getMovie_title())) {
				showdb.setMovie_title(show.getMovie_title());
			}
			if(Objects.nonNull(show.getDateTime()) && !"".equalsIgnoreCase(show.getDateTime())) {
				showdb.setDateTime(show.getDateTime());
			}
			return showRepo.save(showdb);
		}
		
	}



	

