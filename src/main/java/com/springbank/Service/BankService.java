package com.springbank.Service;

import com.springbank.model.Bank;
import com.springbank.repository.BankRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BankService {

    final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public float getBalance(){
        return bankRepository.getOne(1L).getBalance();
    }

}

