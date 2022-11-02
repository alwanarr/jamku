package com.ejamku.repository;

import com.ejamku.model.CalonNasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalonNasabahRepository extends JpaRepository<CalonNasabah, Long> {

}
