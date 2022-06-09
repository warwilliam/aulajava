package com.grupo7.airbnbclone.repositories;

import com.grupo7.airbnbclone.model.Casa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasaRepository extends JpaRepository<Casa, Integer> {
}
