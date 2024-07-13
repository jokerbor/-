package com.qt.ssm.service.impl;

import com.qt.ssm.mapper.EmployeeMapper;
import com.qt.ssm.pojo.Employee;
import com.qt.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Date:2022/7/11
 * Author:ybc
 * Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public int deleteEmployee(int empId) {
         int result = employeeMapper.deleteEmployee(empId);
        return result;
    }

    @Override
    public int addEmployee(Employee employee) {
        int result = employeeMapper.addEmployee(employee);
        return result;
    }

    @Override
    public int updateEmployee(Employee employee) {
        int result = employeeMapper.updateEmployee(employee);
        return result;
    }
}
