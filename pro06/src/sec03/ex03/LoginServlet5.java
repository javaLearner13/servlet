package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet5
 */
@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8"); // ...
		response.setContentType("text/html;charset=utf-8"); //need this so Korean letters show correctly
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String address = request.getParameter("user_address"); //secretly.. sensitive info
		
		System.out.println("doHandle method called");
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		
		String data = "<html>";
		data += "<body>";
		data += "id: "+id;
				data +="<br>";
				data +="pw: "+pw;
				data +="<br>";
				data +="address: "+address;
				data +="</body>";
				data +="</html>";
				out.print(data);
	}

}
