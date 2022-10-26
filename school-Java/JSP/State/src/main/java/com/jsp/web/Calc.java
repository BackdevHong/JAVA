package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext app = request.getServletContext();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String v_ = request.getParameter("value");
		String op = request.getParameter("operator");
		
		int v = 0;
		
		if ( v_ != null && !v_.equals("")) {
			v = Integer.parseInt(v_);
		} else {
			out.println("<script>"
					+ "alert('값을 입력해주세요');"
					+ "history.go(-1)"
					+ "</script>");
		}
		
		if(op.equals("=")) {
			int x = (Integer)app.getAttribute("value");
			int y = v;
			int result = 0;
			String operator = (String)app.getAttribute("op");
			switch (operator) {
				case "+": {
					result = x + y;
					break;
				}
				case "-": {
					result = x - y; 
					break;
				}
			}
			out.println("result : " + result);
		} else {
			app.setAttribute("value", v);
			app.setAttribute("op", op);
			out.println("<script>"
					+ "history.go(-1);"
					+ "</script>");
		}
	}
}
