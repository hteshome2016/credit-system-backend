package com.disbursementreport.credit.repository;

import com.disbursementreport.credit.model.Disbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisbursementRepository extends JpaRepository<Disbursement, Long> {
}