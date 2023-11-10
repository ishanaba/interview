package com.wsfsbank.challenge.service;

import com.wsfsbank.challenge.data.AccountRepository;
import com.wsfsbank.challenge.model.Account;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {


    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(String id) {
        return accountRepository.findById(Long.valueOf(id)).get();
    }

    public Account createAccount(Account account) {
        return Optional.of(accountRepository.save(account)).get();
    }
}
