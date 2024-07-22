

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<h1>forward requestattributes</h1>");
		Enumeration <String> attributeNames=request.getAttributeNames();
		pw.print("<table border='1'>");
		pw.print("<tr><th>Name</th>");
		pw.print("<th>value</th></tr>");
		while(attributeNames.hasMoreElements()) {
			String name=(String) attributeNames.nextElement();
			Object value=request.getAttribute(name);
			pw.print("<tr><td>"+name+"</td>");
			pw.print("<td>"+value+"</td></tr>");
		}
		pw.close();
		
	}

	
}
