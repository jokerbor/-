package com.qt.ssm.mapper;

import com.qt.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date:2022/7/11
 * Author:ybc
 * Description:
 */
public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    int deleteEmployee(@Param("empId") int empId);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);
}
