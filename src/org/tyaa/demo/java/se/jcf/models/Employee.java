package org.tyaa.demo.java.se.jcf.models;

import java.math.BigDecimal;

// POJO
// (Plain Old Java Object)
/* public class Employee {
    public String name;
    public BigDecimal salary;
    public String cityName;
} */
public record Employee (String name, BigDecimal salary, String cityName) {}
