package com.kunalgupte.MovieBookinSystem.controller;

import java.util.Collection;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kunalgupte.MovieBookinSystem.entity.showDateTime;
import com.kunalgupte.MovieBookinSystem.entity.shows;
import com.kunalgupte.MovieBookinSystem.entity.theater;
import com.kunalgupte.MovieBookinSystem.service.MovieBookingSystemService;








@RestController
public class movieBookingSystemController {
	@Autowired
	MovieBookingSystemService service;
	private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(movieBookingSystemController.class);
	
	
	@GetMapping("/city/{city_id}")
	public Collection<theater> getTheaterByCityId(@PathVariable("city_id") Long city_id) {
		return service.getTheaterByCityId(city_id);
	}
	
	@GetMapping("/theater/{theater_id}")
	public Collection<showDateTime> getShowDateTimeByTheaterId(@PathVariable("theater_id") Long theater_id) {
		return service.getShowDateTimeByTheaterId(theater_id);
	}
	
	@PostMapping("/show")
	public shows addShows(@Validated @RequestBody shows show) {
		LOGGER.info("Insert into shows");
		return service.addShow(show);
	}
	
	@DeleteMapping("/shows/{Id}")
	public String deleteShowById(@PathVariable("Id") Long showId) {
		service.deleteShowById(showId);
		return "show Deleted Successfully";
	}
}

