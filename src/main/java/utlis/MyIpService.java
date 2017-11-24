package utlis;

import java.util.Map;

import com.google.gson.Gson;

public class MyIpService {

	private HttpDataService httpDataService;

	public MyIpService(HttpDataService httpDataService) {
		this.httpDataService = httpDataService;
	}

	public String getMyIp() {
		/*
		 * Le but ici est d'utilisé Mockito. Cela va servir a simulé une action afin de
		 * ne pas avoir de probleme. En effet on a A et B depend de A. Mais nous avons
		 * un probleme sur A nous ne pouvons pas y acceder car un probleme serveur ou
		 * autre chose de similaires. Nous simulons que il n'y a pas de probleme afin de
		 * pouvoir efectuer l'action que l'on veux avec B. Ainsi grace a mockito nous
		 * pouvons donc utilisé ce que l'on voulais sur B sans avoir besoin que A
		 * fonctionne (si A depend de quelque chose qui n'est pas accessible à l'instant
		 * present.
		 * 
		 * Par exemple ici on a besoin d'avoir notre IP mais probleme serveur donc grace
		 * a Mickito on simule que nous y accedons ce qui permettre de voir si notre
		 * test est bon est d epasse a l'etape suivante
		 */
		Gson gson = new Gson();
		String jsonIp = httpDataService.getJsonIp();
		Map<String, String> map = gson.<Map<String, String>>fromJson(jsonIp, Map.class);
		return map.get("ip").split(",")[0];
	}

}