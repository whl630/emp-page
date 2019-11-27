package com.service;

import com.student.Student;

import java.util.List;

public interface StuAndEmpManager {
    void toRunning(int id);
    List<Student> getAllStudents(int pageNum,int pageSize);
}
