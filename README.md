# Bus Route Management – Java GUI Application

This Java application simulates a bus station system, allowing users to view predefined routes between different cities in Romania such as **Suceava**, **Vaslui**, and **Târgu Neamț**. The project is built using **Java Swing** for the graphical user interface and follows an object-oriented design with clear separation between logic and interface.

## 🚍 Features

- Select and display information about different bus routes
- Visualize route details per city (departure time, stops, price, etc.)
- Modular and extensible route management using Factory Pattern
- Clean and responsive GUI with user interaction

## 🧱 Core Classes

- `Route` – abstract class defining the interface for all routes
- `SuceavaRoute`, `VasluiRoute`, `TarguNeamtRoute` – concrete route implementations
- `RouteFactory` – generates route objects based on city selection
- `BusStationGUI` – main graphical user interface with city selection and route info display

## 🛠 Technologies Used

- Java (JDK 17+)
- Swing (for desktop GUI)
- OOP (inheritance, polymorphism, factory pattern)

## 🚀 How to Run

1. Clone or download the repository
2. Open in your Java IDE (e.g., IntelliJ, Eclipse)
3. Compile and run `BusStationGUI.java`
4. Use the dropdown or button menu to choose a route and display details

## 📌 Use Cases

- Educational app to demonstrate OOP and GUI in Java
- Basic route selection system for bus terminals
- Extendable template for transportation scheduling simulations

## 👤 Author

Developed by Ștefan Atomulesei  
Bachelor project – Faculty of Automation and Computer Science  
Technical University of Iași (2025)
