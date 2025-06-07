package com.disbursementreport.credit.controller;

import com.disbursementreport.credit.model.Disbursement;
import com.disbursementreport.credit.repository.DisbursementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disbursements")
public class DisbursementController {
    private final DisbursementRepository repo;

    public DisbursementController(DisbursementRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Disbursement create(@RequestBody Disbursement d) {
        return repo.save(d);
    }

    @GetMapping
    public List<Disbursement> getAll() {
        return repo.findAll();
    }
}