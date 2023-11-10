package com.wsfsbank.challenge.controller;

import com.wsfsbank.challenge.data.AccountRepository;
import com.wsfsbank.challenge.model.Account;
import com.wsfsbank.challenge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/account/{id}")
    public Account getAccountById(@PathVariable String id){
        return accountService.getAccount(id);
    }

    @PostMapping("/account/")
    public Account createAccount(@RequestBody Account account){

        return accountService.createAccount(account);

    }

}
