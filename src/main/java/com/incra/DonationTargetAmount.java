package com.incra;

public interface DonationTargetAmount {
  @FunctionalInterface
  interface Converter<F, T> {
    T convert(F from);
  }
}
