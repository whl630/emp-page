package com.dao;

import com.student.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int update(Student student);
    int delete(int id);
    Student getStudnetById(int id);
    int insert(Student student);
    List<Student> getAllStudents(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
