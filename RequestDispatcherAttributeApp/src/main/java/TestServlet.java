import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	pw.print("<h1>this is from frwd mechanism</h1>");
	System.out.println("request hashcode="+request.hashCode());
	System.out.println("response hashcode="+response.hashCode());
	System.out.println("printwriter hashcode="+pw.hashCode());
	pw.close();
}
	
}
