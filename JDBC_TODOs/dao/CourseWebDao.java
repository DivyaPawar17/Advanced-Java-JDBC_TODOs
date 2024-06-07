package it.education.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import it.education.entity.Course;
import it.education.utils.JdbcUtils;


public class CourseWebDao {
	public static boolean create(Course courseRef) {
		boolean veri =false;
		String sqlQuery = "insert into Course_Master values(?,?,?,?,?)";
		try (Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);) {
			int course_id = courseRef.getCourseId();
			String course_name = courseRef.getCourseName();
			String course_provider = courseRef.getCourseProvider();
			int course_duration = courseRef.getCourseHours();
			int course_fee = courseRef.getCourseFess();
			// setting data in place of unknown parameter
			pstmt.setInt(1, course_id);
			pstmt.setString(2, course_name);
			pstmt.setString(3, course_provider);
			pstmt.setInt(4, course_duration);
			pstmt.setInt(5, course_fee);

			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record inserted");
			
			if(updateCount == 1) {
				veri=true;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return veri;
		
	}
}
