package project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String course=request.getParameter("course");
		System.out.println(course);
		String branch=request.getParameter("branch");
		String rollNo=request.getParameter("rollNo");
		String name=request.getParameter("name");
		String fathertName=request.getParameter("fathertName");
		String gender=request.getParameter("gender");
		System.out.println(gender);
		MydbConnection mydb=new MydbConnection();
		try
		{ 
			Connection con=mydb.getMyconnection();
			System.out.println("1");
			PreparedStatement pre =con.prepareStatement("insert into student(rollNo,course,branch,s_name,fatherName,gender) values(?,?,?,?,?,?)");
		       
			    pre.setString(1, rollNo);
		        pre.setString(2, course);
		        pre.setString(3, branch);
		        pre.setString(4, name);
		        pre.setString(5, fathertName);
		        pre.setString(6, gender);
		        pre.executeUpdate();
		        System.out.println("23"+pre);
		       int a=3;
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.getStackTrace();
		    }
		response.sendRedirect("adminHome.jsp");
	}

}
