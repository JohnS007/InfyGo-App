package com.infy.irs.paymentservice.repository;

import com.infy.irs.paymentservice.entity.CreditCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCardDetails, String> {

}
