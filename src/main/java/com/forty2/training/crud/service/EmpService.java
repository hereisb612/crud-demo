package com.forty2.training.crud.service;

import com.forty2.training.crud.mapper.EmpMapper;
import com.forty2.training.crud.pojo.Emp;
import com.github.pagehelper.PageHelper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpMapper empMapper;

    public Emp getEmpById(Integer id) {
        return empMapper.queryEmpById(id);
    }

    public void addEmp(@RequestBody Emp emp) {
        empMapper.insertEmp(emp);
    }


    public void deleteEmp(Integer id) {
        empMapper.deleteEmpById(id);
    }


    public void updateEmp(@Valid Emp emp) {

        Integer id = emp.getEmpId();

        if (id == null) {
            throw new RuntimeException("emp id is null");
        }

        Emp database = empMapper.queryEmpById(id);

        if (emp.getEmpName() != null) {
            database.setEmpName(emp.getEmpName());
        }

        if (emp.getEmpAge() != null) {
            database.setEmpAge(emp.getEmpAge());
        }

        if (emp.getEmpSalary() != null) {
            database.setEmpSalary(emp.getEmpSalary());
        }

        empMapper.updateEmp(database);
    }

    public List<Emp> getAllEmps() {
        PageHelper.startPage(1, 3);
        return empMapper.queryAllEmp();
    }
}
