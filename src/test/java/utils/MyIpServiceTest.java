package utils;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

import utlis.HttpDataService;
import utlis.MyIpService;

public class MyIpServiceTest {
	private MyIpService myIpService;
	private HttpDataService httpServiceMock;
	private String ipUrl = "{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Resist the fascist corporate Trump administration\"}";
	private String ip = "92.154.66.22";

	@Before
	public void before() {
		httpServiceMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpServiceMock.getJsonIp()).thenReturn(ipUrl);
		myIpService = new MyIpService(httpServiceMock);
	}

	@Test
	public void testAddBracket() {
		assertEquals(ip, myIpService.getMyIp());
		Mockito.verify(httpServiceMock).getJsonIp();
	}
}