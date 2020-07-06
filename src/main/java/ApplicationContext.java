import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.ws.rs.container.ContainerRequestContext;

@WebListener
public class ApplicationContext implements ServletContextListener{

	 @Override
	public void contextInitialized(ServletContextEvent sce) {
		 System.out.println("#############  Context Initialized  :)");
		 HitOtherApplication.hitApp();
	}
	 
	 @Override
	public void contextDestroyed(ServletContextEvent sce) {
		 HitOtherApplication.disConnect();
		 System.out.println("#############  Context Destroyed  (:");
	}
}
