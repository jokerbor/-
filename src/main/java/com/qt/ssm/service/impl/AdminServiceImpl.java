package com.qt.ssm.service.impl;

import com.qt.ssm.mapper.AdminMapper;
import com.qt.ssm.pojo.Admin;
import com.qt.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void register(Admin admin) {
        adminMapper.register(admin);

    }

    @Override
    public Admin login(Admin admin) {
        Admin ad = adminMapper.login(admin);
        return ad;
    }
}
