import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter()
public class DashboardFilter  implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse)response;
		HttpServletRequest req = (HttpServletRequest)request;
		
		resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.addHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,DELETE,PUT");
		resp.setHeader("Access-Control-Allow-Headers","Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
				resp.setContentType("application/json");
		
		System.out.println("##########   DashboardFilter       ");
		System.out.println("Allow method : "+resp.getHeader("Allow"));
		req.getSession();
		chain.doFilter(request, response);
		
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("DashboardFilter_________iiiiiiiiiiiiiinnnnnnnnnnnnnnnnniiiiiiiiiiiiiiiitttttttt");
	
	}
	public void destroy() {
		System.out.println("DashboardFilter____destroy");
	}

}
