package com.servlet;

import com.github.pagehelper.PageInfo;
import com.service.StuAndEmpManager;
import com.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class listStudnetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNum = Integer.valueOf(req.getParameter("page"));
        Integer pageSize = Integer.valueOf(req.getParameter("pageSize"));
        req.setAttribute("student",getApplicationContext(req,pageNum,pageSize));
        req.getRequestDispatcher("ListStudent.jsp").forward(req,resp);
    }



    public PageInfo<Student> getApplicationContext(HttpServletRequest request, Integer pageNum, Integer pageSize){
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        StuAndEmpManager stuAndEmpManager = context.getBean("service", StuAndEmpManager.class);
        List<Student> list = stuAndEmpManager.getAllStudents(pageNum,pageSize);
        PageInfo<Student> pageInfo = new PageInfo<>(list,3);
        return pageInfo;
    }
}
