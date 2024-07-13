package com.qt.ssm.mapper;

import com.qt.ssm.pojo.Admin;

public interface AdminMapper {

    void register(Admin admin);

    Admin login(Admin admin);

}
