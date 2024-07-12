package com.ayna.krscitizen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayna.krscitizen.entity.Citizen;

@Repository
public interface CitiRepo  extends JpaRepository<Citizen, Long>{

}
