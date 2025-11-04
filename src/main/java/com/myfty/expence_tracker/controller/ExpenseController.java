package com.myfty.expence_tracker.controller;

import com.myfty.expence_tracker.model.Expense;
import com.myfty.expence_tracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.time.YearMonth;
import java.time.LocalDate;

@Controller
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Handles the home page request (GET /)
    @GetMapping("/")
    public String listExpenses(Model model) {
        // 1. Get current month's expenses
        List<Expense> expenses = expenseService.findCurrentMonthExpenses();

        // 2. Calculate total
        double total = expenseService.calculateMonthlyTotal(expenses);

        // 3. Add necessary objects to the model for the Thymeleaf view
        model.addAttribute("expenseList", expenses);
        model.addAttribute("monthlyTotal", total);
        model.addAttribute("newExpense", new Expense()); // Empty expense object for the form
        model.addAttribute("currentMonth", YearMonth.now());

        // Returns the name of the Thymeleaf template file (index.html)
        return "index";
    }

    // Handles the form submission (POST /save)
    @PostMapping("/save")
    public String saveExpense(@ModelAttribute("newExpense") Expense expense) {
        expenseService.saveExpense(expense);
        // Redirect back to the home page to see the updated list
        return "redirect:/";
    }

    // Handles the delete request (GET /delete/{id})
    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        // Redirect back to the home page
        return "redirect:/";
    }
}
