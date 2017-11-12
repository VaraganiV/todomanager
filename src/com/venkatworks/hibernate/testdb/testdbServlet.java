package com.venkatworks.hibernate.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Servlet implementation class testdbServlet
 */
@WebServlet("/testdbServlet")
public class testdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "todomanager";
		String pass = "todomanager";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/todomanager?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection to database
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting");
			
			Class.forName(driver);
			Connection myConn = (Connection) DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.print("Done.......");
			myConn.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
