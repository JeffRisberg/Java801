package com.incra;

import java.util.ArrayList;
import java.util.List;

public class DonationStore {

  List<Donation> donations = new ArrayList<Donation>();

  public DonationStore() {
    donations.add(new Donation("c1", "d1", 56));
    donations.add(new Donation("c2", "d1", 52));
    donations.add(new Donation("c3", "d2", 26));
    donations.add(new Donation("c1", "d2", 16));
  }
}
