package br.com.msansone.api.stockdbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.api.stockdbservice.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
