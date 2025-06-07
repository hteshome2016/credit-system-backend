package com.disbursementreport.credit.controller;

import com.disbursementreport.credit.model.TotalCredit;
import com.disbursementreport.credit.repository.TotalCreditRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit")
public class TotalCreditController {
    private final TotalCreditRepository repo;

    public TotalCreditController(TotalCreditRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public TotalCredit create(@RequestBody TotalCredit credit) {
        return repo.save(credit);
    }

    @GetMapping
    public List<TotalCredit> getAll() {
        return repo.findAll();
    }
}