import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class HitOtherApplication {
	static Timer timer = new Timer();
	public static void hitApp() {
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("aaaaaaaaaaa");
				try {
					URL url = new URL("https://alfalahtech.herokuapp.com/rest/UserService/dispStaff");
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					con.setRequestMethod("POST");
					con.setRequestProperty("Accept", "application/json");
					con.connect();
					InputStream is= con.getInputStream();
					
					BufferedReader bfri= new BufferedReader(new InputStreamReader(is));
					String output;
					
					while((output =bfri.readLine())!=null) {
						System.out.println(output);
					}
					con.disconnect();
					//timer.cancel();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		timer.schedule(task, 10,1000*60);
	}
	
	public static void disConnect() {
		if(Objects.nonNull(timer)) {
			timer.cancel();
		}
	}
	public static void main(String[] args) {
		hitApp();

	}
}
