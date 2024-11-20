package com.forty2.training.crud.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Emp {
    private Integer empId;
    private String empName;
    private Integer empAge;
    private BigDecimal empSalary;
}
