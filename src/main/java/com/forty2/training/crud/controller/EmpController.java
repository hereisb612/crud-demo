package com.forty2.training.crud.controller;

import com.forty2.training.crud.pojo.Emp;
import com.forty2.training.crud.service.EmpService;
import com.forty2.training.crud.utils.R;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/emp/{id}")
    public R getEmpById(@PathVariable("id") Integer id) {
        Emp emp = empService.getEmpById(id);
        return R.ok(emp);
    }

    @PostMapping("/emp")
    public R addEmp(@RequestBody @Valid Emp emp) {
        empService.addEmp(emp);
        return R.ok();
    }

    @DeleteMapping("/emp/{id}")
    public R deleteEmp(@PathVariable("id") Integer id) {
        empService.deleteEmp(id);
        return R.ok();
    }

    @PutMapping("/emp")
    public R updateEmp(@RequestBody @Valid Emp emp) {
        empService.updateEmp(emp);
        return R.ok();
    }

    @GetMapping("/emps")
    public R getAllEmps() {
        List<Emp> allEmps = empService.getAllEmps();
        return R.ok(allEmps);
    }
}
