package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Employee;

@Mapper
public interface EmployeeMapper {

    @ResultMap("EmployeeWithDepartment")
    @Select("SELECT e.*, d.*   "
    		+ "FROM employee e JOIN department d ON e.departmentId = d.id  ")
    List<Employee> findAll();

}
