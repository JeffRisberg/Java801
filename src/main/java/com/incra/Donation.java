package com.incra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Donation {
  protected String charityName;
  protected String donorName;
  protected int amount;

  public Donation(String charityName, String donorName, int amount) {
    this.charityName = charityName;
    this.donorName = donorName;
    this.amount = amount;
  }
}
