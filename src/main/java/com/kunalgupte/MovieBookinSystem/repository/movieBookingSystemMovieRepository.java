package com.kunalgupte.MovieBookinSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kunalgupte.MovieBookinSystem.entity.movie;

public interface movieBookingSystemMovieRepository extends JpaRepository<movie, Long> {

}
