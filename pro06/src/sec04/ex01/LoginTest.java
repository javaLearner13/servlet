package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				request.setCharacterEncoding("utf-8"); // ...
				response.setContentType("text/html;charset=utf-8"); //need this so Korean letters show correctly
				PrintWriter out = response.getWriter();
				
				String id = request.getParameter("user_id");
				String pw = request.getParameter("user_pw");
//				String address = request.getParameter("user_address"); //secretly.. sensitive info
				
//				System.out.println("doHandle method called");
				System.out.println("id: "+id);
				System.out.println("pw: "+pw);
				
				if(id!=null&&(id.length()!=0)) {
					out.print("<html>");
					out.print("<body>");
					out.print("welcome, "+id);
					out.print("</body>");
					out.print("</html>");
				}else {
					out.print("<html>");
					out.print("<body>");
					out.print("enter your id");
					out.print("<br>");
					out.print("<a href='http://localhost:8090/pro06/test01/login.html'>to login window</a>");
					
					out.print("</body>");
					out.print("</html>");
				}
	}

}
