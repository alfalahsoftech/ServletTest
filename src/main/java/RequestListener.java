import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class RequestListener implements ServletRequestListener {




	public void requestDestroyed(ServletRequestEvent sre) {
		
		HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		try {
			req.getSession().invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" ##############33 Request destroyed");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println(" ##############33 Request Initiallized");
		HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		System.out.println(req.getSession(true).getId());
	}

	
}
