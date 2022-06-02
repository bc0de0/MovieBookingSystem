package com.kunalgupte.MovieBookinSystem.repository;



import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.kunalgupte.MovieBookinSystem.entity.theater;

@Repository
public interface movieBookingSystemTheaterRepository extends JpaRepository<theater, Long> {

	@Query(value = "SELECT * FROM theater t WHERE t.fk_city_id = city_id", nativeQuery = true)
	Collection<theater> findTheaterByCityId(Long city_id);


}

