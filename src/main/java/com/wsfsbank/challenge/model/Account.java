package com.wsfsbank.challenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table
public class Account {
    @Id
    private long id;

    private String name;
    private String type;
    private Double balance;
    private Date openedDate;
    private Date closedDate;

    public Account() {
    }

    public Account(long id, String name, String type, Double balance, Date openedDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.openedDate = openedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }
}
