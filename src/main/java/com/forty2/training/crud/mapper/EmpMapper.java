package com.forty2.training.crud.mapper;

import com.forty2.training.crud.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpMapper {

    Emp queryEmpById(@Param("id") Integer id);

    List<Emp> queryAllEmp();

    void insertEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmpById(@Param("id") Integer id);
}
