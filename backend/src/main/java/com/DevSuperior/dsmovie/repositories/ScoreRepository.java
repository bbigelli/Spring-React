package com.DevSuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.dsmovie.entities.Score;
import com.DevSuperior.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {	

}
