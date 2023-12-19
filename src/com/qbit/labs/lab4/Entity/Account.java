package com.qbit.labs.lab4.Entity;

import com.qbit.labs.lab4.Service.FinancialTrackingSystem;
import com.qbit.labs.lab4.Main;

import java.util.ArrayList;
import java.util.List;

public class Account{
    private Integer id;
    private double remainder;
    private List<Transaction> transactions = new ArrayList<>();
    public String displayAccountInfo(FinancialTrackingSystem financialTrackingSystem) {
        StringBuilder stringBuffer = new StringBuilder();
        for (Account account : financialTrackingSystem.getAccounts()) {
            stringBuffer.append("id: ").append(account.getId()).append(" Remainder: ").append(account.getRemainder()).append("\n");
        }
        return stringBuffer.toString();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public double getRemainder() {
        return remainder;
    }
}
