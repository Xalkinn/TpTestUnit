package utlis;

import java.io.IOException;

import org.junit.runner.Request;

public class HttpDataService {
	public static String url = "http://jsonip.com";

	public static String getJsonIp() {
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}