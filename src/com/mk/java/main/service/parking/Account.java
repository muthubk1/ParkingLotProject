package com.mk.java.main.service.parking;

import com.mk.java.main.constants.AccountStatus;
import com.mk.java.main.model.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword();
}
