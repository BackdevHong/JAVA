package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset='UTF-8'");
		
		PrintWriter out = response.getWriter();
		
		String op = request.getParameter("op");
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		
		int x = 0, y = 0;
		if(x_ != null && !x_.equals("")) {
			x = Integer.parseInt(x_);
		}
		if(y_ != null && !y_.equals("")) {
			y = Integer.parseInt(y_);
		}
		
		switch(op) {
		case "add":
			out.printf("%d + %d = %d", x, y, x+y);
			break;
		case "sub":
			out.printf("%d - %d = %d", x, y, x-y);
			break;
		case "multi":
			out.printf("%d X %d = %d", x, y, x*y);
			break;
		case "divide":
			if ( y == 0 ) {
				out.println("0으로 나눌 수 없습니다.");	
			} else {	
				out.printf("%d / %d = %d", x, y, x/y);
			break;
			}
		}
		
		
	}

}
