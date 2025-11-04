package com.myfty.expense_tracker.repository;

import com.myfty.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

import java.util.List;

// JpaRepository provides methods like save(), findAll(), findById(), deleteById()
// <Expense, Long> means it manages Expense entities with a primary key of type Long
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Custom method to fetch expenses for a given month (Year and Month)
    List<Expense> findByDateBetween(LocalDate startOfMonth, LocalDate endOfMonth);
}
