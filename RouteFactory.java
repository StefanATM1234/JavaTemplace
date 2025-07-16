package template;

//Fabrica pentru creearae rutelor

public class RouteFactory {

	// Metoda pentru crearea rutei in functie de destinatie si timp

	public Route createRoute(String destination, String time) {
		switch (destination) {
		case "Targu Neamt":
			return new TarguNeamtRoute(time); // Creaza ruta pentru Targu-Neamt
		case "Suceava":
			return new SuceavaRoute(time); // Creaza ruta pentru Suceava
		case "Vaslui":
			return new VasluiRoute(time); // Creaza ruta pentru Vaslui
		default:
			throw new IllegalArgumentException("Invalid destination: " + destination);
		}
	}
}
