import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 
 * You can hit by angular application or postman
 */
@WebServlet(urlPatterns= {"/login","/logout"},name="LoginLogout")
public class LoginLogout extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init======================");
		super.init();
	}
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dddddddddddddddddddddoooooooooooooooo"+req);

	
		resp.getWriter().append("{\"Method\":\"doGet\"}");


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("req========> "+req);
		String uname = req.getParameter("uname");
		String psw = req.getParameter("psw");
		
		System.out.println("uname: "+ uname);
		System.out.println("psw : " + psw);
		String credential = "{\"uname\":\""+uname+"\",\"psw\":\""+psw+"\"}";
		resp.getWriter().append(credential);
//		RequestDispatcher dispatcher= req.getRequestDispatcher("https://alfalahtech.herokuapp.com/");
		resp.sendRedirect("https://alfalahtech.herokuapp.com/");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doOptions========> "+req);
		resp.getWriter().append("{\"Method\":\"doHead\"}");
		
		
	}
	/*	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" #################  Requested at "+ LocalDateTime.now());
	System.out.println("service===================="+req.getMethod());


	}*/
	/*@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doOptions========> "+req);
		resp.getWriter().append("{\"Method\":\"doOption\"}");
	}*/

}
