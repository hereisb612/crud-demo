package com.forty2.training.crud.pojo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Emp {
    private Integer empId;
    @NotNull(message = "name cannot be empty")
    private String empName;
    @Max(value = 120, message = "age cannot bigger than 120")
    @Min(value = 0, message = "age cannot be less than 0")
    private Integer empAge;
    @Min(value = 0, message = "salary cannot less than 0")
    private BigDecimal empSalary;
}
