package service;

import dao.StudentDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Mahsa Alikhani m-58
 */
public class SaveServlet extends HttpServlet {
    private StudentDao studentDao;

    public void init(){
        studentDao = new StudentDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int studentNumber = Integer.parseInt(request.getParameter("studentNumber"));
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String grade = request.getParameter("grade");
        String field = request.getParameter("field");
        String phoneNumber = request.getParameter("phoneNumber");
        long nationalNumber = Long.parseLong(request.getParameter("nationalNumber"));

        Student student = new Student();
        student.setStudentNumber(studentNumber);
        student.setName(name);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setGrade(grade);
        student.setField(field);
        student.setPhoneNumber(phoneNumber);
        student.setNationalNumber(nationalNumber);

        studentDao.saveNewStudent(student);

        out.print(studentNumber + " saved successfully.</p>");

    }
}
