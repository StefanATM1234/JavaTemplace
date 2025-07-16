package template;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Interfata grafica pentru statia de autobuz

public class BusStationGUI {
	private RouteFactory routeFactory;

	private JFrame frame;
	private JPanel panel;
	private JComboBox<String> destinationBox;
	private JComboBox<String> timeBox;

	// Constructorul clasei

	public BusStationGUI() {
		routeFactory = new RouteFactory(); // Initializarea fabricii de rute

		// Initializarea frame-ului si a pane-ului
		frame = new JFrame("Bus Station");
		panel = new JPanel();

		// Crearea componentelor GUI
		JLabel destinationLabel = new JLabel("Destination:");
		String[] destinations = { "-", "Targu Neamt", "Suceava", "Vaslui" };
		destinationBox = new JComboBox<>(destinations);

		JLabel timeLabel = new JLabel("Time:");
		String[] times = { "-", "13:00", "15:00", "19:00" };
		timeBox = new JComboBox<>(times);

		JButton confirmButton = new JButton("Confirm Reservation");
		JButton resetButton = new JButton("Reset");

		// Adaugarea componentelor la panou
		panel.add(destinationLabel);
		panel.add(destinationBox);
		panel.add(timeLabel);
		panel.add(timeBox);
		panel.add(confirmButton);
		panel.add(resetButton);

		// Adaugarea ascultatorilor de evenimente pentru butoane
		confirmButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String destination = (String) destinationBox.getSelectedItem(); // Obtinerea destinatiei
				String time = (String) timeBox.getSelectedItem(); // Obtinerea timpului

				// Crearea rutei folosind fabrica si afisarea confirmarii
				Route route = routeFactory.createRoute(destination, time);
				showConfirmation(route);
			}
		});

		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Reseteaza selectiile pentru destinatie si timp
				destinationBox.setSelectedIndex(0);
				timeBox.setSelectedIndex(0);
			}
		});

		// Adaugarea panoului la frame si setarea unor proprietati pentru frame
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// Metoda pentru afisarea unei fereste de confirmare
	private void showConfirmation(Route route) {
		String destination = route.getDestination();
		String time = route.getTime();

		JOptionPane.showMessageDialog(frame, "Reservation confirmed to " + destination + " at " + time,
				"Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
	}

	// Metoda principala pentru lansarea aplicatiei
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { // Asiguram executia in thread-ul de evenimente al GUI-lui.
			public void run() {
				new BusStationGUI();
			}
		});
	}
}
