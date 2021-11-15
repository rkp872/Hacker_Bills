package com.infinx.repository;

import com.infinx.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface BillRepository extends JpaRepository<Bill,Integer> {
    Bill findByDueDate(LocalDate dueDate);
}
