package com.example.jobank.repositories;

import com.example.jobank.models.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bills, Long> {
}
