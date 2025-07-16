package template;

//Clasa specifica pentru ruta catre Targu-Neamt,implementeaza Interfata Route

public class TarguNeamtRoute implements Route {
	private String time;
	// Returneaza destinatia specifica pentru ruta catre Targu-Neamt

	public TarguNeamtRoute(String time) {
		this.time = time;
	}

	public String getDestination() {
		return "Targu Neamt";
	}

	// Returneaza ora specifica pentru plecarea pe ruta catre Targu-Neamt

	public String getTime() {
		return time;
	}
}
