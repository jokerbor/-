package com.qt.ssm.service;

import com.qt.ssm.pojo.Admin;

public interface AdminService {
    void register(Admin admin);

    Admin login(Admin admin);
}
