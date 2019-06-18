package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    Assert.assertEquals(5, calculator.sum(2, 3));
  }
}
