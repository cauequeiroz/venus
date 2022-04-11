package venus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/app")
public class AppServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Venus</title></head><body>");
		writer.println("<h1>App Page</h1>");
		writer.println("<p>Welcome to the first application page.</p>");
		writer.println("<p>Version 1.0.0</p>");
		writer.println("</body></html>");	
		
		System.out.println("Oi");
	}
}
