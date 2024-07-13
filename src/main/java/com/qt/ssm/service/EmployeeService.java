package com.qt.ssm.service;

import com.qt.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Date:2022/7/11
 * Author:ybc
 * Description:
 */
public interface EmployeeService {

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    int deleteEmployee(int empId);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);
}
