package com.booleanuk.core;

public class SavingsAccount extends Account{

    private int totWithdraws;

    public SavingsAccount() {

    }

    public int getWithdraws(){
        return this.totWithdraws;
    }

    @Override
    public void withdraw(float amount){

    }
}
