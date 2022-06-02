package com.kunalgupte.MovieBookinSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kunalgupte.MovieBookinSystem.entity.shows;
@Repository
public interface movieBookingShowRepository extends JpaRepository<shows, Long> {

}
