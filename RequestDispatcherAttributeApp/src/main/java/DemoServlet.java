import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/testServlet");
		rd.forward(request, response);
		System.out.println("this is after test servlet");
		pw.print("<h1>this output is from 1 st</h1>");
		System.out.println("request hashcode="+request.hashCode());
		System.out.println("response hashcode="+response.hashCode());
		System.out.println("printwriter hashcode="+pw.hashCode());
		pw.close();
	}

}
