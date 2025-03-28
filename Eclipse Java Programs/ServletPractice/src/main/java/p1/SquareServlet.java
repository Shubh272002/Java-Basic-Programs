package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/square")

public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int num = Integer.parseInt(req.getParameter("num3"));
		
		Cookie[] cookie = req.getCookies();
		int num = 0;
		for(Cookie c : cookie) {
			if(c.getName().equals("num"));
			num= Integer.parseInt(c.getValue());
//		System.out.println(c.getValue());
		}
		PrintWriter out = res.getWriter();
		out.print("Addition: "+num);
		out.print("\nSquare: "+(num*num));
		
	}

}
