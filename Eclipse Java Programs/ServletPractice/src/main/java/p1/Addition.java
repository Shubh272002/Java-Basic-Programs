package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")

public class Addition extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int num1 = Integer.parseInt(req.getParameter("num1"));	
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = num1 + num2;
		Cookie cookie = new Cookie("num",num3+"");
		res.addCookie(cookie);
		res.sendRedirect("square");
		
//		PrintWriter out = res.getWriter();
//		out.print("Addition :"+num3);
		
//		res.sendRedirect("square?num3="+num3);
		
	}

}
