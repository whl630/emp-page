package com.dao.impl;

import com.dao.EmpDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void delete() {
        String sql = "delete from employee where id = 31";
        jdbcTemplate.update(sql);
    }
}
