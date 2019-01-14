package com.incra;

import lombok.Data;

@Data
public class Donation {
    protected String charityName;
    protected String donorName;
    protected double amount;
}
