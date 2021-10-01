package com.example.medis.medis.repository;

import com.example.medis.medis.model.Diagnosis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepo extends JpaRepository<Diagnosis, Long> {
}
