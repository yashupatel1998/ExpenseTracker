package com.myfty.expence_tracker.service;

import com.myfty.expence_tracker.model.Expense;
import com.myfty.expence_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    // Dependency Injection (constructor injection is preferred)
    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // Retrieves expenses for the current month
    public List<Expense> findCurrentMonthExpenses() {
        YearMonth currentMonth = YearMonth.now();
        LocalDate startOfMonth = currentMonth.atDay(1);
        LocalDate endOfMonth = currentMonth.atEndOfMonth();

        return expenseRepository.findByDateBetween(startOfMonth, endOfMonth);
    }

    // Saves a new expense record
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // Calculates the total expenses for the current month
    public double calculateMonthlyTotal(List<Expense> expenses) {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    // Deletes an expense by its ID
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}