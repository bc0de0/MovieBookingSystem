package com.kunalgupte.MovieBookinSystem.repository;



import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kunalgupte.MovieBookinSystem.entity.showDateTime;

public interface movieBookingSystemshowDateTimeRepository extends JpaRepository<showDateTime, Long> {

	@Query(value = "SELECT * FROM show_date_time dt WHERE dt.fk_theater_id = theater_id", nativeQuery = true)
	Collection<showDateTime> findShowDateTimeByTheaterId(Long theater_id);
	
	

}
