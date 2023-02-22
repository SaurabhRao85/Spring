package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
