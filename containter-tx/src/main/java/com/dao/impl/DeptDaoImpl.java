package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert() {
        String sql = "insert into deptinfo(deptname) values('dgedyrr2')";
        jdbcTemplate.update(sql);
    }
}
