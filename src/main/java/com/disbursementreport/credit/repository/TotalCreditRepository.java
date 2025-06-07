package com.disbursementreport.credit.repository;

import com.disbursementreport.credit.model.TotalCredit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TotalCreditRepository extends JpaRepository<TotalCredit, Long> {
}