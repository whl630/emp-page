package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmpDao;
import com.service.EmpAndDeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class EmpAndDeptServiceImpl implements EmpAndDeptService {
    private EmpDao emp;
    private DeptDao dept;

    public EmpAndDeptServiceImpl(EmpDao emp, DeptDao dept) {
        this.emp = emp;
        this.dept = dept;
    }

    @Transactional(timeout = 2,readOnly = false)
    @Override
    public void getTx() {
        emp.delete();
        dept.insert();
    }
}
