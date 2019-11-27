package com.service.impl;

import com.dao.StudentDao;
import com.service.StuAndEmpManager;
import com.student.Student;

import java.util.List;

public class StuAndEmpManagerImpl implements StuAndEmpManager {
    private StudentDao student;

    public void setStudent(StudentDao student) {
        this.student = student;
    }

    @Override
    public void toRunning(int id) {
        //Student stu = student.getStudnetById(id);
        Student stu = new Student();
        student.delete(id);
        student.insert(stu);
    }

    @Override
    public List<Student> getAllStudents(int pageNum, int pageSize) {
        return student.getAllStudents(pageNum,pageSize);
    }

}
