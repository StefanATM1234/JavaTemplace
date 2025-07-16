package template;
//Clasa specifica pentru ruta catre Vaslui,implementeaza Interfata Route

public class VasluiRoute implements Route {
	private String time;
	// Returneaza destinatia specifica pentru ruta catre Vaslui

	public VasluiRoute(String time) {
		this.time = time;
	}

	public String getDestination() {
		return "Vaslui";
	}

	// Returneaza ora specifica pentru plecarea pe ruta catre Vaslui

	public String getTime() {
		return time;
	}
}
