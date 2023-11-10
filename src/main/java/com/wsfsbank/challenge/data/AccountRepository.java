package com.wsfsbank.challenge.data;

import com.wsfsbank.challenge.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {}
