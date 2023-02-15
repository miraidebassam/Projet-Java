package com.model;

import com.model.observer.*;
import com.vue.*;

public class ConvertModel extends Observer {

	private double amount;
    private String currency ;
    private double result;
    Double[] currenciesRate = { 1.31, 602.07, 744.12, 655.29, 0.071 };
	

    public ConvertModel(ConvertView subject)
    {
    	this.subject = subject; 
		this.subject.attach(this);
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getResult() {
		return result;
	}


	public void convert(double amount, int idCurrency) {
		result = amount * currenciesRate[idCurrency];
	}

	@Override
	public void update() {
		subject.setcfaValue(Double.toString(result));
		
	}
}
