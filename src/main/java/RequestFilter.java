import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter()
public class RequestFilter  implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("##########   RequestFilter       ");
		
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("RequestFilter_________iiiiiiiiiiiiiinnnnnnnnnnnnnnnnniiiiiiiiiiiiiiiitttttttt");
	
	}
	public void destroy() {
		System.out.println("RequestFilter____destroy");
	}

}
