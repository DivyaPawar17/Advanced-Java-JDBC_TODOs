package it.education.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import it.education.dao.CourseWebDao;
import it.education.entity.Course;

/**
 * Servlet implementation class CreateCourseServlets
 */
@WebServlet(
		urlPatterns = {"/createNewCourse"},
		name ="myLoginServlet"
		)
public class CreateCourseServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String courseId = request.getParameter("course_id");
		String courseName = request.getParameter("course_name");
		String courseProvider = request.getParameter("course_provider");
		String courseDuration = request.getParameter("course_duration");
		String courseFees = request.getParameter("course_fees");
		int id = Integer.parseInt(courseId);
		int Duration = Integer.parseInt(courseDuration);
		int fees = Integer.parseInt(courseFees);
		Course newCourse = new Course(id, courseName, courseProvider, Duration, fees);
		
		System.out.println(newCourse);
		
		boolean rs = CourseWebDao.create(newCourse);
		System.out.println(rs);
		response.setContentType("text/html");//MIME type - Multipurpose Internet Extension
		PrintWriter out = response.getWriter();
		
		String responseText = "<h1>Not Updated</h1>";
		if(rs) {
			responseText = "<h1>Updated</h1>";
		}
		out.println(responseText);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
