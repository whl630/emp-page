package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmpDao;
import com.service.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class EmpServiceImpl implements EmpService {
    private EmpDao emp;
    private DeptDao dept;

    public void setEmp(EmpDao emp) {
        this.emp = emp;
    }

    public void setDept(DeptDao dept) {
        this.dept = dept;
    }

    @Transactional(timeout = 2,readOnly = false)
    @Override
    public void getTx() {
        emp.delete();
        dept.insert();
    }
}
