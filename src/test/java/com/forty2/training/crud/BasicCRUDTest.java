package com.forty2.training.crud;

import com.forty2.training.crud.mapper.EmpMapper;
import com.forty2.training.crud.pojo.Emp;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class BasicCRUDTest {
    @Autowired
    EmpMapper empMapper;

    @Test
    public void test1() {
        System.out.println(empMapper.queryEmpById(1));
    }

    @Test
    public void test2() {
        Emp emp = new Emp();
        emp.setEmpName("Zhang");
        emp.setEmpAge(23);
        emp.setEmpSalary(BigDecimal.valueOf(3636.36));
        empMapper.insertEmp(emp);
    }

    @Test
    public void test3() {
        Emp emp = new Emp();
        emp.setEmpId(2);
        emp.setEmpName("Xu");
        emp.setEmpAge(29);
        emp.setEmpSalary(BigDecimal.valueOf(8989.89));
        empMapper.updateEmp(emp);
    }
    
    @Test
    public void test4() {
        empMapper.deleteEmpById(2);
    }

    @Test
    public void test5() {
        PageHelper.startPage(1, 1);
        List<Emp> emps = empMapper.queryAllEmp();
        emps.forEach(System.out::println);
    }
}
