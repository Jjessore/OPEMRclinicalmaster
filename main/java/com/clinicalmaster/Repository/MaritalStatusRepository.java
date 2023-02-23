package com.clinicalmaster.Repository;

import com.clinicalmaster.Entity.maritalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaritalStatusRepository extends JpaRepository<maritalStatus, Integer> {

    @Query("SELECT m FROM maritalStatus m where status='A' ORDER BY Id")
    List<maritalStatus> findActiveMaritalStatus();

}

