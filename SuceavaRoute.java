package template;

//Clasa specifica pentru ruta catre Suceava,implementeaza Interfata Route

public class SuceavaRoute implements Route {
	private String time;
	// Returneaza destinatia specifica pentru ruta catre Suceava

	public SuceavaRoute(String time) {
		this.time = time;
	}

	public String getDestination() {
		return "Suceava";
	}

	// Returneaza ora specifica pentru plecarea pe ruta catre Suceava

	public String getTime() {
		return time;
	}
}
