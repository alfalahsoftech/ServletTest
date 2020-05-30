import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@SuppressWarnings("serial")
@WebFilter()
public class LoginFilter implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LoginFilter_________dddddddddddddddfilter");
		chain.doFilter(request, response);


	}
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LoginFilter__________iiiiiiiiiiiiiinnnnnnnnnnnnnnnnniiiiiiiiiiiiiiiitttttttt");
	
	}
	public void destroy() {
		System.out.println("LoginFilter____destroy");
	}
}
