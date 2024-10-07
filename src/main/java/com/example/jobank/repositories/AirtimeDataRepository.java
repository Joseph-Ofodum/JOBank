package com.example.jobank.repositories;

import com.example.jobank.models.AirtimeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirtimeDataRepository extends JpaRepository<AirtimeData, Long> {
}
